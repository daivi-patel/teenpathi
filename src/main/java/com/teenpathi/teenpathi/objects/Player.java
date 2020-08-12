package com.teenpathi.teenpathi.objects;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int id;
    private List<Card> hand;

    public Player(int id) {
        this.id = id;
        this.hand = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", hand=" + hand +
                '}';
    }
}
