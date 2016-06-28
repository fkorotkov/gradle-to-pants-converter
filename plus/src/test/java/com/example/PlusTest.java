package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusTest {
    @Test
    public void apply() throws Exception {
        Plus plus = new Plus();
        assertEquals(4, plus.apply(1, 3));
    }
}