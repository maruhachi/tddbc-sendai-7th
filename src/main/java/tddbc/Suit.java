package tddbc;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public class Suit {

    private String suit;

    public Suit(String value) {
        this.suit = value;
    }

    public String getNotation() {
        return suit;
    }

    public boolean isSame(Suit other) {
        return suit.equals(other.suit);
    }
}
