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
        Card card = new Card("♠", "3");

        // 検証
        assertEquals("3♠", card.getNotation());
    }

}
