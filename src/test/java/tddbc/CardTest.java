package tddbc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public class CardTest {

    @Nested
    class カードの文字列表記 {

        @Test
        @DisplayName("「スペードの3」のカードの文字列表記は3♠")
        public void _3スペード() throws Exception {
            // 実行
            Suit suit = Suit.Spades;
            Rank rank = new Rank("3");
            Card card = new Card(suit, rank);

            // 検証
            assertEquals("3♠", card.getNotation());
        }

        @Test
        @DisplayName("「ジャックのハート」のカードの文字列表記はJ♥")
        public void Jハート() throws Exception {
            // 実行
            Suit suit = Suit.Hearts;
            Rank rank = new Rank("J");
            Card card = new Card(suit, rank);

            // 検証
            assertEquals("J♥", card.getNotation());
        }

    }


    @Nested
    class カードの比較 {

        Card threeOfSpades = new Card(Suit.Spades, new Rank("3")); // スペードの3
        Card aceOfSpades = new Card(Suit.Spades, new Rank("A")); // スペードのA
        Card threeOfHearts = new Card(Suit.Hearts, new Rank("3")); // ハートの3

        @Test
        @DisplayName("スペードの3とスペードのAは同じスートを持つ")
        public void 同じスートの比較() throws Exception {
            assertTrue(threeOfSpades.hasSameSuit(aceOfSpades));
        }

        @Test
        @DisplayName("スペードの3とハートの3は異なるスートを持つ")
        public void 異なるスートの比較() throws Exception {
            assertFalse(threeOfSpades.hasSameSuit(threeOfHearts));
        }

        @Test
        @DisplayName("スペードの3とハートの3は同じランクを持つ")
        public void 同じランクの比較() throws Exception {
            assertTrue(threeOfSpades.hasSameRank(threeOfHearts));
        }

        @Test
        @DisplayName("スペードの3とスペードのエースは異なるランクを持つ")
        public void 異なるランクの比較() throws Exception {
            assertFalse(threeOfSpades.hasSameRank(aceOfSpades));
        }

    }
}
