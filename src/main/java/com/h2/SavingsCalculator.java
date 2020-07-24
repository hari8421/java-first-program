package com.h2;

public class SavingsCalculator {
   private float[] credits;
    private float[] debits;
    public SavingsCalculator(float[] credits,float[] debits){
       this.credits=credits;
       this.debits=debits;
    }
    private float sumOfCredits(){
        float sum=0.0f;
        for(float f:credits){
            sum=sum+f;
        }
        return sum;
    }
    private float sumOfDebits(){
        float sum=0.0f;
        for(float f:credits){
           sum=sum+f;
        }
        return sum;
    }
    private static int remainingDaysInMonth(LocalDate date){
        return -1;
    }
}
