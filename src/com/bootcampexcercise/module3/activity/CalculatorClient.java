package com.bootcampexcercise.module3.activity;

public class CalculatorClient {
    public static void main(String[] args) {

        /*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
         *final variable defined in Calculator class.
         */
        Calculator normalCalculator = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using " + normalCalculator.getCalculatorType() + " calculator ***");

        // Add
        int result = normalCalculator.add(4, 5);
        System.out.println("1) Add result is " + result);

        // Multiply
        int[] mul = {2, 3, 4};
        //TODO Complete the code: result should be equal to the normalCalc multiply function and int array mul should be multiplied.
        // Solution
        result = normalCalculator.multiply(mul);
        System.out.println("2) Multiplication result is " + result);


        //Division
        //TODO Write code which will use normalCalc and divide function
        //TODO Divide numbers should be 10 and 2
        //TODO Divide result should be printed in similar style as multiply and addition
        // Solution
        result = normalCalculator.divide(10, 2);
        System.out.println("3) Divide result is " + result);

        //Subtraction
        //TODO Write code which will use normalCalc and subtract function
        //TODO Subtract numbers should be 10 and 2
        //TODO Subtract result should be printed in similar style as multiply and addition
        // Solution
        result = normalCalculator.subtract(10, 2);
        System.out.println("4) Subtract result is " + result);
    }
}
