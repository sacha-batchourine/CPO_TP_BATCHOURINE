/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_batchourine;

import arme.Arme;
import arme.Baton;
import arme.Epee;
import java.util.ArrayList;

/**
 *
 * @author sachabatchourine
 */
public class TP3_Heroic_Fantasy_Batchourine {

    /**
     * @param args the command line arguments
     */
   

public class Main {
    public static void main(String[] args) {
        // Création des épées et des bâtons
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        // Création du tableau dynamique d'armes
        ArrayList<Arme> armes = new ArrayList<>();

        // Ajout des armes dans le tableau dynamique
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        // Affichage des caractéristiques de chaque arme
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
    }
}
    
}
