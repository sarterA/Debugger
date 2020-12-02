package com.company;

import java.util.ArrayList;

public class Assignatura {

    private String nom;

    private ArrayList<Alumne> alumnes = new ArrayList<Alumne>();


    public Assignatura(String nom, ArrayList<Alumne> alumnes) {
        this.nom = nom;
        this.alumnes = alumnes;
    }

    public Assignatura() {
    }

    public void nouMatriculat(Alumne alumne) {
        this.alumnes.add(alumne);
    }

    public void baixaAlumne(Alumne alumne) {
        this.alumnes.remove(alumne);
    }

    public Alumne millorAlumne() {
//El error estaba en esta linea que era: Alumne alumne = new alumne(); y habia que declarar el constructor.
        Alumne alumne = new Alumne("", 0 , new int[]{} );
        for (int i = 0; i < alumnes.size(); i++) {
            if (alumne.mitjanaNotes() > alumnes.get(i).mitjanaNotes()) {
                alumne = alumnes.get(i);
            }
        }
        return alumne;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAlumnes(ArrayList<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    public String getNom() {
        return nom;
    }

    public ArrayList<Alumne> getAlumnes() {
        return alumnes;
    }
}
