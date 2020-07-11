package printer;

import java.util.Map;
import java.util.Set;

public class Printer {
    public void iterateSetSymbols(Set<Integer> set) {
        for (Integer integer : set) {
            int numb = integer;
            char symbol = (char) (numb);
            System.out.printf("%-5s", symbol);
        }
    }

    public void iterateSetAsciiNumbers(Set<Integer> set) {
        System.out.println();
        System.out.printf("%-44s", "");
        for (Integer integer : set) {
            System.out.printf("%-5s", integer);
        }
        System.out.println();
    }

    public void printGroups(Map<String, Set<Integer>> allGroup) {
        final Set<Integer> evenInteger = allGroup.get("Even");
        final Set<Integer> oddInteger = allGroup.get("Odd");

        System.out.print("The first group of even ASCII code symbols: ");
        iterateSetSymbols(evenInteger);
        iterateSetAsciiNumbers(evenInteger);

        System.out.print("The second group of odd ASCII code symbols: ");
        iterateSetSymbols(oddInteger);
        iterateSetAsciiNumbers(oddInteger);
    }

    public void printResults(Map<String, Integer> allResults) {
        System.out.print("The difference between the sortSymbols of first group (" + allResults.get("evenSum") + ") and second group (" + allResults.get("oddSum") + ") = " + allResults.get("difference"));
    }
}
