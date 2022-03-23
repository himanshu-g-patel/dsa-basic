package com.patel.dsa.search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 7, 18, 19, 70 }; // sorted array. Note binary search only works with sorted
        int target = 18; // this is the element need to find
        System.out.println("Binary Search: " + binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int lowerbound = 0;
        int upperbound = arr.length - 1;
        int midpoint = -1;
        while (lowerbound <= upperbound) {
            midpoint = (lowerbound + upperbound) / 2;
            if (arr[midpoint] == target) {
                return target;

            } else {

            }
        }
        return -1;
    }

}
