package modele;

import java.util.HashMap;
import java.util.Map;

public class Personne {

    public final static String LINKEDIN = "LinkedIn";
    public final static String TWITTER = "Twitter";
    public final static String FACEBOOK = "Facebook";
    public final static String INSTAGRAM = "Instagram";

    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private String email;
    private String numeroTelephone;

    private Map<String, String> contacts = new HashMap<>();

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumeroTelephone(String numeroTelephone) {
        this.numeroTelephone = numeroTelephone;
    }

    public void setContacts(String nomReseau, String id) {
        this.contacts.put(nomReseau, id);
    }

    public String toString() {
        return prenom + " " + nom + ", " + contacts + ", "  + "ville : "  + ville + ", email : " + email;
    }
}
