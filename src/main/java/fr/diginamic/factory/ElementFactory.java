package fr.diginamic.factory;

import fr.diginamic.entity.*;

public class ElementFactory {

    public static Element getElement(TypeElement type, String nom, double valeur, Unite unite) {
        if (type == null) {
            throw new IllegalArgumentException("Le type d'élément ne peut pas être null");
        }

        switch (type) {
            case INGREDIENT:
                return new Ingredient(nom, valeur, unite);
            case ALLERGENE:
                return new Allergene(nom, valeur, unite);
            case ADDITIF:
                return new Additif(nom, valeur, unite);
            default:
                throw new IllegalArgumentException("Type d'élément non supporté: " + type);
        }
    }
}