package com.bootcampexcercise.module10.activity3;

public class Calculator {

    public double add(double a, double b) {
        return a+b;
    }

    public int add(int a, int b) {
        return a+b;
    }

    public double subtract(double a, double b) {
        return a-b;
    }

    public double divide(double a, double b) {
        double result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Couldn't perform division due to: " + e.getMessage());
        }

        return result;
    }

    // There is no invalid input for multiplication operation, so the code is stupid
    public double multiply(double a, double b) throws PointlessMultiplicationException {
        double result = 0;
        if (a == 1.0 || b == 1.0) {
            throw new PointlessMultiplicationException();
        }

        try {
            if (a == 1.0 || b == 1.0) {
                throw new PointlessMultiplicationException();
            }

            result = a * b;

        } catch (PointlessMultiplicationException e) {
            System.out.println("Multiplication thrown an exception: " + e.getMessage());
        } finally {
            result = a * b;
        }

        return result;
    }
}
