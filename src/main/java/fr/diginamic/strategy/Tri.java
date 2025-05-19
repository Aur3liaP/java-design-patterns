package fr.diginamic.strategy;

public class Tri {

    public void exec(TypeTri typeTri, Integer[] arr) {

        TriStrategy strategy = StrategyFactory.getStrategy(typeTri);
        strategy.trier(arr);
    }
}