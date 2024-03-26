package se.lexicon.model;

public final class Candy extends Product{

    private final CandyTaste taste;
    private final CandyType type;

    public Candy(double price, String productName, CandyTaste taste, CandyType type) {
        super(price, productName);
        this.taste = taste;
        this.type = type;
    }
    public String examine() {
        return "Product name: " + getProductName() + " , Taste: " + taste + " Type: " + type + " Price: " + getPrice();
    }


    @Override
    public String use() { return "Product name: " + getProductName() + " , Price: " + getPrice();
    }
}
