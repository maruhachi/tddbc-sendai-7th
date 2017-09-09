package tddbc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public class CardTest {

    @Test
    public void カードの生成() throws Exception {
        // 実行
        Suit suit = new Suit("♠");
        Rank rank = new Rank("3");
        Card card = new Card(suit, rank);

        // 検証
        assertEquals("3♠", card.getNotation());
    }

    @Test
    public void カードの比較_同じスートの比較() throws Exception {
        Card threeOfSpades = new Card(new Suit("♠"), new Rank("3")); // スペードの3
        Card aceOfSpades = new Card(new Suit("♠"), new Rank("A")); // スペードのA

        assertTrue(threeOfSpades.hasSameSuit(aceOfSpades));
    }

    @Test
    public void カードの比較_異なるスートの比較() throws Exception {
        Card threeOfSpades = new Card(new Suit("♠"), new Rank("3")); // スペードの3
        Card aceOfHearts = new Card(new Suit("♥"), new Rank("A")); // ハートのA

        assertFalse(threeOfSpades.hasSameSuit(aceOfHearts));
    }

    @Test
    public void カードの比較_異なるランクの比較() throws Exception {
        Card threeOfSpades = new Card(new Suit("♠"), new Rank("3")); // スペードの3
        Card aceOfSpades = new Card(new Suit("♠"), new Rank("A")); // スペードのA

        assertTrue(threeOfSpades.hasSameSuit(aceOfSpades));
    }

}
