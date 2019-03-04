package lesGuerriers;

public abstract class Avatar extends Humain {

    private int vie;
    
    private int vieMax;

    private int puissance;

    private int magie;

    private int potions = 2;

    private float gold = 100;

    public Avatar(String nom) {
        super(nom);
    }

    public int getVie() {
        return vie;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public int getVieMax() {
        return vieMax;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getMagie() {
        return magie;
    }

    public void setMagie(int magie) {
        this.magie = magie;
    }

    public int getPotions() {
        return potions;
    }

    public void setPotions(int potions) {
        this.potions = potions;
    }

    public float getGold() {
        return gold;
    }

    public void setGold(float gold) {
        this.gold = gold;
    }

    public void boirUnePotion() {
        if (potions > 0) {
            potions -= 1;
            vie += 100;
        } else {
            System.out.println("Vous n'avez plus de potions");
        }
    }

    public void mort(Avatar adversaire) {
        adversaire.setGold(+this.gold);
        this.setGold(0);
    }

    abstract public void attaquer(Avatar adversaire);
}
