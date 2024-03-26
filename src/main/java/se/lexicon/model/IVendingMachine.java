package se.lexicon.model;

public interface IVendingMachine {
    void addCurrency(double amount);
    int getBalance();
    int request(int id);
    int endSession();
    String getDescription(int id);
    String [] getProducts();

}
