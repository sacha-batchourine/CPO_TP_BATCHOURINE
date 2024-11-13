/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_batchourine;

import Arme.Baton;
import Arme.Epee;
import Personnage.Magicien;
import Personnage.Guerrier;
import Personnage.Personnage;
import Personnage.*;
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
        Guerrier guerrier1 = new Guerrier("Conan", 80, true);
        Guerrier guerrier2 = new Guerrier("Lannister", 70, false);
        Magicien magicien1 = new Magicien("Gandalf", 65, true);
        Magicien magicien2 = new Magicien("Garcimore", 44, false);

        System.out.println("Nombre total de personnages : " + Personnage.getNombrePersonnages());
        System.out.println("Nombre de guerriers : " + Personnage.getNombreGuerriers());
        System.out.println("Nombre de magiciens : " + Personnage.getNombreMagiciens());

        guerrier1 = null;
        guerrier2 = null;
        magicien1 = null;
        magicien2 = null;

        // Le garbage collector est forcé (pour démonstration uniquement)
        System.gc();

        System.out.println("Nombre total de personnages (après suppression) : " + Personnage.getNombrePersonnages());
        System.out.println("Nombre de guerriers (après suppression) : " + Personnage.getNombreGuerriers());
        System.out.println("Nombre de magiciens (après suppression) : " + Personnage.getNombreMagiciens());
    }
}
}