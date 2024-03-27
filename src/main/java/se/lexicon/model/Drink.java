package se.lexicon.model;

public final class Drink extends Product {

    private String taste;
    private boolean carbo;

    public Drink(double price, String productName, String taste, boolean carbo) {
        super(price, productName);
        this.taste = taste;
        this.carbo = carbo;
    }

    public Drink(double price, String productName, String taste) {
        super(price, productName);
        this.taste = taste;
    }

    @Override
    public String examine() {
        return "Product ID " + getId() + " , Name: " + getProductName() + " , Taste: " + taste + " , carbo: " + carbo + " , Price: " + getPrice();
    }


    @Override
    public String use() {
        return "Product name: " + getProductName() + " , Price: " + getPrice();
    }
}

