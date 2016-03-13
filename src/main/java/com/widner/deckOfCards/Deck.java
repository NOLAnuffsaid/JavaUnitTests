package com.widner.deckOfCards;

/**
 * Created by wjmil_000 on 3/12/2016.
 */
public class Deck {
    private static Deck instance = new Deck();

    public static Deck getInstance() {
        return instance;
    }

    private Deck() {
    }
}
