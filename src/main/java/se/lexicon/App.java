package se.lexicon;

import se.lexicon.model.*;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Drink water = new Drink(20, "Water", "Sweet", true);
        Drink cola = new Drink(10, "Cola", "Lemon taste"); // 2
        Candy chokolad = new Candy(CandyTaste.SWEET, 10, CandyType.CHOKOLAD, "Kinder");
        Snack chips = new Snack(SnackType.CHIPS, "Salty", "Kinder");

        IProduct[] products = {water, cola, chokolad, chips};
        VendingMachineImpl vendingMachine1 = new VendingMachineImpl(products);

        System.out.println(Arrays.toString(vendingMachine1.getProducts()));


        vendingMachine1.addCurrencyNew(10);
        System.out.println(vendingMachine1.getBalance()); // 10
        vendingMachine1.addCurrency(5);
        System.out.println(vendingMachine1.getBalance()); // 15

        System.out.println(Arrays.toString(vendingMachine1.getProducts()));

        // call request method 1
        vendingMachine1.request(3);
        System.out.println(vendingMachine1.getBalance());
        System.out.println(vendingMachine1.getDescription(3));


    }
}
