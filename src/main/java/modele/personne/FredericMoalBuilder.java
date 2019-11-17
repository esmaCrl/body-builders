package modele.personne;

import modele.PersonneBuilder;

import static modele.Personne.LINKEDIN;
import static modele.Personne.TWITTER;

public class FredericMoalBuilder extends PersonneBuilder {

    @Override
    public void buildIdentite() {
        personne.setPrenom("Frédéric");
        personne.setNom("Moal");
        personne.setAdresse("");
        personne.setEmail("frederic.moal@univ-orleans.fr");
        personne.setNumeroTelephone("");
        personne.setVille("Orléans");
    }

    @Override
    public void buildLinkedin() {
        personne.setContacts(LINKEDIN, "https://www.linkedin.com/in/frederic-moal-146437b/");
    }

    @Override
    public void buildTwitter() {
        personne.setContacts(TWITTER, "FredericMoal");
    }

    @Override
    public void buildFacebook() {

    }

    @Override
    public void buildInstagram() {

    }
}
