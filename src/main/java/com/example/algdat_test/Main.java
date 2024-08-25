package com.example.algdat_test;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 8, 5, 1};

        // Find the index of the maximum value
        int maxIndex = MinMax.maks(numbers);
        System.out.println("Index of maximum value: " + maxIndex);

        // Print the original array
        System.out.print("Original array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Swap the first and maximum value
        MinMax.bytt(numbers, 0, maxIndex);

        // Print the modified array
        System.out.print("Modified array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}