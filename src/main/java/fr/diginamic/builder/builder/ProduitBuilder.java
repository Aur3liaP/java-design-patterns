package fr.diginamic.builder.builder;

import fr.diginamic.builder.entity.*;

public class ProduitBuilder {
    private Produit produit;

    public ProduitBuilder() {
        this.produit = new Produit();
    }

    public ProduitBuilder appendNom(String nom) {
        this.produit.setNom(nom);
        return this;
    }

    public ProduitBuilder appendGrade(String grade) {
        this.produit.setGrade(grade);
        return this;
    }

    public ProduitBuilder appendCategorie(String nomCategorie) {
        this.produit.setCategorie(new Categorie(nomCategorie));
        return this;
    }

    public ProduitBuilder appendMarque(String nomMarque) {
        this.produit.setMarque(new Marque(nomMarque));
        return this;
    }

    public ProduitBuilder appendIngredient(String nomIngredient, double quantite) {
        this.produit.addIngredient(new Ingredient(nomIngredient, quantite));
        return this;
    }

    public ProduitBuilder appendAllergene(String nomAllergene, double quantite) {
        this.produit.addAllergene(new Allergene(nomAllergene, quantite));
        return this;
    }

    public ProduitBuilder appendAdditif(String nomAdditif, double quantite) {
        this.produit.addAdditif(new Additif(nomAdditif, quantite));
        return this;
    }

    public Produit build() {
        return this.produit;
    }
}
