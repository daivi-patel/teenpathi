package com.teenpathi.teenpathi.objects;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck deck = new Deck();

    @Test
    public void createDeck() {
        System.out.println(deck);
        deck.shuffle();
        System.out.println(deck);
        assertTrue(deck.getCards().get(0).getSuit() == Card.Suit.HEARTS
        || deck.getCards().get(0).getSuit() == Card.Suit.SPADES
        || deck.getCards().get(0).getSuit() == Card.Suit.DIAMONDS
        || deck.getCards().get(0).getSuit() == Card.Suit.CLUBS);
    }
}