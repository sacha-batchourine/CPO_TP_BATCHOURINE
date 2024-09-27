/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_batchourine;

import java.util.Random;
import java.util.Scanner;

/**Batchourine sacha
 *TDC
 * @author sachabatchourine
 */
public class TP1_stats_Batchourine {

    /**
     * @param args the command line arguments
     */
    
 
   
    public static void main(String[] args) {
        // Création d'un tableau de 6 entiers pour les faces du dé
        int[] facesDuDe = new int[6]; // Chaque case est initialisée à 0

        // Création du scanner pour la saisie utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir un nombre entier m
        System.out.print("Veuillez saisir un nombre entier m : ");
        int m = scanner.nextInt(); // Lecture du nombre entier saisi par l'utilisateur

        // Création du générateur de nombres aléatoires
        Random generateurAleat = new Random();

        // Boucle de m itérations
        for (int i = 0; i < m; i++) {
            // Tire un nombre aléatoire entre 0 et 5
            int nombreAleatoire = generateurAleat.nextInt(6); // Génère un nombre entre 0 et 5

            // Incrémente la case correspondante dans le tableau
            facesDuDe[nombreAleatoire]++;
        }

        // Affichage des résultats en pourcentages
        System.out.println("Résultat des faces du dé après " + m + " tirages (en pourcentages) :");
        for (int i = 0; i < facesDuDe.length; i++) {
            double pourcentage = (facesDuDe[i] / (double)m) * 100; // Calcul du pourcentage
            System.out.printf("Face %d: %.2f%%\n", (i + 1), pourcentage); // Affichage avec 2 décimales
        }

        // Fermeture du scanner
        scanner.close();
    }
}
    

