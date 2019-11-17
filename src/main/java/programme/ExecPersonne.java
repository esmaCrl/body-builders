package programme;

import modele.*;
import modele.personne.FredericMoalBuilder;
import modele.personne.YohanBoichutBuilder;

public class ExecPersonne {
     public static void main(String[] args) {

            Serveur serveur = new Serveur();
            PersonneBuilder yb = new YohanBoichutBuilder();
            PersonneBuilder fm = new FredericMoalBuilder();

            serveur.setPersonneBuilder(yb);
            serveur.constructPersonne();
            Personne personne = serveur.getPersonne();
            System.out.println(personne);

            serveur.setPersonneBuilder(fm);
            serveur.constructPersonne();
            personne = serveur.getPersonne();
            System.out.println(personne);
        }
}
