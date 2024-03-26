package se.lexicon.model;

public enum SnackType {
    CHIPS(20), POPCORN(10);


    private final double price;

    SnackType(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
