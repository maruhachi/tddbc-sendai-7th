package tddbc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HandsTest {

    @Test
    public void 手札からペアを判定できる() throws Exception {
        Card firstCard = new Card(Suit.Diamonds, new Rank("A"));
        Card secondCard = new Card(Suit.Hearts, new Rank("A"));
        Cards cards = new Cards(firstCard, secondCard);

        assertEquals(cards.getHands(), "ペア");
    }
}
