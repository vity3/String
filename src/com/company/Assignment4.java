package com.company;

import java.util.Arrays;
import java.util.Collections;


public class Assignment4 {
    public enum Suits {
        Spades, Clubs, Hearts, Diamonds
    }

    public enum Values {
        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace

    }

    public static void main(String[] args) {
        String[] cardStack = cards();
        System.out.println(Arrays.asList(cardStack));
        shuffle(cardStack);
        System.out.printf("%nList after shuffle: " + (Arrays.asList(cardStack)) + "%n");
        System.out.printf("%nFirst card in the stack after shuffle: " + cardStack[0] + "%n");
    }

    public static String[] cards() {
        int index = 0;
        String[] cards = new String[52];
        for (Suits eachSuite : Suits.values()) {
            for (Values eachValue : Values.values()) {
                cards[index] = eachSuite.toString() + " " + eachValue.toString();
                index++;
            }
        }
        return cards;
    }

    public static void shuffle(String[] cards) {
        Collections.shuffle(Arrays.asList(cards));
    }

}
