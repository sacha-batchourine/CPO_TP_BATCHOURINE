/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Arme.Arme;
import Arme.Epee;
import Personnage.Personnage;

/**
 *
 * @author sachabatchourine
 */
public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
        incrementerNombreGuerriers();  // Incrémenter le nombre de guerriers
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            decrementerNombreGuerriers();  // Décrémenter le nombre de guerriers
        } finally {
            super.finalize();
        }
    }

    public boolean isACheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        return super.toString() + ", Guerrier à cheval: " + aCheval;
    }

    @Override
    public String getDescription() {
        return "Guerrier";
    }
}