package Personnages;
 
/**
*Batchourine Sacha TDC
* @author batchourinesacha
*/
public class Magicien extends Personnage {
    private boolean confirme;
 
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
    }
 
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
 
    public boolean isConfirme() {
        return confirme;
    }
}
