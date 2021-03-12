package com.knoldus;

public class ProductionGenerator {

    public int multiplication(int num1,int num2) {
        int result = 1;
        for (int i = num2; i >= num1; i--) {
            result *= i;

            return result;
        }
        return result;

    }


    public int createProduction(int n1,int n2){
        if (Character.isDigit(n1) && Character.isDigit(n2)){
            Production production = (lowerBound, upperBound) -> lowerBound == upperBound ? lowerBound :multiplication(lowerBound, upperBound);
            return production.generateFunction(n1,n2);
        }
        else {
            throw new NumberFormatException("Invalid Number");
        }
        //throw new IllegalArgumentException("demo");
    }

}


