
import java.util.Scanner;

/*
 * Batchourine sacha
 /*TDC TP0 exo 3
package calculator;

/**
 *
 * @author sachabatchourine
 */
public class Calculator {
    public static void main(String[] args) {
        

        

        // Affichage du texte demandé
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        Scanner scanner = new Scanner(System.in);
        int operateur = scanner.nextInt();
        
        // Vérification si l'opérateur est entre 1 et 5
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: Invalid operator. Please choose a number between 1 and 5.");
            scanner.close(); // Fermeture du scanner
            return; // Sortie du programme
        }
        
        System.out.print("Please enter the first value: ");
        double operande1 = scanner.nextDouble(); // Utilise double pour les décimales si nécessaire

        // Demande à l'utilisateur une deuxième valeur
        System.out.print("Please enter the second value: ");
        double operande2 = scanner.nextDouble(); // Utilise double pour les décimales si nécessaire

        // Variable pour stocker le résultat
        double resultat = 0;

        // Calcul en fonction de l'opérateur
        switch (operateur) {
            case 1: // addition
                resultat = operande1 + operande2;
                break;
            case 2: // soustraction
                resultat = operande1 - operande2;
                break;
            case 3: // multiplication
                resultat = operande1 * operande2;
                break;
            case 4: // division
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                } else {
                    System.out.println("Error: Division by zero.");
                    scanner.close();
                    return; // Sortir si erreur
                }
                break;
            case 5: // modulo
                resultat = operande1 % operande2;
                break;
            default:
                System.out.println("Invalid operator.");
                scanner.close();
                return; // Sortir si opérateur invalide
        }

        // Fermer le scanner
        scanner.close();

        // Affichage du résultat
        System.out.println("The result is: " + resultat);
    }
}

