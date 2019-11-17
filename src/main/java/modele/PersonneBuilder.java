package modele;

public abstract class PersonneBuilder {

    protected Personne personne;

    public Personne getPersonne() {
        return personne;
    }

    public void createNewPersonne() {
        personne = new Personne();
    }

    public abstract void buildIdentite();
    public abstract void buildLinkedin();
    public abstract void buildTwitter();
    public abstract void buildFacebook();
    public abstract void buildInstagram();
}
