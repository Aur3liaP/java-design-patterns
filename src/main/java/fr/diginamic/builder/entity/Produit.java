package fr.diginamic.builder.entity;

import java.util.ArrayList;
import java.util.List;

public class Produit {
    private String nom;
    private String grade;
    private Categorie categorie;
    private Marque marque;
    private List<Ingredient> ingredients;
    private List<Allergene> allergenes;
    private List<Additif> additifs;

    public Produit() {
        this.ingredients = new ArrayList<>();
        this.allergenes = new ArrayList<>();
        this.additifs = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Marque getMarque() {
        return marque;
    }

    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Allergene> getAllergenes() {
        return allergenes;
    }

    public void setAllergenes(List<Allergene> allergenes) {
        this.allergenes = allergenes;
    }

    public List<Additif> getAdditifs() {
        return additifs;
    }

    public void setAdditifs(List<Additif> additifs) {
        this.additifs = additifs;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void addAllergene(Allergene allergene) {
        this.allergenes.add(allergene);
    }

    public void addAdditif(Additif additif) {
        this.additifs.add(additif);
    }

}
