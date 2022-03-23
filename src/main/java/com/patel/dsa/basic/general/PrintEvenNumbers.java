package com.patel.dsa.basic.general;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        System.out.println("Executing Print even numbers");
        printEvenNumbers();
        System.out.println("Executing Print even numbers optimized");
        printEvenNumbersOptimized();

    }

    public static void printEvenNumbers() {
        int loopCounter = 0;
        int number = 2;
        while (number <= 100) {
            loopCounter = loopCounter + 1;
            System.out.println("Loop Counter::" + loopCounter);
            if (number % 2 == 0) {
                System.out.println("Even Number::" + number);
            }
            number = number + 1;
        }

    }

    public static void printEvenNumbersOptimized() {
        int loopCounter = 0;
        int number = 2;
        while (number <= 100) {
            loopCounter = loopCounter + 1;
            System.out.println("Loop Counter::" + loopCounter);
            if (number % 2 == 0) {
                System.out.println("Even Number::" + number);
            }
            number = number + 2;
        }

    }

}
