package tddbc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class HandsTest {

    Card aceOfDiamonds = new Card(Suit.Diamonds, new Rank("A"));
    Card aceOfHearts = new Card(Suit.Hearts, new Rank("A"));
    Card sevenOfDiamonds = new Card(Suit.Diamonds, new Rank("7"));
    Card sevenOfClubs = new Card(Suit.Clubs, new Rank("7"));

    @Test
    public void 手札からAのペアを判定できる() throws Exception {
        Cards cards = new Cards(aceOfDiamonds, aceOfHearts);

        assertEquals(cards.getHand(), Hand.PAIR);
    }

    @Test
    public void 手札からクラブのフラッシュを判定できる() throws Exception {
        Cards cards = new Cards(aceOfDiamonds, sevenOfDiamonds);

        assertEquals(cards.getHand(), Hand.FLUSH);
    }

    @Test
    public void 手札からハイカードを判定できる() throws Exception {
        Cards cards = new Cards(aceOfDiamonds, sevenOfClubs);

        assertEquals(cards.getHand(), Hand.HIGH_CARD);
    }
}
