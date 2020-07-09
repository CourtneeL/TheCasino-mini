package com.codedifferently.casino;

import org.junit.Test;
import org.junit.Assert;

public class GroupOfCardsTest 
{
    Card[] cards = {new Card("", 2), new Card("", 2) 
    ,new Card("", 2), new Card("", 2), new Card("", 3), new Card("", 3) 
    ,new Card("", 3), new Card("", 3), new Card("", 4), new Card("", 4) 
    ,new Card("", 4), new Card("", 4), new Card("", 5), new Card("", 5) 
    ,new Card("", 5), new Card("", 5), new Card("", 6), new Card("", 6) 
    ,new Card("", 6), new Card("", 6), new Card("", 7), new Card("", 7) 
    ,new Card("", 7), new Card("", 7), new Card("", 8), new Card("", 8) 
    ,new Card("", 8), new Card("", 8), new Card("", 9), new Card("", 9) 
    ,new Card("", 9), new Card("", 9), new Card("", 10), new Card("", 10) 
    ,new Card("", 10), new Card("", 10), new Card("J", 10), new Card("J", 10) 
    ,new Card("J", 10), new Card("J", 10), new Card("Q", 10), new Card("Q", 10) 
    ,new Card("Q", 10), new Card("Q", 10), new Card("K", 10), new Card("K", 10) 
    ,new Card("K", 10), new Card("K", 10), new Card("A", 11), new Card("A", 11) 
    ,new Card("A", 11), new Card("A", 11)};

    @Test
    public void groupOfCardsConstructorTest()
    {
        //Given
        Card[] expected = cards;
        int expectedNum = expected.length;

        //When
        GroupOfCards groupOfCards = new GroupOfCards(cards, cards.length);
        int actualNum = groupOfCards.getCurrentSize();

        //Then
        Assert.assertArrayEquals(expected, cards);
        Assert.assertEquals(expectedNum, actualNum);

    }

    @Test
    public void getCurrentSizeTest()
    {
        //Given
        int expectedSize = 52;
        String expectedSuit = "";
        int expectedNumber = 0;

        //When
        GroupOfCards groupOfCards = new GroupOfCards(cards, cards.length);
        int actualSize = groupOfCards.getCurrentSize();
        
        //Then
        Assert.assertEquals(expectedSize, actualSize);
    }

    @Test
    public void getCardsTest()
    {
        //Given
        Card[] expected = cards;

        //When
        GroupOfCards groupOfCards = new GroupOfCards(cards, cards.length);
        Card[] actual = groupOfCards.getCards();

        //Then
        Assert.assertArrayEquals(expected, actual);

    }
}