package fr.diginamic.composite;

public class TestComposite {
    public static void main(String[] args) {
        Employe directeur = new Employe("RASPEY","Cécile", 10000);
        Employe architecte = new Employe("BECHKAR","Bilel", 8000);

        Service bigData = new Service("Big Data");
        bigData.ajouterElement(new Employe("RANMEY","JB", 7500));
        bigData.ajouterElement(new Employe("DOE","Jane", 3500));

        Service javaDev = new Service("Java Dev");
        javaDev.ajouterElement(new Employe("GUINEAU","KEVIN", 7500));
        javaDev.ajouterElement(new Employe("MARTIN","Paul", 3500));

        Service dsin = new Service("DSIN");
        dsin.ajouterElement(directeur);
        dsin.ajouterElement(architecte);
        dsin.ajouterElement(bigData);
        dsin.ajouterElement(javaDev);

        double totalSalaire = dsin.calculerSalaire();
        System.out.println("Salaire total de la DSIN : " + totalSalaire + "€");
    }
}
