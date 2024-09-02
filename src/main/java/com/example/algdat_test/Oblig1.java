package com.example.algdat_test;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    public static void main(String[] args) {
        //int [] test = Tabell.randPerm(10);               // Genrerer array med permutasjon av n-antall
        int[] test = Tabell.generateRandomArray(10, 10); // Genererer array med tilfeldige tall
        // int[] test = {};                                   // Genererer tom liste
        System.out.println(Arrays.toString(test));
        Quicksort.quickSort(test);                         // Sorterer listen i stigende rekkefølge for testing i oppgaver
        System.out.println(Arrays.toString(test));
        //System.out.println(antallUlikeSortert(test));        // Beregner antall ulike verdier som finnes i en sortert tabell
        System.out.println(antallUlikeSortert2(test));
        //System.out.println(antallUlikeUsortert(test));      /Beregner antall ulike verdier som finnes i en usortert tabell
        //System.out.println(maks(test));
        //System.out.println(Arrays.toString(test));
        //System.out.println("Antall ombyttinger er: " + ombyttinger(test));
        /*int total = 0;
        for(int i = 0; i<= 100; i++){
            int[] test = Tabell.randPerm(10);
            System.out.println("Antall ombyttinger er: " + ombyttinger(test));
            total+=ombyttinger(test);
        }
        System.out.println("Gjennomsnittlig antall ombyttinger på 100 gjennomkjøringer er: "+(total / 100)); */
    }

    public static int maks(int[] tabell){
        int n = tabell.length;
        if(n == 0){
            throw new NoSuchElementException("Tabell er tom");
        }
        for(int i = 0; i < tabell.length-1; i++){
            if(tabell[i] > tabell[i+1]){
                int temp = tabell[i];
                int temp2 = tabell[i+1];
                tabell[i] = temp2;
                tabell[i+1] = temp;
            }
        }
        return tabell[tabell.length-1];
    }
    // a) Antall sammenligninger vil alltid være = n-1. Siden dette stemmer for alle n, så vil algoritmen være av orden O(n)
    // b) Det blir færrest ombyttinger når tabellen er sortert fra minst til størst, hvor vi får 0 ombyttinger
    // c) Det blir flest ombyttinger når tabellen er omvendt sortert, fra størst til minst hvor vi får n-1 ombyttinger
    // d)
    public static int ombyttinger(int[] tabell){
        int antall = 0;
        int n = tabell.length;
        if(n == 0){
            throw new NoSuchElementException("Tabell er tom");
        }
        for(int i = 0; i < tabell.length-1; i++){
            if(tabell[i] > tabell[i+1]){
                antall++;
                int temp = tabell[i];
                int temp2 = tabell[i+1];
                tabell[i] = temp2;
                tabell[i+1] = temp;
            }
        }
        return antall;
    }

    // Oppgave 2
    public static int antallUlikeSortert(int[] a){
        int antall = 0;
        if(a.length == 0){
            return antall;
        }
        antall = 1;
        int verdi = a[0];
        for (int i = 0; i < a.length; i++){
            if (verdi != a[i]){
                antall++;
                verdi = a[i];
            }
        }
        return antall;
    }

    public static int antallUlikeSortert2(int[] a) {
        int antall = 0;
        if (a.length == 0) {
            return antall;
        }
        for (int i = 0; i < a.length; i++) {
            boolean erUnik = true;
            int verdi = a[i];
            for (int j = i+1; j < a.length; j++) {
                if (verdi == a[j]) {
                    erUnik = false;
                    break;
                }
            }
            if (erUnik){
                antall++;
            }
        }
        return antall;
    }

    // Oppgave 3
    public static int antallUlikeUsortert(int[] a) {
        int antall = 0;
        if (a.length == 0) {
            return antall;
        }
        for (int i = 0; i < a.length; i++) {
            boolean erUnik = true;
            int verdi = a[i];
            for (int j = i+1; j < a.length; j++) {
                if (verdi == a[j]) {
                    erUnik = false;
                    break;
                }
            }
            if (erUnik){
                antall++;
            }
        }
        return antall;
    }

    // Oppgave 4


}
