package se.lexicon.model;

public class ProductIdSequencer {
    private static int sequencer = 0;
    public static int nextId(){
        return ++sequencer;
    }

}

