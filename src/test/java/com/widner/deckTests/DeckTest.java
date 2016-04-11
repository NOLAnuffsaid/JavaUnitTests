package com.widner.deckTests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
//import org.hamcrest.core;


import com.widner.deck.Deck;
/**
 * Created by wjmil_000 on 3/10/2016.
 */

public class DeckTest {

    Deck deck;

    @Before
    public void buildDeck() {
        deck = Deck.getInstance();
    }

    @Test
    public void DeckShouldBeASingleton() {
        Deck otherDeck = Deck.getInstance();

        assertEquals("Deck should have only one instance", true, otherDeck == deck);
    }

    @Ignore
    @Test
    public void DeckIsACollectionOfCards() {

    }

    @Ignore
    @Test
    public void DeckHasFiftyTwoCards() {

    }

    @Ignore
    @Test
    public void DeckHasFourDifferentSuites() {

    }

}
