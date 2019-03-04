package lesGuerriers;

public class Pnj extends Humain {

    public Pnj(String nom) {
        super(nom);
    }

    @Override
    public void saluer(Avatar avatar) {
        System.out.println("Bonjour mon brave, voulez vous m'acheter quelque chose aujourd'hui "+avatar.getNom());
    }
    
    public void vendreUnePotion(Avatar client) {
        System.out.println("Voici une potion pour vous "+client.getNom());
        client.setPotions(+1);
        client.setGold(-20);
    }
}