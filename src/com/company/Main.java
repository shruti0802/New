package com.company;

import java.sql.SQLOutput;

public class Main{
    public static void main(String agrs[])
    {
        int IS_PART_TIME=1;
        int IS_FULL_TIME=2;
        int EMP_RATE_PER_HR=20;
        int empHrs=0;
        int empWage=0;
        double empCheck= Math.floor(Math.random() * 10)%3;
        if(empCheck == IS_PART_TIME)
            empHrs=4;
        else if (empCheck == IS_FULL_TIME)
            empHrs=8;
        else
            empHrs=0;
        empWage=empHrs* EMP_RATE_PER_HR;
        System.out.println("Emp Wage: " + empWage);

    }
}