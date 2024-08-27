package com.example.algdat_test;
class Node{
    int verdi;
    Node venstre, høyre;

    public Node(int verdi) {
        this.verdi = verdi;
        venstre = høyre = null;
    }
}
class BST{
    Node rot;

    public BST(){
        rot = null;
    }

    void insert(int verdi){
        rot = insertRec(rot, verdi);
    }

    Node insertRec(Node rot, int verdi){
        if (rot == null){
            rot = new Node(verdi);
            return rot;
        }
        if(verdi < rot.verdi){
            rot.venstre = insertRec(rot.venstre, verdi);
        } else if (verdi > rot.verdi) {
            rot.høyre = insertRec(rot.høyre, verdi);
        }
        return rot;
    }

    public void rekkefølge(){
        rekkefølgeRec(rot);
        System.out.println("\n");
    }

    public void rekkefølgeRec(Node rot){
        if (rot != null){
            rekkefølgeRec(rot.venstre);
            System.out.print(rot.verdi + " ");
            rekkefølgeRec(rot.høyre);
        }
    }
}

public class Binærsøketre {
    public static void main(String[] args) {
        BST treet = new BST();

        treet.insert(50);
        treet.insert(30);
        treet.insert(20);
        treet.insert(40);
        treet.insert(70);
        treet.insert(60);
        treet.insert(80);

        System.out.println("Traversering i rekkefølge:");
        treet.rekkefølge();
    }
}
