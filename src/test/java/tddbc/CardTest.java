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
            Suit suit = new Suit("♠");
            Rank rank = new Rank("3");
            Card card = new Card(suit, rank);

            // 検証
            assertEquals("3♠", card.getNotation());
        }

        @Test
        @DisplayName("「ジャックのハート」のカードの文字列表記はJ♥")
        public void Jハート() throws Exception {
            // 実行
            Suit suit = new Suit("♥");
            Rank rank = new Rank("J");
            Card card = new Card(suit, rank);

            // 検証
            assertEquals("J♥", card.getNotation());
        }

    }


    @Nested
    class カードの比較 {

        Card threeOfSpades = new Card(new Suit("♠"), new Rank("3")); // スペードの3
        Card aceOfSpades = new Card(new Suit("♠"), new Rank("A")); // スペードのA
        Card aceOfHearts = new Card(new Suit("♥"), new Rank("A")); // ハートのA

        @Test
        @DisplayName("スペードの3とスペードのAは同じスートを持つ")
        public void 同じスートの比較() throws Exception {
            assertTrue(threeOfSpades.hasSameSuit(aceOfSpades));
        }

        @Test
        @DisplayName("スペードの3とハートのAは異なるスートを持つ")
        public void 異なるスートの比較() throws Exception {
            assertFalse(threeOfSpades.hasSameSuit(aceOfHearts));
        }

        @Test
        @DisplayName("ハートのエースとスペードのAは同じランクを持つ")
        public void 同じランクの比較() throws Exception {
            assertTrue(aceOfHearts.hasSameRank(aceOfSpades));
        }

        @Test
        @DisplayName("スペードの3とスペードのエースは異なるランクを持つ")
        public void 異なるランクの比較() throws Exception {
            assertFalse(threeOfSpades.hasSameRank(aceOfSpades));
        }

    }
}
