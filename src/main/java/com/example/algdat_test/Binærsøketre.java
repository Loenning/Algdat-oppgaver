package com.example.algdat_test;
// Klasse for noder som lagrer verdi og referanse til venstre og høyre barnenode
class Node{
    int verdi;
    Node venstre, høyre;

    public Node(int verdi) {
        this.verdi = verdi;
        venstre = høyre = null;
    }
}
public class Binærsøketre {
    Node rot;

    private Node leggTilRek(Node thisnode, int verdi){
        if(thisnode == null){
            return new Node(verdi);
        }

        if (verdi < thisnode.verdi){
            thisnode.venstre = leggTilRek(thisnode.venstre, verdi);
        } else if (verdi > thisnode.verdi) {
            thisnode.høyre = leggTilRek(thisnode.høyre, verdi);
        } else {
            return thisnode;
        }
        return thisnode;
    }

    public void leggTil(int verdi){
        rot = leggTilRek(rot, verdi);
    }

    public Binærsøketre (int[] tabell){
        int[] a = Tabell.randPerm(20);              // en tilfeldig tabell

        for(int k : a){ // Legger til alle tall i tabellen til treet
            leggTil(k);
        }
    }


    private boolean søkRekursjon(Node thisnode, int verdi){
        if (thisnode == null){
            return false;
        }
        if (verdi == thisnode.verdi){
            return true;
        }
        return verdi < thisnode.verdi ? søkRekursjon(thisnode.venstre, verdi) : søkRekursjon(thisnode.høyre, verdi);
    }

    public boolean søk(int verdi){
        return søkRekursjon(rot, verdi);
    }

}
