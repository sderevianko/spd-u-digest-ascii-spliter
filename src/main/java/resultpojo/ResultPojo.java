package resultpojo;

import java.util.HashSet;
import java.util.Set;

public class ResultPojo {
    private Set<Integer> evenInt = new HashSet<>();
    private Set<Integer> oddInt = new HashSet<>();
    private int evenSum;
    private int oddSum;
    private int difference;

    public ResultPojo(Set<Integer> evenInt, Set<Integer> oddInt) {
        this.evenInt = evenInt;
        this.oddInt = oddInt;
    }

    public ResultPojo(int evenSum, int oddSum, int difference) {
        this.evenSum = evenSum;
        this.oddSum = oddSum;
        this.difference = difference;
    }

    public int getEvenSum() {
        return evenSum;
    }

    public int getOddSum() {
        return oddSum;
    }

    public int getDifference() {
        return difference;
    }

    public Set<Integer> getEvenInt() {
        return evenInt;
    }

    public Set<Integer> getOddInt() {
        return oddInt;
    }
}
