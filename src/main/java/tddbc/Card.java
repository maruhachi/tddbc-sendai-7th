package tddbc;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public class Card {

    private Suit suit;

    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getNotation() {

        return rank.getNotation() + suit.getNotation();
    }

    public boolean hasSameSuit(Card other) {
        return suit.isSame(other.suit);
    }

    public boolean hasSameRank(Card other) {
        return rank.isSame(other.rank);
    }
}
