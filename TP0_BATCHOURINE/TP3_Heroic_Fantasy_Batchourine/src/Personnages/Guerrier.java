package Personnages;
 
/**
*Batchourine Sacha TDC
* @author batchourinesacha
*/
 
public class Guerrier extends Personnage {
    private boolean aCheval;
 
    public Guerrier(String nom, int niveauVie, boolean aCheval) {
        super(nom, niveauVie);
        this.aCheval = aCheval;
    }
 
    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }
 
    public boolean isACheval() {
        return aCheval;
    }
}