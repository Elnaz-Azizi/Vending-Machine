package se.lexicon;

import se.lexicon.model.Drink;

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

    }
}
