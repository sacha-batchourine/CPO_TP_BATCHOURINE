/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_batchourine;

/**
 *
 * @author sachabatchourine
 */
public class TP2_Bieres_Batchourine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    // Création d'objets BouteilleBiere
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");
    BouteilleBiere secondeBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
    BouteilleBiere troisiemeBiere = new BouteilleBiere("La Chouffe", 8.0f, "Brasserie Chouffe");
    BouteilleBiere quatriemeBiere = new BouteilleBiere("Heineken", 5.0f, "Brasserie d'Heineken");
    BouteilleBiere cinquiemeBiere = new BouteilleBiere("Desperados", 9.0f, "Alken-Maes");

    // Affichage des objets directement avec toString()
    System.out.println("Affichage initial des bouteilles :");
    System.out.println(uneBiere);
    System.out.println(secondeBiere);
    System.out.println(troisiemeBiere);
    System.out.println(quatriemeBiere);
    System.out.println(cinquiemeBiere);

    // Décapsuler certaines bouteilles
    System.out.println("\nDécapsulage de certaines bouteilles :");
    uneBiere.decapsuler();
    troisiemeBiere.decapsuler();
    cinquiemeBiere.decapsuler();

    // Affichage après décapsulage
    System.out.println("\nAffichage après décapsulage :");
    System.out.println(uneBiere);
    System.out.println(secondeBiere);  // Non décapsulée
    System.out.println(troisiemeBiere);
    System.out.println(quatriemeBiere);  // Non décapsulée
    System.out.println(cinquiemeBiere);
}
       
       
       
       
       
        
        
        
        

    }
    

