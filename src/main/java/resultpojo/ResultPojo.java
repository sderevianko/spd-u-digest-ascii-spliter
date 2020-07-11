package resultpojo;

import java.util.HashSet;
import java.util.Objects;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultPojo that = (ResultPojo) o;
        return evenSum == that.evenSum &&
            oddSum == that.oddSum &&
            difference == that.difference &&
            Objects.equals(evenInt, that.evenInt) &&
            Objects.equals(oddInt, that.oddInt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evenInt, oddInt, evenSum, oddSum, difference);
    }
}
