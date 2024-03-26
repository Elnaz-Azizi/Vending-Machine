package se.lexicon;

import se.lexicon.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Drink apple = new Drink(10, "Water", "Lemon taste", true );
        Drink cola = new Drink(10, "Cola", "Lemon taste" );
        System.out.println("apple = " + apple.examine());
        System.out.println("cola = " + cola.examine());

        Candy Chokolad = new Candy(20, "Kinder Kids", CandyTaste.SWEET, CandyType.CHOKOLAD);
        System.out.println("Chokolad.examine() = " + Chokolad.examine());

        Snack chips= new Snack(20, "Chitoz", SnackType.CHIPS, "Salty");
        System.out.println("chips = " + chips.examine());
    }
}
