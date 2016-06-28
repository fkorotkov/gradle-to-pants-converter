package com.example;

import static com.google.common.base.Preconditions.checkArgument;

public class Calculator {
    public static int accumulate(int... values) {
        checkArgument(values.length > 0, "There should be at least one value to accumulate!");
        int result = 0;
        Operator operator = new Plus();
        for (int value : values) {
            result = operator.apply(result, value);
        }
        return result;
    }
}
