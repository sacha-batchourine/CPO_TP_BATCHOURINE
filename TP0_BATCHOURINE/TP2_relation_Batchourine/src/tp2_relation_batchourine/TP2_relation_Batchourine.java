/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_batchourine;

/**
 *
 * @author sachabatchourine
 */
public class TP2_relation_Batchourine {

    /**
     * @param args the command line arguments
     */
  
   
    public static void main(String[] args) {
        // Création de Bob
        Personne bob = new Personne("Martin", "Bob");

        // Création de deux voitures
        Voiture uneClio = new Voiture("Renault", "Clio");
        Voiture uneGolf = new Voiture("Volkswagen", "Golf");
        Voiture unePeugeot = new Voiture("Peugeot", "308");
        Voiture uneToyota = new Voiture("Toyota", "Corolla");

        // Essai d'ajouter les voitures à Bob
        System.out.println("Ajout de la Clio : " + bob.ajouter_voiture(uneClio)); // Devrait réussir
        System.out.println("Ajout de la Golf : " + bob.ajouter_voiture(uneGolf));   // Devrait réussir

        // Essayer d'ajouter une troisième voiture à Bob
        System.out.println("Ajout de la Peugeot : " + bob.ajouter_voiture(unePeugeot)); // Devrait réussir
        // Essayer d'ajouter une quatrième voiture à Bob
        System.out.println("Ajout de la Toyota : " + bob.ajouter_voiture(uneToyota)); // Devrait échouer

        // Création de Reno
        Personne reno = new Personne("Dupont", "Reno");

        // Essai d'ajouter deux voitures à Reno
        System.out.println("Ajout de la Toyota à Reno : " + reno.ajouter_voiture(uneToyota)); // Devrait échouer (déjà possédée par Bob)
        System.out.println("Ajout de la Peugeot : " + reno.ajouter_voiture(unePeugeot)); // Devrait échouer (déjà possédée par Bob)

        // Afficher les voitures de Bob
        System.out.println("\nLes voitures de " + bob.nom + " sont : ");
        for (int i = 0; i < bob.nombreVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        // Afficher les voitures de Reno
        System.out.println("\nLes voitures de " + reno.nom + " sont : ");
        for (int i = 0; i < reno.nombreVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
}