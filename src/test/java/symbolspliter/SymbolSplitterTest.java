package symbolspliter;

import junit.framework.TestCase;
import org.junit.Test;
import resultpojo.ResultPojo;

import java.util.HashSet;
import java.util.Set;

public class SymbolSplitterTest extends TestCase {
    @Test
    public void splitSymbols() {
        //final Set<Integer> evenInt = null;
        //final Set<Integer> oddInt = null;
        Set<Integer> evenIntExpected = new HashSet<>();
        evenIntExpected.add(80);
        evenIntExpected.add(82);
        evenIntExpected.add(68);
        evenIntExpected.add(84);
        evenIntExpected.add(86);
        evenIntExpected.add(78);

        Set<Integer> oddIntExpected = new HashSet<>();
        oddIntExpected.add(83);
        oddIntExpected.add(85);
        oddIntExpected.add(69);
        oddIntExpected.add(73);
        oddIntExpected.add(89);
        oddIntExpected.add(45);

        SymbolSplitter symbolSplitter = new SymbolSplitter();
        Set<Integer> evenInt = new HashSet<>();
        Set<Integer> oddInt = new HashSet<>();
        symbolSplitter.splitSymbols();

        assertEquals(evenIntExpected, evenInt);
        //assertEquals(oddInt,oddIntExpected);
        //return new ResultPojo(evenInt, oddInt);
    }
}