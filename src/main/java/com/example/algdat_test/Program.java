package com.example.algdat_test;

import java.util.Arrays;

public class Program
{
    public static void main(String ... args)      // hovedprogram
    {
        char[] c = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = Tabell.maksHel(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

        System.out.println(c);
        Tabell.byttChar(c, 0, 5 );
        System.out.println(c);

        System.out.println(Arrays.toString(Tabell.antallNestMaks(a)));

        System.out.println(Arrays.toString(Tabell.nestMaksTurnering(a)));

    } // main

} // class Program