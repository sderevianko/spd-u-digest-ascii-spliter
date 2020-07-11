package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Calculator {
    private final Map<String, Integer> allResults = new HashMap<>();

    public Map<String, Integer> calculateSum(Map<String, Set<Integer>> allGroup) {
        int evenSum = 0;
        int oddSum = 0;

        for (Integer integer : allGroup.get("Even")) {
            evenSum += integer;
        }
        for (Integer integer : allGroup.get("Odd")) {
            oddSum += integer;
        }
        final int difference = evenSum - oddSum;
        allResults.put("evenSum", evenSum);
        allResults.put("oddSum", oddSum);
        allResults.put("difference", difference);
        return allResults;
    }
}
