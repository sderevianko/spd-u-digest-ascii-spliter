package application;

import calculator.Calculator;
import printer.Printer;
import resultpojo.ResultPojo;
import symbolspliter.SymbolSplitter;

public class Main {

    public static void main(String[] args) {
        final SymbolSplitter splitter = new SymbolSplitter();
        final Printer printer = new Printer();
        final Calculator calculate = new Calculator();
        final ResultPojo resultGroups = splitter.splitSymbols();
        final ResultPojo resultCalculate = calculate.calculateSum(resultGroups);
        printer.printGroups(resultGroups);
        printer.printCalculatedResults(resultCalculate);
    }
}