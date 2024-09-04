package models;

public class Personne {
private String nom;
private String prenom;
private String rue;
private String localite;
private int npa;
public Personne(String nom, String prenom, String rue, String localite, int npa) {
    nom = null;
    prenom = null;
    rue = null;
    localite = null;
    npa = 0;
}
public String getNom() {
    return nom;
}
public String getPrenom() {
    return prenom;
}
public String getRue() {
    return rue;
}
public String getLocalite() {
    return localite;
}
public int getNpa() {
    return npa;
}

@Override
public String toString() {
    
    return toString(prenom + " " + nom +" adresse : " +rue +" " +localite +"" );
}


}
