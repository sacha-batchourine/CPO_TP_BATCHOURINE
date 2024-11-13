package Arme;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author sachabatchourine
 */
public class Epee extends Arme {
    // Attribut spécifique à Epee
    private int finesse; // entier < 100

    // Constructeur
    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque); // Appel du constructeur de la classe mère Arme
        if (finesse < 100) {
            this.finesse = finesse;
        } else {
            this.finesse = 99; // Limite à 99 si dépassement
        }
    }

    // Méthode pour obtenir la finesse de l'épée
    public int getFinesse() {
        return finesse;
    }

    // Redéfinition de la méthode toString pour afficher les informations de l'épée
    @Override
    public String toString() {
        return super.toString() + ", Finesse: " + finesse;
    }
}