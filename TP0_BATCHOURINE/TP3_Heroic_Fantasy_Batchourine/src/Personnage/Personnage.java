package Personnage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sachabatchourine
 */
import Arme.Arme;
import java.util.ArrayList;

import java.util.ArrayList;

public abstract class Personnage {
    protected String nom;
    protected int niveauVie;
    
    // Propriétés statiques pour le comptage des personnages
    private static int nombrePersonnages = 0;
    private static int nombreGuerriers = 0;
    private static int nombreMagiciens = 0;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nombrePersonnages++;  // Incrémenter le nombre total de personnages
    }

    // Méthode finalize pour décrémenter le nombre total de personnages
    @Override
    protected void finalize() throws Throwable {
        try {
            nombrePersonnages--;  // Décrémenter le nombre total de personnages
        } finally {
            super.finalize();
        }
    }

    // Méthodes statiques pour obtenir les compteurs
    public static int getNombrePersonnages() {
        return nombrePersonnages;
    }

    public static int getNombreGuerriers() {
        return nombreGuerriers;
    }

    public static int getNombreMagiciens() {
        return nombreMagiciens;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Nom: " + nom + ", Niveau de vie: " + niveauVie;
    }
    
    protected static void incrementerNombreGuerriers() {
        nombreGuerriers++;
    }

    protected static void incrementerNombreMagiciens() {
        nombreMagiciens++;
    }
    
    protected static void decrementerNombreGuerriers() {
        nombreGuerriers--;
    }

    protected static void decrementerNombreMagiciens() {
        nombreMagiciens--;
    }
}