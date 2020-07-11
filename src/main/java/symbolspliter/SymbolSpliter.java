package symbolspliter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class SymbolSpliter {

    private final Set<Integer> evenInt = new HashSet();
    private final Set<Integer> oddInt = new HashSet();
    private final Map<String, Set<Integer>> allGroups = new HashMap<>();

    public Map<String, Set<Integer>> splitSymbols() {
        final String string = "SPD-University";
        final String toUpperToCase =
            string.toUpperCase();

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
        allGroups.put("Even", evenInt);
        allGroups.put("Odd", oddInt);
        return allGroups;
    }
}
