package com.example.algdat_test;

public class Oppgaver114 {
    public static void main(String[] args) {

        //int[] tabell = {10, 5, 7, 2, 9, 1, 3, 8, 4, 6};
        //int[] tabell2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] tabell3 = {1, 3, 2, 7, 5, 9, 6, 8, 10, 4};

    }

    public static int maks(int[] a)   // versjon 2 av maks-metoden
    {
        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++) {
            if (a[i] > maksverdi) {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdateres
            }

        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks
}
