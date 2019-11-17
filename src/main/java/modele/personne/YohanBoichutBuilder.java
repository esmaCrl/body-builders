package modele.personne;

import modele.PersonneBuilder;

import static modele.Personne.LINKEDIN;

public class YohanBoichutBuilder extends PersonneBuilder {

    @Override
    public void buildIdentite() {
        personne.setPrenom("Yohan");
        personne.setNom("Boichut");
        personne.setAdresse("");
        personne.setEmail("yohan.boichut@univ-orleans.fr");
        personne.setNumeroTelephone("");
        personne.setVille("Orléans");
    }

    @Override
    public void buildLinkedin() {
        personne.setContacts(LINKEDIN, "https://www.linkedin.com/in/yohan-boichut-b0695b24/");
    }

    @Override
    public void buildTwitter() {

    }

    @Override
    public void buildFacebook() {

    }

    @Override
    public void buildInstagram() {

    }
}
