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

}
