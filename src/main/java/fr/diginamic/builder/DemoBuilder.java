package fr.diginamic.builder;

import fr.diginamic.builder.builder.ProduitBuilder;
import fr.diginamic.builder.entity.*;

public class DemoBuilder {
    public static void main(String[] args) {
        Produit chocolat = new ProduitBuilder()
                .appendNom("Tablette de chocolat noir")
                .appendGrade("A")
                .appendCategorie("Chocolats")
                .appendMarque("Lindt")
                .appendIngredient("Cacao", 70.0)
                .appendIngredient("Sucre", 28.5)
                .appendIngredient("Beurre de cacao", 1.0)
                .appendAllergene("Fruits à coque", 0.5)
                .appendAdditif("Lécithine de soja", 0.5)
                .build();

        System.out.println("Produit créé : " + chocolat.getNom());
        System.out.println("Grade : " + chocolat.getGrade());
        System.out.println("Catégorie : " + chocolat.getCategorie().getNom());
        System.out.println("Marque : " + chocolat.getMarque().getNom());

        System.out.println("\nIngrédients :");
        for (Ingredient ingredient : chocolat.getIngredients()) {
            System.out.println("- " + ingredient.getNom() + " : " + ingredient.getQteMilligrammes() + "mg");
        }

        System.out.println("\nAllergènes :");
        for (Allergene allergene : chocolat.getAllergenes()) {
            System.out.println("- " + allergene.getNom() + " : " + allergene.getQteMilligrammes() + "mg");
        }

        System.out.println("\nAdditifs :");
        for (Additif additif : chocolat.getAdditifs()) {
            System.out.println("- " + additif.getNom() + " : " + additif.getQteMilligrammes() + "mg");
        }
    }
}
