package com.patel.dsa.basic.general;

public class Prime {
    // Prime number is only divisible by 1 and itself
    static boolean isPrime(int num) {
        int counter = 1;
        for (int i = 2; i < num; i++) {
            System.out.println("Loop execution counter:  " + counter);
            counter++;
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
