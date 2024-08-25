package com.example.algdat_test;

public class Oppgaver121 {
    public static void main(String[] args) {
        int[] tabell1 = {7, 4, 5, 1, 3, 6, 11, 8, 10, 44, 99, 46, 89, 55, 77};
        System.out.println(maks(tabell1, 2, 8));
        System.out.println(min(tabell1, 7, 14));
        System.out.println(maksHel(tabell1));
        System.out.println(minHel(tabell1));
        print(tabell1);
    }

    public static int maks(int[] a, int fra, int til){
        if (fra < 0 || til > a.length || fra >= til){
            throw new IllegalArgumentException("Illegalt intervall!");
        }
        int m = fra; // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];

        for (int i = fra + 1; i < til; i++){
            if (a[i] > maksverdi){
                m = i;
                maksverdi = a[m];
            }
        }
        return m;
    }

    public static int maksHel(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }

    public static int min(int[] a, int fra, int til){
        if (fra < 0 || til > a.length || fra >= til){
            throw new IllegalArgumentException("Illegalt intervall!");
        }
        int m = fra;
        int minverdi = a[fra];

        for (int i = fra + 1; i < til; i++) {
            if (a[i] < minverdi) {
                m = i;
                minverdi = a[m];
            }
        }
        return m;
    }

    public static int minHel(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }

    public static void print(int[] a){
        for (int i : a){
            System.out.print(i + " ");
        }
    }


}
