package lesGuerriers;

public class Guerrier extends Avatar {
    
    public Guerrier(String nom) {
        super(nom);
        super.setVie(200);
        super.setVieMax(200);
        super.setPuissance(50);
        super.setMagie(0);
    }
    
    @Override
    public void saluer(Avatar avatar) {
        System.out.println("Arg "+avatar.getNom());
    }

    @Override
    public void attaquer(Avatar adversaire) {
        System.out.println("Gros coup d'épée dans ta gueule!!");
        adversaire.setVie(adversaire.getVie()-this.getPuissance());
        System.out.println(adversaire.getVie());
    }
}
