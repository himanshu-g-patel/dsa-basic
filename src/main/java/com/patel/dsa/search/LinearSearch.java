package com.patel.dsa.search;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 19, 7, 18, 3 };
        int sortedArray[] = { 2, 4, 5, 6, 7, 18, 19, 3 };
        int target = 3;
        System.out.println("Linear Search With For Loop: " + linearSearchWithForLoop(arr, target));
        System.out.println("Linear Search with While Loop: " + linearSearchWithWhileLoop(arr, target));
        System.out.println(
                "Linear Search of Sorted Array with For Loop: " + linearSearchSortedArray(sortedArray, target));
    }

    public static int linearSearchWithForLoop(int arr[], int target) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("No of Steps: linearSearchWithForLoop");
            if (arr[i] == target) {
                index = i;
                return index;
            }
        }
        return index;
    }

    public static int linearSearchWithWhileLoop(int arr[], int target) {
        int index = -1;
        int i = 0;
        while (i < arr.length) {
            System.out.println("No of Steps: linearSearchWithWhileLoop");
            if (target == arr[i]) {
                index = i;
                return index;
            }
            i++;
        }
        return index;
    }

    public static int linearSearchSortedArray(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("No of Steps: linearSearchSortedArray");
            if (target == arr[i]) {
                return i;
            } else if (arr[i] > target) {
                return -1;
            }
        }
        return -1;
    }
}
