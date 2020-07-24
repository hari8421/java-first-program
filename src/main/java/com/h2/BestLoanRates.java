package com.h2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BestLoanRates {
    public static final Map<Integer, Float> bestRates=Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);

    public static void main( String[] args )
    {
        float errorRange=0.000001f;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter your name");
       String name=scanner.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Enter the loan term (in years)");
        int loanTermInYears=scanner.nextInt();
        float bestRate=getRates(loanTermInYears);
        if(Math.abs(bestRate-0.0f)<errorRange){
            System.out.println("No available rates for term:  "+loanTermInYears);
        }else{
            System.out.println("Best Available Rate: :  "+bestRate+ "%");
        }
        scanner.close();
    }
    public static float getRates(int loanTermInYears ){
        if(bestRates.containsKey(loanTermInYears)){
return bestRates.get(loanTermInYears);
        }else{
            return 0.0f;
        }

    }


}
