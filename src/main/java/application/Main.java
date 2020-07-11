package application;

import calculator.Calculator;
import printer.Printer;
import symbolspliter.SymbolSpliter;

import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        final SymbolSpliter spliter = new SymbolSpliter();
        final Printer printer = new Printer();
        final Calculator calculate = new Calculator();
        final Map<String, Set<Integer>> allGroups = spliter.splitSymbols();
        final Map<String, Integer> allResults = calculate.calculateSum(allGroups);
        printer.printGroups(allGroups);
        printer.printResults(allResults);
    }
}