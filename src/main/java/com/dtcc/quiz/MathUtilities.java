package com.dtcc.quiz;

import java.util.Scanner;

public class MathUtilities {
    Scanner input = new Scanner(System.in);
    /**
     * Add two number together
     * @param baseValue first number
     * @param valueToAdd number
     * @return the sum of the two numbers
     */
    public Integer add(Integer baseValue, Integer valueToAdd){
        int sum = baseValue + valueToAdd;
        return sum;
    }

    /**
     * Add two number together
     * @param baseValue first number
     * @param valueToAdd second number
     * @return the sum of the two numbers
     */
    public Double add(Double baseValue, Double valueToAdd){
        double dSum = baseValue + valueToAdd;
        return dSum;
    }

    /**
     * Get half the value of the number
     * @param number the number given
     * @return the half of the number in double
     */
    public Double half(Integer number) {
      double halfNum = number/2;
        return halfNum;
    }

    /**
     * Determine if the number is odd
     * @param number the number given
     * @return true if the number is odd, false if it is even
     */
    public Boolean isOdd(Integer number){
        boolean odd = false;
        int i = input.nextInt();
        if(i % 2 == 0){
            return true;
        }else
       return false;
    }


    /**
     * Multiply the number by itself
     * @param number the number given
     * @return the result of the number multiply by itself
     */
    public Integer square(Integer number) {
        int num = input.nextInt();
        number *= number;
        return number;
    }
}
