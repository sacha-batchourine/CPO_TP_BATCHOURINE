/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_batchourine;

import java.util.Scanner;

/**
 *
 * @author sachabatchourine
 */
public class TP1_manipNombresInt_Batchourine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir le premier entier
        System.out.print("Veuillez saisir le premier entier : ");
        int premierEntier = scanner.nextInt();
        
        // Demande à l'utilisateur de saisir le deuxième entier
        System.out.print("Veuillez saisir le deuxième entier : ");
        int deuxiemeEntier = scanner.nextInt();
        
        // Affiche les entiers saisis à l'écran
        System.out.println("Le premier entier saisi est : " + premierEntier);
        System.out.println("Le deuxième entier saisi est : " + deuxiemeEntier);
        
        // Calcul et affichage de la somme, de la différence et du produit
        int somme = premierEntier + deuxiemeEntier;
        int difference = premierEntier - deuxiemeEntier;
        int produit = premierEntier * deuxiemeEntier;
        Double quotient = ( premierEntier * 1.0 ) / deuxiemeEntier;
        Double reste = ( premierEntier * 1.0 ) % deuxiemeEntier;
        
        System.out.println("La somme des deux entiers est : " + somme);
        System.out.println("La différence entre les deux entiers est : " + difference);
        System.out.println("Le produit des deux entiers est : " + produit);
        
        // Fermeture du scanner
        scanner.close();
    }
    
}

