package com.patel.dsa.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    @Test
    @DisplayName("Testing for non existing element")
    public void testNonExistentElement() {
        int arr[] = { 2, 4, 5, 6, 7, 18, 19, 70 }; // sorted array. Note binary search only works with sorted
        int target = 89; // this is the element need to find
        assertEquals(-1, BinarySearch.binarySearch(arr, target));
    }

    @Test
    @DisplayName("Testing for existing element")
    public void testExistingElement() {
        int arr[] = { 2, 4, 5, 6, 7, 18, 19, 70 }; // sorted array. Note binary search only works with sorted
        int target = 4; // this is the element need to find
        assertEquals(1, BinarySearch.binarySearch(arr, target));
    }
}
