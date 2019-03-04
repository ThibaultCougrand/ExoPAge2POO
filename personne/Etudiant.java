package personne;

public class Etudiant extends Personne {

    private String cne;

    public Etudiant(String nom, String prenom, String cne) {
        super(nom, prenom);
        this.cne = cne;
    }

    public String getCne() {
        return cne;
    }

    public void setCne(String cne) {
        this.cne = cne;
    }

    @Override
    public String toString() {
        return super.toString()+ "cne=" + cne + '}';
    } 
}
