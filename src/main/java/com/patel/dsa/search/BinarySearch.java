package com.patel.dsa.search;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int lowerbound = 0;
        int upperbound = arr.length - 1;
        int midpoint = -1;
        while (lowerbound <= upperbound) {
            midpoint = (lowerbound + upperbound) / 2;
            if (target == arr[midpoint]) {
                return midpoint;

            } else if (target < arr[midpoint]) {
                upperbound = midpoint - 1;
            } else if (target > arr[midpoint]) {
                lowerbound = midpoint + 1;
            }
        }
        return -1;
    }

}
