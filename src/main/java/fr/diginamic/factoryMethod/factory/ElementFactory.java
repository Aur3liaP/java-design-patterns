package fr.diginamic.factoryMethod.factory;

import fr.diginamic.factoryMethod.entity.*;
import fr.diginamic.factoryMethod.entity.*;

public class ElementFactory implements IElementFactory {

    @Override
    public Element getInstance(TypeElement type, String nom, double valeur, Unite unite) {
        if (type == null) {
            throw new IllegalArgumentException("Le type d'élément ne peut pas être null");
        }

        return switch (type) {
            case INGREDIENT -> new Ingredient(nom, valeur, unite);
            case ALLERGENE -> new Allergene(nom, valeur, unite);
            case ADDITIF -> new Additif(nom, valeur, unite);
            default -> throw new IllegalArgumentException("Type d'élément non supporté: " + type);
        };
    }
}