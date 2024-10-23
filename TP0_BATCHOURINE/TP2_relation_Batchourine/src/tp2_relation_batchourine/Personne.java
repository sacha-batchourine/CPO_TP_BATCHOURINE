package tp2_relation_batchourine;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sachabatchourine
 */
   public class Personne {
    public String nom;
    public String prenom;
    public Voiture[] liste_voitures; // Tableau pour stocker jusqu'à 3 voitures
    public int nombreVoitures; // Nombre de voitures possédées

    // Constructeur
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.liste_voitures = new Voiture[3]; // Réservation de mémoire pour 3 voitures
        this.nombreVoitures = 0; // Initialisation à 0 voiture
    }

    // Méthode pour ajouter une voiture
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        // Vérification si la voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Cette voiture a déjà un propriétaire !");
            return false; // La voiture est déjà possédée
        }
        
        // Vérification si la personne a déjà 3 voitures
        if (nombreVoitures >= 3) {
            System.out.println("Limite de voitures atteinte !");
            return false; // Limite de 3 voitures atteinte
        }

        // Ajout de la voiture
        liste_voitures[nombreVoitures] = voiture_a_ajouter; // Ajouter la voiture
        nombreVoitures++; // Incrémenter le nombre de voitures
        voiture_a_ajouter.proprietaire = this; // Mettre à jour le propriétaire de la voiture
        return true; // Ajout réussi
    }

    // Méthode toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Personne{").append("nom='").append(nom).append('\'')
                .append(", prenom='").append(prenom).append('\'')
                .append(", voitures={");
        for (int i = 0; i < nombreVoitures; i++) {
            sb.append(liste_voitures[i]);
            if (i < nombreVoitures - 1) {
                sb.append(", ");
            }
        }
        sb.append("}}");
        return sb.toString();
    }
}
