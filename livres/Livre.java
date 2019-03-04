package livres;

/**
 *
 * @author thibault
 */
public class Livre {
    private static int id = 0;
    private String titre;
    private String auteur;
    private int prix;

    public static int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    public Livre(String titre, String auteur, int prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        id++;
    }
    
    @Override
    public String toString() {
        String str = "Le prix du livre "+'"'+titre+'"'+" de l'auteur "+auteur+" est "+prix+" EURO";
        return str;
    }
}
