package se.lexicon.model;

public final class Drink extends Product {

    private String taste;
    private boolean carbo;

    public Drink(double price, String productName, String taste, boolean carbo) {
        super(price, productName);
        this.taste = taste;
        this.carbo = carbo;
    }

    @Override
    public String examine() {
        return examine() + " , Taste: " + taste + " , carbo: " + carbo;
    }


    @Override
    public String use() {
        return null;
    }
}

