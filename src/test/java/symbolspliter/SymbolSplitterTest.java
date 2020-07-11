package symbolspliter;

import org.junit.Test;
import resultpojo.ResultPojo;

import java.util.HashSet;
import java.util.Set;

public class SymbolSplitterTest {

    @Test
    public void splitSymbols() {
        final Set<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(80);
        evenNumbers.add(82);
        evenNumbers.add(68);
        evenNumbers.add(84);
        evenNumbers.add(86);
        evenNumbers.add(78);

        final Set<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(83);
        oddNumbers.add(85);
        oddNumbers.add(69);
        oddNumbers.add(73);
        oddNumbers.add(89);
        oddNumbers.add(45);

        final ResultPojo expected = new ResultPojo(evenNumbers, oddNumbers);

        final ResultPojo actual = new SymbolSplitter().splitSymbols();

        assertEquals(expected, actual);
    }

    private void assertEquals(ResultPojo expected, ResultPojo actual) {
    }
}