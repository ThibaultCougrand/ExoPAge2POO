package lesGuerriers;

public class Voleur extends Avatar {

    public Voleur(String nom) {
        super(nom);
        super.setVie(150);
        super.setVieMax(150);
        super.setPuissance(40);
        super.setMagie(0);
    }
    
    @Override
    public void saluer(Avatar avatar) {
        System.out.println("Bonjour, que vous me semblez beau aujourd'hui "+avatar.getNom());
        avatar.setGold(-1);
        this.setGold(+1);
    }
    
    @Override
    public void attaquer(Avatar adversaire) {
        int coupCritique = (int) (Math.random()*10 + 1);
        System.out.println("Coup de dague dans le dos");
        if (coupCritique < 3) {
            adversaire.setVie(adversaire.getVie()-(this.getPuissance()*2));
            System.out.println("Coup critique !!");
        } else {
            adversaire.setVie(adversaire.getVie()-this.getPuissance());
        }   
        System.out.println(adversaire.getVie());
    }
}
