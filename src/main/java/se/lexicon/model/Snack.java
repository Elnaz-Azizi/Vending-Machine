package se.lexicon.model;

public final class Snack implements IProduct {
    private final SnackType type;
    private String taste;
    private double price;
    private String productName;
    private int id;


    public Snack(SnackType type, String taste, String productName) {
        setPrice(type.getPrice());
        setProductName(productName);
        this.id = ProductIdSequencer.nextId();
        this.type = type;
        this.taste = taste;

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String examine() {
        return "Product ID " + getId() + " , Name: " + getProductName() + " , Taste: " + taste + " Type: " + type + " Price: " + type.getPrice();
    }


    @Override
    public String use() {
        return "Product name: " + getProductName() + " , Price: " + type.getPrice();
    }
}
