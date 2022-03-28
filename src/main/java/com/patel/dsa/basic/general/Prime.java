package com.patel.dsa.basic.general;

public class Prime {
    // Prime number is only divisible by 1 and itself
    static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
