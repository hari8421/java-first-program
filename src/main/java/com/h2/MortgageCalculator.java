package com.h2;

import java.text.DecimalFormat;

public class MortgageCalculator {
    private long loanAmount;
    private int termInYears;
    private float annualRate;
    private double monthlyPayment;

    public static void main( String[] args )
    {
        MortgageCalculator calculator=new MortgageCalculator(Long.parseLong(args[0]),Integer.parseInt(args[1]),Float.parseFloat(args[2]));
        calculator.calculateMonthlyPayment();
        System.out.println(calculator.toString());
    }
    public MortgageCalculator(long loanAmount,int termInYears,float annualRate ){
       this.annualRate=annualRate;
       this.loanAmount=loanAmount;
       this.termInYears=termInYears;
    }

    private int getNumberOfPayments(){
        return termInYears*12;
    }
    private float getMonthlyInterestRate(){
        float interestRate=annualRate/(100*12);
        return interestRate;
    }
    public void calculateMonthlyPayment(){
        long P=loanAmount;
        float r=getMonthlyInterestRate();
        int n=getNumberOfPayments();
        double M=P * (((r * Math.pow(1 + r, n))) / ((Math.pow((1 + r), n)) - 1));
        this.monthlyPayment=M;
    }

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("####0.00");
        return "monthlyPayment: " + df.format(monthlyPayment);

    }


}
