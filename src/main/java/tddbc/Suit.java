package tddbc;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public enum Suit {

    Spades("♠"),
    Hearts("♥"),
    Diamonds("◆"),
    Clubs("♣");

    private String value;

    Suit(String value) {
        this.value = value;
    }

    public String getNotation() {
        return value;
    }

    public boolean isSame(Suit another) {
        return this == another;
    }
}
