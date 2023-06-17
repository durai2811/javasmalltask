package com.intereface.demo;

import java.util.Arrays;

public class SortingAlgorithmComparison {
	public static void main(String[] args) {
        int[] array = {5, 2, 8, 12, 1, 7};

        long startTime, endTime, executionTime;

        // Bubble Sort
        int[] bubbleSortArray = array.clone();
        startTime = System.currentTimeMillis();
        bubbleSort(bubbleSortArray);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Bubble Sort Execution Time: " + executionTime + " milliseconds");

        // Merge Sort
        int[] mergeSortArray = array.clone();
        startTime = System.currentTimeMillis();
        mergeSort(mergeSortArray);
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Merge Sort Execution Time: " + executionTime + " milliseconds");
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] array) {
        if (array.length <= 1) {
            return;
        }
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
