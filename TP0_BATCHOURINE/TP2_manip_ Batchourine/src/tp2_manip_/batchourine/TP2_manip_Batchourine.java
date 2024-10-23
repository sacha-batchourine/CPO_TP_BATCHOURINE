/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_.batchourine;

/**
 *
 * @author sachabatchourine
 */
public class TP2_manip_Batchourine {

    /**
     * @param args the command line arguments
     */
    
    

    public static void main(String[] args) {
        // Création de deux tartiflettes avec des calories différentes
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        
        // Affichage avant l'inversion
        System.out.println("Avant inversion :");
        System.out.println("Assiette 1 calories : " + assiette1.nbCalories);
        System.out.println("Assiette 2 calories : " + assiette2.nbCalories);
        
        // Inversion des références
        Tartiflette temp = assiette1; // Stocke assiette1 dans une variable temporaire
        assiette1 = assiette2;        // Assigne assiette2 à assiette1
        assiette2 = temp;             // Assigne la variable temporaire (ancien assiette1) à assiette2

        // Affichage après l'inversion
        System.out.println("Après inversion :");
        System.out.println("Assiette 1 calories : " + assiette1.nbCalories);
        System.out.println("Assiette 2 calories : " + assiette2.nbCalories);
        
        
        // Création d'un tableau de 10 références de Moussaka
        Moussaka[] moussakas = new Moussaka[10];

        // Instanciation de 10 objets Moussaka avec des valeurs de calories différentes
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(200 + (i * 50)); // Exemple de calories : 200, 250, ..., 700
        }

        // Affichage des calories de chaque Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + (i + 1) + " a " + moussakas[i].nbCalories + " calories.");
        }
    }
}
    
