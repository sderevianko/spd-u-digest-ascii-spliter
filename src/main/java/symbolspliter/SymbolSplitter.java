package symbolspliter;

import resultpojo.ResultPojo;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class SymbolSplitter {

    private final Set<Integer> evenInt = new HashSet<>();
    private final Set<Integer> oddInt = new HashSet<>();

    public ResultPojo splitSymbols() {
        final String string = "SPD-University";
        final String toUpperToCase = string.toUpperCase();

        final List<Character> symbols = toUpperToCase
            .chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.toList());
        for (Character symbol : symbols) {
            final int number = symbol;
            if (number % 2 == 0) {
                evenInt.add(number);
            } else {
                oddInt.add(number);
            }
        }
        return new ResultPojo(evenInt, oddInt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymbolSplitter that = (SymbolSplitter) o;
        return Objects.equals(evenInt, that.evenInt) &&
            Objects.equals(oddInt, that.oddInt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evenInt, oddInt);
    }
}
