/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

    

package tp3_heroic_fantasy_batchourine;
 
/**
*Batchourine Sacha TDC
* @author batchourinesacha
*/
import Personnages.Guerrier;
import Personnages.Magicien;
import Armes.*;
import Personnages.*;
public class TP3_Heroic_Fantasy_Batchourine {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des armes
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
 
        // Création des personnages
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Guerrier conan = new Guerrier("Conan", 78, false);
 
        // Gestion des armes
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(durandal);
        conan.ajouterArme(excalibur);
        conan.ajouterArme(charme);
 
        // Sélection d'armes
        gandalf.choisirArme("Chêne");
        conan.choisirArme("Excalibur");
 
        // Combat
        conan.attaquer(gandalf);
        System.out.println(gandalf);
        System.out.println(conan);
 
        // Vérifier si les personnages sont vivants après le combat
        System.out.println("Gandalf est vivant? " + gandalf.estVivant());
        System.out.println("Conan est vivant? " + conan.estVivant());
    }
}