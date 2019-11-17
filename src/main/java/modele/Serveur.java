package modele;

public class Serveur {

    private PersonneBuilder personneBuilder;

    public void setPersonneBuilder(PersonneBuilder pb) {
        personneBuilder = pb;
    }

    public Personne getPersonne() {
        return personneBuilder.getPersonne();
    }

    public void constructPersonne() {
        personneBuilder.createNewPersonne();
        personneBuilder.buildIdentite();
        personneBuilder.buildLinkedin();
        personneBuilder.buildTwitter();
        personneBuilder.buildFacebook();
        personneBuilder.buildInstagram();
    }
}