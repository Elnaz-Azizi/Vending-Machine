package se.lexicon.model;

public final class Candy implements IProduct {

    private final CandyTaste taste;
    private final CandyType type;
    private String productName;
    private double price;
    private int id;


    public Candy(CandyTaste taste, double price, CandyType type, String productName) {
        setPrice(price);
        setProductName(productName);
        this.id = ProductIdSequencer.nextId();
        this.taste = taste;
        this.type = type;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("price should not be a negative number.");
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String examine() {
        return "Product ID " + getId() + " , Name: " + getProductName() + " , Taste: " + taste + " Type: " + type + " Price: " + getPrice();
    }


    @Override
    public String use() {
        return "Product name: " + getProductName() + " , Price: " + getPrice();
    }
}
