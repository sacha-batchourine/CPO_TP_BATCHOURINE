/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_batchourine;

import java.util.Scanner;
import static tp1_convertisseur_batchourine.TP1_convertisseur_Batchourine.CelsiusVersKelvin;

/**
 *
 * @author sachabatchourine
 */
public class TP1_convertisseur_Batchourine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        // Demande à l'utilisateur de saisir une température en degrés Celsius
        System.out.print("Bonjour, saisissez une valeur de température : ");
        double valeurTemperature = scanner.nextDouble();
        
        // Affichage du menu de conversion
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Celsius vers Fahrenheit");
        System.out.println("4) De Fahrenheit vers Celsius");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");
        
        // Lecture du choix de l'utilisateur
        System.out.print("Votre choix : ");
        int choix = scanner.nextInt();
        
        double resultat = 0.0;
        String messageResultat = "";
        int convertion = 0;

        switch (convertion) {
            case 1:
            {
                double valeurReel = 0;
                // Celsius vers Kelvin
                resultat = CelsiusVersKelvin(valeurReel);
            }
                break;

            case 2:
            {
                double valeurReel = 0;
                // Kelvin vers Celsius
                resultat = KelvinVersCelcius(valeurReel);
            }
                break;

            case 3: 
            {
                // Celsius vers Fahrenheit
                double valeurReel = 0;
                        resultat = FarenheitVersCelcius(valeurReel);
            }
                break;
            case 4:
                // Fahrenheit vers Celsius
            {
                double valeurReel = 0;
              resultat = CelciusVersFarenheit (valeurReel);
             }
                break;
            case 5:
            {
                // Kelvin vers Fahrenheit
                double valeurReel = 0;
              resultat = KelvinVersFarenheit (valeurReel);
            }
                break;
            case 6:
            {
                // Fahrenheit vers Kelvin
                double valeurReel = 0;
              resultat = FarenheitVersKelvin (valeurReel);
                
            }
                break;
            default:
                // Choix invalide
                messageResultat = "Choix invalide. Veuillez choisir un numéro entre 1 et 6.";
        
                break;
        
    
                
                
        // Fermeture du scanner
                    scanner.close();
        }
        
    }
   
    
    public static double CelsiusVersKelvin (double valeurReel){
       
    
        return valeurReel + 273.15;
    
}

    public static double KelvinVersCelcius( double valeurReel ){
        

        return valeurReel - 273.15;
    }
        
    public static double FarenheitVersCelcius (double valeurReel) {
        
        
        return valeurReel * 1.8 +32;
        
    }
    
    public static double CelciusVersFarenheit (double valeurReel){
        
        return valeurReel * 1.8 - 32;
    }
    
    public static double KelvinVersFarenheit (double valeurReel){
        
        return KelvinVersCelcius (CelciusVersFarenheit(valeurReel));
    }
    
    public static double FarenheitVersKelvin (double valeurReel){
        
        return FarenheitVersCelcius ( CelsiusVersKelvin (valeurReel));
    }
    
}      

