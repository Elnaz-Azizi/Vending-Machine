package se.lexicon.model;

public interface IVendingMachine {
    void addCurrency(double amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String [] getProducts();

}
