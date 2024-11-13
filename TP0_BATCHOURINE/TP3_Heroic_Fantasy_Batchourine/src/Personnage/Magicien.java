/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnage;

import Arme.Arme;
import Arme.Baton;
import Personnage.Personnage;

/**
 *
 * @author sachabatchourine
 */
public class Magicien extends Personnage {
    private boolean estConfirme;

    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
        incrementerNombreMagiciens();  // Incrémenter le nombre de magiciens
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            decrementerNombreMagiciens();  // Décrémenter le nombre de magiciens
        } finally {
            super.finalize();
        }
    }

    public boolean isEstConfirme() {
        return estConfirme;
    }

    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    @Override
    public String toString() {
        return super.toString() + ", Magicien confirmé: " + estConfirme;
    }

    @Override
    public String getDescription() {
        return "Magicien";
    }
}