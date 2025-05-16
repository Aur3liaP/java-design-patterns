package fr.diginamic.entity;

public abstract class Element {
    private String nom;
    private double valeur;
    private Unite unite;

    public Element(String nom, double valeur, Unite unite) {
        this.nom = nom;
        this.valeur = valeur;
        this.unite = unite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public Unite getUnite() {
        return unite;
    }

    public void setUnite(Unite unite) {
        this.unite = unite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Element{");
        sb.append("nom='").append(nom).append('\'');
        sb.append(", valeur=").append(valeur);
        sb.append(", unite=").append(unite);
        sb.append('}');
        return sb.toString();
    }
}