package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    // la palabra final y static estaban invertidos en posicion.
    private final static int NUM_NOTES = 10;
    private final static int NUM_ALUMNES = 2;

    public static void main(String[] args) {

        // variables que utilitzarem
        int[] notes;
        Assignatura assignatura;
        ArrayList<Alumne> alumnes;
        Alumne alumne1;
        Alumne alumne2;

        // array per omplir amb notes
        notes = new int[NUM_NOTES];

        // instanciar alumnes
        alumne1 = new Alumne();
        alumne2 = new Alumne();

        // definir els seus atributs
        alumne1.setNom("A");
        alumne2.setNom("B");
        alumne1.setEdat(20);
        alumne2.setEdat(20);

        // llista dels alumnes de l'assignatura
        alumnes = new ArrayList<Alumne>();
        alumnes.add(alumne1);
        alumnes.add(alumne2);

        // definir notes aleatòriament
        for (int i = 0; i < NUM_ALUMNES; i++) {
            Alumne alumne = alumnes.get(i);
            notes = Alumne.crearNotesRandom(NUM_NOTES);
            alumne.setNotes(notes);
            alumnes.set(i, alumne);
        }

        // instanciar assignatura
        assignatura = new Assignatura("Entorns", alumnes);

        // obtenir millor alumne
        Alumne alumne = assignatura.millorAlumne();

        System.out.println("Millor alumnes: " + alumne.getNom());



    }
}
