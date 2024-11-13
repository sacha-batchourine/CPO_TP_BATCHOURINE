/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arme;

/**
 *
 * @author sachabatchourine
 */
public class Baton extends Arme {
    // Attribut spécifique à Baton
    private int age; // entier < 100

    // Constructeur
    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque); // Appel du constructeur de la classe mère Arme
        if (age < 100) {
            this.age = age;
        } else {
            this.age = 99; // Limite à 99 si dépassement
        }
    }

    // Méthode pour obtenir l'âge du bâton
    public int getAge() {
        return age;
    }

    // Redéfinition de la méthode toString pour afficher les informations du bâton
    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }
}
