package calculator;

import resultpojo.ResultPojo;

public class Calculator {

    public ResultPojo calculateSum(ResultPojo resultGroups) {
        int evenSum = 0;
        int oddSum = 0;

        for (Integer integer : resultGroups.getEvenInt()) {
            evenSum += integer;
        }
        for (Integer integer : resultGroups.getOddInt()) {
            oddSum += integer;
        }
        final int difference = evenSum - oddSum;

        return new ResultPojo(evenSum, oddSum, difference);
    }
}
