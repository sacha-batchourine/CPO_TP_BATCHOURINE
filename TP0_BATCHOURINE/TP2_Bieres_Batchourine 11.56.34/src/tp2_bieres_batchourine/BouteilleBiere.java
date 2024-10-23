/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_batchourine;

/**
 *
 * @author sachabatchourine
 */
public class BouteilleBiere {
    // Attributs de la classe BouteilleBiere
    String nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    // Constructeur
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    // Méthode pour lire l'étiquette de la bouteille
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bouteille
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("La bouteille a été décapsulée.");
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false;
        }
    }

    // Redéfinition de la méthode toString() pour un affichage personnalisé
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés)\nOuverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
}