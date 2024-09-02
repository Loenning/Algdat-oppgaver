package com.example.algdat_test;

import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] tabell = Tabell.randPerm(100);
        bytt(tabell, 0, tabell.length-1);
        System.out.println(Arrays.toString(tabell));
        quickSort(tabell);
        System.out.println(Arrays.toString(tabell));
    }

    public static void bytt(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bubbleSort(int[] tabell){
        for(int i = tabell.length-1; i > 0 ; i--){
            for (int j = 0; j < i; j++){
                if (tabell[j] > tabell[j+1]){
                    bytt(tabell, j, j+1);
                }
            }
        }
    }

    public static void quickSort(int[] tabell){
        quickSort(tabell,0, tabell.length-1);
    }

    public static void quickSort(int[] tabell, int fra, int til){
        if (fra >= til) return;
        //Vi må bytte skille til siste verdi i tabellen først. Bruker her bytt()-funksjonen.
        bytt(tabell, til, fra + (til-fra)/2); //Gjøres på denne måten for å unngå overflow hvor høyeste mulige tall i Java kan bli oversteget
        int skille = tabell[til];
        int v = fra, h = til-1;
        while(true){
            while(v <= h && tabell[v] < skille) v++;
            while (v <= h && tabell[h] > skille) h--;
            if (v >= h){
                break;
            }
            bytt(tabell, v++, h--);
        }
        bytt(tabell, til, v);
        quickSort(tabell, fra, v-1);
        quickSort(tabell, v+1, til);
    }



}


