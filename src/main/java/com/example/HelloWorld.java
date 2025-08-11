package com.example;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        Calculator calc = new Calculator();
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("5 * 6 = " + calc.multiply(5, 6));
        System.out.println("15 / 3 = " + calc.divide(15, 3));
        System.out.println("2^3 = " + calc.power(2, 3));
    }
    
    public static class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        
        public int subtract(int a, int b) {
            return a - b;
        }
        
        public int multiply(int a, int b) {
            return a * b;
        }
        
        public double divide(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero is not allowed");
            }
            return (double) a / b;
        }
        
        public int power(int base, int exponent) {
            if (exponent < 0) {
                throw new IllegalArgumentException("Negative exponents not supported");
            }
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
            return result;
        }
        
        public double sqrt(double number) {
            if (number < 0) {
                throw new IllegalArgumentException("Cannot calculate square root of negative number");
            }
            return Math.sqrt(number);
        }
    }
}