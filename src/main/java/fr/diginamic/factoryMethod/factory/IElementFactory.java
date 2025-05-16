package fr.diginamic.factoryMethod.factory;

import fr.diginamic.factoryMethod.entity.Element;
import fr.diginamic.factoryMethod.entity.TypeElement;
import fr.diginamic.factoryMethod.entity.Unite;

public interface IElementFactory {

    Element getInstance(TypeElement type, String nom, double valeur, Unite unite);
}
