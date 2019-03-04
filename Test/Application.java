package Test;

import personne.Employe;
import personne.Etudiant;
import personne.Professeur;

public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employe kevin = new Employe("SAN MARTINO", "KEVIN", 5000.0);
       Employe thibault = new Employe("COUGRAND", "THIBAULT", 5000.0);
       Etudiant medhi = new Etudiant("DRUELLE", "MEDHI", "65678754");
       Etudiant ioanna = new Etudiant("TSOUKALAS", "IOANNA", "87543543");
       Professeur sabrina = new Professeur("JAVA/JEE", "POURCELOT", "SABRINA", 2000.0);
       Professeur pablo = new Professeur("Mathematiques", "BRUSSET", "PABLO", 1800.0);
    }

}
