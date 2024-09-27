/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_.batchourine;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sachabatchourine
 */
public class TP1_guessMyNumber_Batchourine {

    /**
     * @param args the command line arguments
     */
    
       

    


    



 
   
       
  
    public static void main(String[] args) {
        // Création du générateur de nombres aléatoires
        Random generateurAleat = new Random();
        Scanner scanner = new Scanner(System.in);
        
        // Demander le niveau de difficulté
        System.out.println("Choisissez votre niveau de difficulté :");
        System.out.println("1. Facile (0 à 10, 10 tentatives)");
        System.out.println("2. Normal (0 à 50, 7 tentatives)");
        System.out.println("3. Difficile (0 à 100, 5 tentatives)");
        int choixDifficulte = scanner.nextInt();
        
        int limiteInferieure = 0;
        int limiteSuperieure = 0;
        int tentativesMax = 0;

        // Définir les limites et le nombre de tentatives selon le choix de l'utilisateur
        switch (choixDifficulte) {
            case 1: // Facile
                limiteSuperieure = 10;
                tentativesMax = 10;
                break;
            case 2: // Normal
                limiteSuperieure = 50;
                tentativesMax = 7;
                break;
            case 3: // Difficile
                limiteSuperieure = 100;
                tentativesMax = 5;
                break;
            default:
                System.out.println("Choix de difficulté invalide. Par défaut, facile est sélectionné.");
                limiteSuperieure = 10;
                tentativesMax = 10;
                break;
        }

        // Génération d'un nombre aléatoire selon les limites
        int nombreAleatoire = generateurAleat.nextInt(limiteSuperieure + 1);

        int nombreUtilisateur = -1; // Initialiser la valeur avec une valeur hors du champ valide
        int compteurTentatives = 0; // Compteur pour suivre le nombre de tentatives

        // Boucle tant que l'utilisateur n'a pas deviné le bon nombre et n'a pas épuisé ses tentatives
        while (nombreUtilisateur != nombreAleatoire && compteurTentatives < tentativesMax) {
            // Demande de saisie utilisateur
            System.out.print("Veuillez entrer un nombre entre " + limiteInferieure + " et " + limiteSuperieure + " : ");
            nombreUtilisateur = scanner.nextInt();
            compteurTentatives++; // Incrémente le compteur à chaque tentative

            // Comparaison du nombre saisi avec le nombre aléatoire
            if (nombreUtilisateur < nombreAleatoire) {
                if (nombreAleatoire - nombreUtilisateur > 5) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (nombreUtilisateur > nombreAleatoire) {
                if (nombreUtilisateur - nombreAleatoire > 5) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            }
        }

        // Si l'utilisateur trouve le bon nombre
        if (nombreUtilisateur == nombreAleatoire) {
            System.out.println("Gagné ! Vous avez trouvé le nombre en " + compteurTentatives + " tentatives.");
        } else {
            System.out.println("Désolé, vous avez épuisé vos tentatives. Le nombre à trouver était " + nombreAleatoire + ".");
        }

        // Fermeture du scanner
        scanner.close();
    }
}
    