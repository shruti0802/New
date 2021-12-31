package com.company;

import java.sql.SQLOutput;

public class Main{
    public static void main(String agrs[])
    {
        int IS_FULL_TIME=1;
        int EMP_RATE_PER_HR=2;
        int empHrs=0;
        int empWage=0;
        double empCheck= Math.floor(Math.random() * 10)%2;
        if(empCheck == IS_FULL_TIME)
            empHrs=8;
        else
            empHrs=0;
        empWage=empHrs* EMP_RATE_PER_HR;
            System.out.println("Emp Wage: " + empWage);

    }
}