package fr.diginamic.strategy;

public class StrategyFactory {

    public static TriStrategy getStrategy(TypeTri type) {
        return switch (type) {
            case BUBBLE -> new BubbleSortStrategy();
            case INSERTION -> new InsertionSortStrategy();
            case SELECTION -> new SelectionSortStrategy();
        };
    }
}
