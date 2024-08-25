package com.example.algdat_test;

import java.util.Arrays;

public class Oppgaver113 {
    public static void main(String[] args) {
        int[] tabell = {8, 5, 2};
        int fakVerdi = 5;
        System.out.println(Arrays.toString(minmaks(tabell)));
        System.out.println(fak(fakVerdi));

    }
    public static int[] minmaks(int[] a){
        int maksPosisjon = 0, maksVerdi = a[0];
        int minPosisjon = 0, minVerdi = a[0];

        int verdi = 0;

        for (int i = 1; i < a.length; i++){
            verdi = a[i];

            if (verdi > maksVerdi) {maksVerdi = verdi; maksPosisjon = i;}
            else if (verdi < minVerdi) {minVerdi = verdi; minPosisjon = i;}
            }

        return new int[]{minPosisjon, maksPosisjon};
    }

    public static long fak(int n){

        if(n < 0){
            throw new IllegalArgumentException("n < 0");
        }
        long fak = 1;
        for (int i = 2; i<= n; i++){
            fak *= i;
        }
        return fak;
    }
}

