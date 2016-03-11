package com.widner.deckOfCards;

import org.junit.Test;
import org.junit.Assert;

import org.hamcrest.CoreMatchers;

/**
 * Created by wjmil_000 on 3/10/2016.
 */

class Deck {
    public static String getName() {
        return "Widner";
    }
}

public class DeckTest {

    @Test
    public void wholeName() {
        Assert.assertEquals("FAIL!!!!! you suck.", Deck.getName(), "Widner");
    }

    @Test
    public void firstLetter() {
        Assert.assertThat(Deck.getName(), CoreMatchers.startsWith("W"));
    }

    @Test
    public void lastLetter() {
        Assert.assertThat(Deck.getName(), CoreMatchers.endsWith("r"));
    }
}
