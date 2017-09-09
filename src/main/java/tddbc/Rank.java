package tddbc;

/**
 * @author ykonno
 * @since 2017/09/09
 */
public class Rank {

    private String rank;

    public Rank(String value) {
        this.rank = value;
    }

    public String getNotation(){
        return rank;
    }

    public boolean isSame(Rank other) {
        return rank.equals(other.rank);
    }
}
