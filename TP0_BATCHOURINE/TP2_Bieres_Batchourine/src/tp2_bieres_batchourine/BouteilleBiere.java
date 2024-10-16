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
    String nom;           // Le nom de la bière
    float degreAlcool;    // Le degré d'alcool de la bière
    String brasserie;     // Le nom de la brasserie qui produit la bière
    boolean ouverte;      // Indique si la bouteille est ouverte ou non

    
        
        public BouteilleBiere(String unNom, float unDegre, String
    uneBrasserie) {
    nom = unNom;
    degreAlcool = unDegre;
    brasserie = uneBrasserie;
    ouverte = false;
    
    }

public void lireEtiquette() {
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
        
 
    }

public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte.");
            return false;
        
    }
}
}
