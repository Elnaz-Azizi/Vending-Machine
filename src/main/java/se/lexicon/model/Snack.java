package se.lexicon.model;

public final class Snack extends Product{
private final SnackType type;
private String taste;

    public Snack(double price, String productName, SnackType type, String taste) {
        super(type.getPrice(), productName);
        this.type = type;
        this.taste = taste;
    }

    public String examine() {
        return "Product name: " + getProductName() + " , Taste: " + taste + " Type: " + type + " Price: " + type.getPrice();
    }


    @Override
    public String use() { return "Product name: " + getProductName() + " , Price: " + type.getPrice();
    }
}
