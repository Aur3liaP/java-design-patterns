package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service implements IElement{
    private final String nom;
    private final List<IElement> elements;

    public Service(String nom) {
        this.nom = nom;
        this.elements = new ArrayList<>();
    }

    public void ajouterElement(IElement element) {
        elements.add(element);
    }

    @Override
    public double calculerSalaire() {
        double total = 0;
        for (IElement element : elements) {
            total += element.calculerSalaire();
        }
        return total;
        // elements.stream().mapToDouble(e->e.calculerSalaire()).sum();
    }

    public String getNom() {
        return nom;
    }

    public List<IElement> getElements() {
        return Collections.unmodifiableList(elements);
    }
}
