/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_.batchourine;

/**
 *
 * @author sachabatchourine
 */
import java.util.Scanner;

public class TP2_convertisseurObjet_Batchourine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Convertisseur convertisseur = new Convertisseur();  // Un seul objet convertisseur ici

        int choix;
        boolean continuer = true;

        // Boucle de menu
        while (continuer) {
            // Affichage du menu
            System.out.println("Menu de conversion :");
            System.out.println("1. Celsius vers Kelvin");
            System.out.println("2. Kelvin vers Celsius");
            System.out.println("3. Celsius vers Fahrenheit");
            System.out.println("4. Fahrenheit vers Celsius");
            System.out.println("5. Kelvin vers Fahrenheit");
            System.out.println("6. Fahrenheit vers Kelvin");
            System.out.println("7. Quitter");
            System.out.print("Choisissez une conversion : ");
            choix = scanner.nextInt();  // Récupère le choix de l'utilisateur

            double tempEntree, tempConvertie;
            switch (choix) {
                case 1:
                    // Conversion Celsius vers Kelvin
                    System.out.print("Entrez la température en Celsius : ");
                    tempEntree = scanner.nextDouble();
                    tempConvertie = convertisseur.CelsiusVersKelvin(tempEntree);
                    System.out.println(tempEntree + "°C est égal à " + tempConvertie + "K");
                    break;
                case 2:
                    // Conversion Kelvin vers Celsius
                    System.out.print("Entrez la température en Kelvin : ");
                    tempEntree = scanner.nextDouble();
                    tempConvertie = convertisseur.KelvinVersCelsius(tempEntree);
                    System.out.println(tempEntree + "K est égal à " + tempConvertie + "°C");
                    break;
                case 3:
                    // Conversion Celsius vers Fahrenheit
                    System.out.print("Entrez la température en Celsius : ");
                    tempEntree = scanner.nextDouble();
                    tempConvertie = convertisseur.CelsiusVersFahrenheit(tempEntree);
                    System.out.println(tempEntree + "°C est égal à " + tempConvertie + "°F");
                    break;
                case 4:
                    // Conversion Fahrenheit vers Celsius
                    System.out.print("Entrez la température en Fahrenheit : ");
                    tempEntree = scanner.nextDouble();
                    tempConvertie = convertisseur.FahrenheitVersCelsius(tempEntree);
                    System.out.println(tempEntree + "°F est égal à " + tempConvertie + "°C");
                    break;
                case 5:
                    // Conversion Kelvin vers Fahrenheit
                    System.out.print("Entrez la température en Kelvin : ");
                    tempEntree = scanner.nextDouble();
                    tempConvertie = convertisseur.KelvinVersFahrenheit(tempEntree);
                    System.out.println(tempEntree + "K est égal à " + tempConvertie + "°F");
                    break;
                case 6:
                    // Conversion Fahrenheit vers Kelvin
                    System.out.print("Entrez la température en Fahrenheit : ");
                    tempEntree = scanner.nextDouble();
                    tempConvertie = convertisseur.FahrenheitVersKelvin(tempEntree);
                    System.out.println(tempEntree + "°F est égal à " + tempConvertie + "K");
                    break;
                case 7:
                    // Quitter
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;
                default:
                    // Choix non valide
                    System.out.println("Choix non valide, veuillez réessayer.");
                    break;
            }

            // Affichage du nombre total de conversions effectuées après chaque opération
            if (choix >= 1 && choix <= 6) {
                System.out.println("Nombre total de conversions effectuées : " + convertisseur);
            }
        }

        scanner.close();  // Fermeture du scanner
    }
}