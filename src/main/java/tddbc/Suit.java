package tddbc;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public class Suit {

    String suit;

    public Suit(String s) {
        this.suit = s;
    }

    public boolean isSame(Suit other) {
        return suit.equals(other.suit);
    }
}
