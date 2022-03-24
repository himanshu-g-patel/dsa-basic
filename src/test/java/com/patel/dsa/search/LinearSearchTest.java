package com.patel.dsa.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {
    int arr[] = { 2, 4, 5, 19, 7, 18, 3 };
    int sortedArray[] = { 2, 4, 5, 6, 7, 18, 19, 21 };

    @Test
    @DisplayName("Existing element in the unsorted array")
    void testLinearSearchExistingElementUnsortedArray() {
        assertEquals(2, LinearSearch.linearSearchWithForLoop(arr, 5));
    }

    @Test
    @DisplayName("Non existing element in the unsorted array")
    void testLinearSearchNonExistingElementUnsortedArray() {
        assertEquals(-1, LinearSearch.linearSearchWithForLoop(arr, 20));
    }

    @Test
    @DisplayName("Existing element in the sorted array")
    void testLinearSearchExistingElementSortedArray() {
        assertEquals(2, LinearSearch.linearSearchSortedArray(sortedArray, 5));
    }

    @Test
    @DisplayName("Non existing element in the sorted array")
    void testLinearSearchNonExistingElementSortedArray() {
        assertEquals(-1, LinearSearch.linearSearchSortedArray(sortedArray, 20));
    }
}
