package se.lexicon.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VendingMachineImpl implements IVendingMachine {
    private Product[] products; // {apple, cola, chips, chokolad}
    private int depositPool; // 0
    private static final int[] VALID_AMOUNTS = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};

    public VendingMachineImpl(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(double amount) { // 10
        // validate the amount that should be in the array
        // yes-> add to depositPool
        // No -< throw error with a proper message
        //boolean isValid = false;
        for (int validAmount : VALID_AMOUNTS) {
            if (validAmount == amount) {
                depositPool += amount;
                //isValid = true;
                break;
            }
        }
        //if (!isValid) throw new IllegalArgumentException("invalid amount");

    }


    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        // Iterate over the array of products
        for (Product product : products) {
            // Check if the product exists and if its ID matches the requested ID
            if (product != null && product.getId() == id) {
                // Check if the product price is less than or equal to the depositPool
                if (product.getPrice() <= depositPool) {
                    // Deduct the product price from the depositPool
                    depositPool -= product.getPrice();
                    // Return the found product
                    return product;
                } else {
                    // If there are insufficient funds, return null
                    return null;
                }
            }
        }
        // If the product with the requested ID is not found, return null
        return null;
    }

    @Override
    public int endSession() {
        int remainingAmount = depositPool;
        depositPool = 0;
        return remainingAmount;

    }

    @Override
    public String getDescription(int id) {
        for (Product product : products) {
            if (product != null && product.getId()==id) {
                return product.examine();
            }
        }
            return "Product with ID" + id + "not found";

        }

        @Override
        public String[] getProducts () {
            String[] productsStr = new String[products.length]; // [null, null null]
            for (int i = 0; i < products.length; i++) {
                String productDescription = products[i].examine();
                productsStr[i] = productDescription;
            }
            return productsStr;
        }


    }

