package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Alumne extends ArrayList<Alumne> {

    private String nom;
    private int edat;
    private int[] notes;


    public Alumne(String nom, int edat, int[] notes) {
        this.nom = nom;
        this.edat = edat;
        this.notes = notes;


    }

    public Alumne(){}

    public double mitjanaNotes() {
        int total = 0;
        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }
        return total / (double)notes.length;
    }

    public static int[] crearNotesRandom(int n) {
        int[] notes = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            notes[i] = r.nextInt(10);
        }
        return notes;
    }



    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setNotes(int[] notes){ this.notes = notes;}

    public String getNom() { return this.nom;}

    public int getEdat() {
        return this.edat;
    }

    public int[] getNotes() {
        return this.notes;
    }


}
