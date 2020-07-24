package com.h2;

import java.time.LocalDate;
import java.time.YearMonth;

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
        for(float f:debits){
           sum=sum+f;
        }
        return sum;
    }
    private static int remainingDaysInMonth(LocalDate date){
        YearMonth yearMonth=YearMonth.of(date.getYear(),date.getMonth());
        int totalDaysInMonth=yearMonth.lengthOfMonth();
        int remainingDays=totalDaysInMonth-date.getDayOfMonth();
        return  remainingDays;
    }
    public float calculate(){
return 0;
    }
}
