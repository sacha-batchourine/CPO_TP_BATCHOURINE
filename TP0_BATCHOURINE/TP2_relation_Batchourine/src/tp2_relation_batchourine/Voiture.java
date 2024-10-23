package tp2_relation_batchourine;


import tp2_relation_batchourine.Personne;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sachabatchourine
 */
public class Voiture {
    public String marque;
    public String modele;
    public Personne proprietaire; // Référence au propriétaire de la voiture

    // Constructeur
    public Voiture(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
        this.proprietaire = null; // Par défaut, la voiture n'a pas de propriétaire
    }

    // Méthode toString pour afficher les détails de la voiture
    @Override
    public String toString() {
        String proprietaireNom = (proprietaire != null) ? proprietaire.nom : "pas de propriétaire";
        return "Voiture{" + "marque='" + marque + '\'' + ", modele='" + modele + '\'' + ", proprietaire='" + proprietaireNom + '\'' + '}';
    }
}