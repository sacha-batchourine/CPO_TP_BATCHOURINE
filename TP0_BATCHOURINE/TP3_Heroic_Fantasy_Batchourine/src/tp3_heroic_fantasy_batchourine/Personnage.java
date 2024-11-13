/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_batchourine;

/**
 *
 * @author sachabatchourine
 */
public abstract class Personnage {
    // Attributs
    private String nom;
    private int niveauVie;

    // Constructeur
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    // Méthode pour obtenir le niveau de vie
    public int getNiveauVie() {
        return niveauVie;
    }

    // Méthode pour obtenir le nom du personnage
    public String getNom() {
        return nom;
    }

    // Méthode toString redéfinie pour afficher les informations du personnage
    @Override
    public String toString() {
        return "Personnage: " + nom + ", Niveau de vie: " + niveauVie;
    }
}
