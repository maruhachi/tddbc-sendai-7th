package tddbc;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public enum Hand {

    PAIR("ペア"),
    FLUSH("フラッシュ"),
    HIGH_CARD("ハイカード");

    private final String value;

    Hand(String value) {
        this.value = value;
    }
}
