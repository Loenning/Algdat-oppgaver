package com.example.algdat_test;

import java.util.Arrays;

public class BST_Program {
    public static void main(String[] args) {
        int[] tabell = Tabell.randPerm(30);
        System.out.println(Arrays.toString(tabell));
        Binærsøketre bt = new Binærsøketre(tabell);

        System.out.println(bt.søk(20));
        System.out.println(bt.søk(37));

    }
}
