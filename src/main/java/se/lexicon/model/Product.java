package se.lexicon.model;

public abstract class Product extends Object {
    private static int sequencer = 0;
    private int id;
    private final double price;
    private String productName;

    public Product(double price, String productName) {
        this.price = price;
        this.productName = productName;
        this.id = getNextId();

    }

    private static int getNextId() {
        return ++sequencer;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null) throw new IllegalArgumentException("productName is null");
        this.productName = productName;
    }

    public abstract String examine();

    public abstract String use();
}
