package tddbc;

public class Cards {

    Card first;
    Card second;

    public Cards(Card first, Card second) {
        this.first = first;
        this.second = second;
    }

    public Hand getHand() {
        if (first.hasSameRank(second)) return Hand.PAIR;
        if (first.hasSameSuit(second)) return Hand.FLUSH;
        return Hand.HIGH_CARD;
    }
}
