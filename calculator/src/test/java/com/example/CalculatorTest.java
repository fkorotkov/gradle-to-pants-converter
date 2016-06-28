package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void accamulateList() throws Exception {
        int result = Calculator.accumulate(1, 2, 3, 4);
        assertEquals(10, result);
    }
}