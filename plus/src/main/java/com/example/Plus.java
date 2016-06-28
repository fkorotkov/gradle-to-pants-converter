package com.example;

public class Plus implements Operator {
    @Override
    public int apply(int a, int b) {
        return a + b;
    }
}
