package livres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author thibault
 */
public class ExoLivres {

    public static Livre creerLivre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le titre du livre n° " + (Livre.getId() + 1) + " ?");
        String titre = sc.nextLine();
        System.out.println("Donner l'auteur du livre n° " + (Livre.getId() + 1) + " ?");
        String auteur = sc.nextLine();
        System.out.println("Donner le prix du livre n° " + (Livre.getId() + 1) + " ?");
        int prix = sc.nextInt();
        Livre livre = new Livre(titre, auteur, prix);
        return livre;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Livre> livres = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            livres.add(creerLivre());
        }
        livres.forEach((livre) -> {
            System.out.println(livre.toString());
        });
        System.out.println("Le nombre de livre est "+Livre.getId());
    }

}
