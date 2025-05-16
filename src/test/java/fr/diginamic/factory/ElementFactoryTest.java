package fr.diginamic.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import fr.diginamic.entity.*;

class ElementFactoryTest {

    @Test
    public void testCreateIngredient() {
        TypeElement type = TypeElement.INGREDIENT;
        String nom = "Farine";
        double valeur = 100.0;
        Unite unite = Unite.MILLI_GRAMMES;

        Element element = ElementFactory.getElement(type, nom, valeur, unite);

        assertEquals("Farine", element.getNom());
        assertEquals(100.0, element.getValeur(), 0.001);
        assertEquals(Unite.MILLI_GRAMMES, element.getUnite());
    }

    @Test
    public void testCreateAllergene() {
        TypeElement type = TypeElement.ALLERGENE;
        String nom = "Gluten";
        double valeur = 0.5;
        Unite unite = Unite.MICRO_GRAMMES;

        Element element = ElementFactory.getElement(type, nom, valeur, unite);

        assertEquals("Gluten", element.getNom());
        assertEquals( 0.5, element.getValeur(), 0.001);
        assertEquals(Unite.MICRO_GRAMMES, element.getUnite());
    }

    @Test
    public void testCreateAdditif() {
        TypeElement type = TypeElement.ADDITIF;
        String nom = "E250";
        double valeur = 0.2;
        Unite unite = Unite.MICRO_GRAMMES;

        Element element = ElementFactory.getElement(type, nom, valeur, unite);

        assertEquals("E250", element.getNom());
        assertEquals(0.2, element.getValeur(), 0.001);
        assertEquals(Unite.MICRO_GRAMMES, element.getUnite());
    }

}