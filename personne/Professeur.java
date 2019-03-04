package personne;


import personne.Employe;

public class Professeur extends Employe {

    private String specialite;

    public Professeur(String specialite, String nom, String prenom, double salaire) {
        super(nom, prenom, salaire);
        this.specialite = specialite;
    }    

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + "specialite=" + specialite + '}';
    }
    
    
}
