package lesGuerriers;

import java.util.Scanner;

/**
 *
 * @author thibault
 */
public class MainGuerriers {

    static Scanner sc = new Scanner(System.in);

    public static String ouiNon(String phrase) {
        boolean verifOuiNon = true;
        String choix = "";
        System.out.println(phrase);
        while (verifOuiNon) {
            System.out.println("Saisissez 'oui' ou 'non'.");
            choix = sc.nextLine().toLowerCase();
            if (choix.equals("oui") || choix.equals("non")) {
                verifOuiNon = false;
            } else {
                System.out.println("Votre saisi n'est pas valide.");
            }
        }
        return choix;
    }

    public static Avatar creationPersonnage() {
        String name = choisirUnNom();
        Avatar joueur = null;
        boolean verifClass = true;
        while (verifClass) {
            System.out.println("Veuillez choisir une classe à votre personnage.");
            System.out.println("guerrier, voleur, magicien");
            String saisie = sc.nextLine().toLowerCase();
            switch (saisie) {
                case "guerrier": joueur = new Guerrier(name);
                    verifClass = false;
                    break;
                case "voleur": joueur = new Voleur(name);
                    verifClass = false;
                    break;
                case "magicien": joueur = new Magicien(name);
                    verifClass = false;
                    break;
            }
        }
        return joueur;
    }

    public static String choisirUnNom() {
        boolean verifName = true;
        String name = "";
        while (verifName) {
            System.out.println("Comment souhaitez vous appeler votre personnage ?");
            name = sc.nextLine();
            String reponse = ouiNon("Etes vous sur de vouloir l'appeler " + name + " ?");
            if (reponse.equals("oui")) {
                verifName = false;
            }
        }
        return name;
    }

    public static void scenario(Avatar joueur) {
        boolean verifSaisie = true;
        while (verifSaisie) {
            System.out.println("Que voulez vous faire ?");
            System.out.println("combat, magasin");
            String saisie = sc.nextLine().toLowerCase();
            switch (saisie) {
                case "combat": choixAdversaire(joueur);
                    verifSaisie = false;
                    break;
                case "magasin":
                    verifSaisie = false;
                    break;
            }
        }
    }

    public static void choixAdversaire(Avatar joueur) {
        Avatar adversaire = null;
        boolean verifClass = true;
        while (verifClass) {
            System.out.println("Contre qui voulez vous combattre ?");
            System.out.println("guerrier, voleur, magicien");
            String saisie = sc.nextLine().toLowerCase();
            switch (saisie) {
                case "guerrier": adversaire = new Guerrier("Benjy");
                    verifClass = false;
                    break;
                case "voleur": adversaire = new Voleur("Justine");
                    verifClass = false;
                    break;
                case "magicien": adversaire = new Magicien("Ruben");
                    verifClass = false;
                    break;
            }
        }
        combat(joueur, adversaire);
    }

    public static void combat(Avatar joueur, Avatar adversaire) {
        boolean jeux = true;
        while (jeux) {
            tourJoueur(joueur, adversaire);
            if (checkMort(adversaire, joueur) == false) {
                jeux = false;
                break;
            }
            tourAdversaire(adversaire, joueur);
            jeux = checkMort(joueur, adversaire);
        }
    }

    public static void tourJoueur(Avatar joueur, Avatar adversaire) {
        System.out.println("C'est à " + joueur.getNom() + " de jouer");
        boolean verifSaisi = true;
        while (verifSaisi) {
            System.out.println("Que doit faire " + joueur.getNom() + " ?");
            System.out.println("attaquer, potion");
            String saisie = sc.nextLine();
            switch (saisie) {
                case "attaquer": joueur.attaquer(adversaire);
                    verifSaisi = false;
                    break;
                case "potion":
                    if (joueur.getPotions() > 0) {
                        joueur.boirUnePotion();
                        System.out.println("GlouGlou");
                        verifSaisi = false;
                    } else {
                        System.out.println("Vous n'avez plus de potions");
                    }
                    break;
            }
        }
    }

    public static void tourAdversaire(Avatar adversaire, Avatar joueur) {
        System.out.println("C'est à " + adversaire.getNom() + " de jouer");
        if (adversaire.getVie() < ((adversaire.getVieMax()/ 100) * 30) && adversaire.getPotions() > 0) {
            adversaire.boirUnePotion();
            System.out.println("GlouGlou");
        } else {
            adversaire.attaquer(joueur);
        }
    }

    public static boolean checkMort(Avatar joueur, Avatar adversaire) {
        boolean mort;
        if (joueur.getVie() < 1) {
            joueur.mort(adversaire);
            System.out.println(joueur.getNom() + " est mort");
            mort = false;
        } else {
            mort = true;
        }
        return mort;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean jeux = true;
        Avatar joueur = creationPersonnage();
        while (jeux) {
            scenario(joueur);
            if (joueur.getVie() < 1) {
                jeux = false;
            }
        }
        System.out.println("Game Over");

    }

}
