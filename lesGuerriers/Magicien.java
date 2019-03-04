package lesGuerriers;

public class Magicien extends Avatar {

    public Magicien(String nom) {
        super(nom);
        super.setVie(150);
        super.setVieMax(150);
        super.setPuissance(50);
        super.setMagie(100);
    }

    @Override
    public void saluer(Avatar avatar) {
        System.out.println("Hello, sir "+avatar.getNom());
    }
    
    @Override
    public void attaquer(Avatar adversaire) {
        System.out.println("Boule de feu!!");
        adversaire.setVie(adversaire.getVie()-(this.getPuissance()+20));
        this.setMagie(this.getMagie()-30);
        System.out.println(this.getMagie());
        System.out.println(adversaire.getVie());
    }
}
