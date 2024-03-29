package se.lexicon.model;

public final class Drink implements IProduct {

    private String taste;
    private boolean carbo;
    private String productName;
    private double price;
    private int id;


    public Drink(double price, String productName, String taste, boolean carbo) {
        setPrice(price);
        setProductName(productName);
        this.id = ProductIdSequencer.nextId();
        this.taste = taste;
        this.carbo = carbo;
    }

    public Drink(double price, String productName, String taste) {
        setPrice(price);
        setProductName(productName);
        this.id = ProductIdSequencer.nextId();
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

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }


}

