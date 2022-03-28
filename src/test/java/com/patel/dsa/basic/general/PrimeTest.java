package com.patel.dsa.basic.general;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PrimeTest {
    @Test
    void testIsPrime() {
        assertTrue(Prime.isPrime(7));
    }

    @Test
    void testIsNotPrime() {
        assertFalse(Prime.isPrime(8));
    }
}
