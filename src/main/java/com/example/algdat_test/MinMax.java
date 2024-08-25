package com.example.algdat_test;

import java.util.List;

public class MinMax {

    public static int maks(int[] a) {
        int m = 0; // indeks til største verdi
        int maksverdi = a[0]; // største verdi
        for (int i = 1; i < a.length; i++) if (a[i] > maksverdi)
        {
            maksverdi = a[i]; // største verdi oppdateres
            m = i; // indeks til største verdi oppdateres
        }
        return m; // returnerer indeks/posisjonen til største verdi
    } // maks
    public static void bytt(int[] a, int i, int j) {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

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

