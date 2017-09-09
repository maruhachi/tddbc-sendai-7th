package tddbc;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public class Card {

    private String suit;

    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getNotation() {

        return rank + suit;
    }
}
