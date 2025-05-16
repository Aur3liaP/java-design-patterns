package fr.diginamic.builder.builder;

import static org.junit.jupiter.api.Assertions.*;

import fr.diginamic.builder.entity.*;
import org.junit.jupiter.api.Test;

class ProduitBuilderTest {

    @org.junit.jupiter.api.Test
    public void testCasNominal() {
        Produit produit = new ProduitBuilder()
                .appendNom("Chocolat au lait")
                .appendGrade("B")
                .appendCategorie("Chocolats")
                .appendMarque("Milka")
                .appendIngredient("Sucre", 30.5)
                .appendIngredient("Beurre de cacao", 20.0)
                .appendIngredient("Lait en poudre", 15.3)
                .appendAllergene("Lait", 15.3)
                .appendAdditif("E322", 0.5)
                .build();

        assertEquals("Chocolat au lait", produit.getNom());
        assertEquals("B", produit.getGrade());
        assertEquals("Chocolats", produit.getCategorie().getNom());
        assertEquals("Milka", produit.getMarque().getNom());

        assertEquals(3, produit.getIngredients().size());
        assertEquals("Sucre", produit.getIngredients().get(0).getNom());
        assertEquals(30.5, produit.getIngredients().get(0).getQteMilligrammes(), 0.001);
        assertEquals("Beurre de cacao", produit.getIngredients().get(1).getNom());
        assertEquals("Lait en poudre", produit.getIngredients().get(2).getNom());

        assertEquals(1, produit.getAllergenes().size());
        assertEquals("Lait", produit.getAllergenes().get(0).getNom());
        assertEquals(15.3, produit.getAllergenes().get(0).getQteMilligrammes(), 0.001);

        assertEquals(1, produit.getAdditifs().size());
        assertEquals("E322", produit.getAdditifs().get(0).getNom());
        assertEquals(0.5, produit.getAdditifs().get(0).getQteMilligrammes(), 0.001);
    }

    @Test
    public void testCasAlternatifs() {
        // Test avec seulement le nom
        Produit produitMinimal = new ProduitBuilder()
                .appendNom("Produit minimal")
                .build();

        assertEquals("Produit minimal", produitMinimal.getNom());
        assertNull(produitMinimal.getGrade());
        assertNull(produitMinimal.getCategorie());
        assertNull(produitMinimal.getMarque());
        assertTrue(produitMinimal.getIngredients().isEmpty());
        assertTrue(produitMinimal.getAllergenes().isEmpty());
        assertTrue(produitMinimal.getAdditifs().isEmpty());

        // Test avec des éléments répétés
        Produit produitAvecRepetitions = new ProduitBuilder()
                .appendNom("Produit avec répétitions")
                .appendIngredient("Farine", 100.0)
                .appendIngredient("Farine complète", 50.0)
                .appendIngredient("Farine", 25.0)
                .appendAllergene("Gluten", 150.0)
                .appendAllergene("Gluten", 50.0)
                .build();

        assertEquals("Produit avec répétitions", produitAvecRepetitions.getNom());
        assertEquals(3, produitAvecRepetitions.getIngredients().size());
        assertEquals(2, produitAvecRepetitions.getAllergenes().size());

        // Test avec un builder réutilisé pour un nouveau produit
        ProduitBuilder builder = new ProduitBuilder();

        Produit produit1 = builder
                .appendNom("Produit 1")
                .appendGrade("A")
                .build();

        assertEquals("Produit 1", produit1.getNom());
        assertEquals("A", produit1.getGrade());

        Produit produit2 = new ProduitBuilder()
                .appendNom("Produit 2")
                .appendGrade("C")
                .build();

        assertEquals("Produit 2", produit2.getNom());
        assertEquals("C", produit2.getGrade());

        // Vérification que produit1 n'a pas été modifié
        assertEquals("Produit 1", produit1.getNom());
        assertEquals("A", produit1.getGrade());
    }
}