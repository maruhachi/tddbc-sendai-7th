package tddbc;

public class Cards {

    Card first;
    Card second;

    public Cards(Card first, Card second) {
        this.first = first;
        this.second = second;
    }

    public String getHands() {
        if (first.hasSameRank(second)) return "ペア";
        return "";
    }
}
