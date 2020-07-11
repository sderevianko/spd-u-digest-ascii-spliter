package printer;

import resultpojo.ResultPojo;
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

    public void printGroups(ResultPojo resultGroup) {
        final Set<Integer> evenInteger = resultGroup.getEvenInt();
        final Set<Integer> oddInteger = resultGroup.getOddInt();

        System.out.print("The first group of even ASCII code symbols: ");
        iterateSetSymbols(evenInteger);
        iterateSetAsciiNumbers(evenInteger);

        System.out.print("The second group of odd ASCII code symbols: ");
        iterateSetSymbols(oddInteger);
        iterateSetAsciiNumbers(oddInteger);
    }

    public void printCalculatedResults(ResultPojo resultPojo) {
        System.out.print("The difference between the sortSymbols of first group (" + resultPojo.getEvenSum() + ") and second group (" + resultPojo.getOddSum() + ") = " + resultPojo.getDifference());
    }
}
