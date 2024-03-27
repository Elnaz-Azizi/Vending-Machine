package se.lexicon;

import se.lexicon.model.*;

import java.util.Arrays;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Drink apple = new Drink(10, "Water", "Lemon taste", true); // 1
        Drink cola = new Drink(10, "Cola", "Lemon taste"); // 2
        Candy chokolad = new Candy(20, "Kinder Kids", CandyTaste.SWEET, CandyType.CHOKOLAD); // 3
        Snack chips = new Snack(20, "Chitoz", SnackType.CHIPS, "Salty"); // 4

        Product[] products = {apple, cola, chips, chokolad};

        VendingMachineImpl vendingMachine1 = new VendingMachineImpl(products);

        System.out.println(Arrays.toString(vendingMachine1.getProducts()));


        vendingMachine1.addCurrency(10);
        System.out.println(vendingMachine1.getBalance()); // 10
        vendingMachine1.addCurrency(5);
        System.out.println(vendingMachine1.getBalance()); // 15

        System.out.println(Arrays.toString(vendingMachine1.getProducts()));

        // call request method 1
        vendingMachine1.request(2);
        System.out.println(vendingMachine1.getBalance());
        System.out.println(vendingMachine1.getDescription(2));



    }
}
