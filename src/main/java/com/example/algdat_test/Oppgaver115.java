package com.example.algdat_test;

public class Oppgaver115 {
    public static void main(String[] args) {
        int[] tabell = {3};
        System.out.println(maks(tabell));
    }

    public static int maks(int[] a){
        int sist = a.length - 1; // Initaliserer variabel for indeks til siste tall i arrayet
        int m = 0; // Verdi for indeksen til maksverdi i arrayet
        int maksverdi = a[0]; // Verdien til maksverdi i arrayet
        int temp = a[sist]; // Temp verdi for å holde på siste verdi i arrayet
        a[sist] = 0x7fffffff; // Setter siste verdi i arrayet til høyeste tall

        for (int i = 0; ; i++){ //for-løkke med null sammenligning
            if (a[i] >= maksverdi) { //If-setning for sammenligning av indeksverdi og maksverdi
                if (i == sist){ //Dersom indeks = variabel sist som er arraylengde - 1
                    a[sist] = temp; //Så blir siste verdi holdt i temp-variabel lagt tilbake i arrayet
                    return temp >= maksverdi ? sist : m; //Returnerer enten sist eller m basert på om temp >= maksverdi er true eller false
                }
                else {
                    maksverdi = a[i]; //Setter ny maksverdi når a[i] >= maksverdi
                    m = i; //Oppdaterer indeksvariabelen m
                }
            }
        }
    }
}
