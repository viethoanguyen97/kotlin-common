package com.hovispace.kotlincommons.kotlinbasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaKotlinInteroperabilityTest {

    @Test
    public void test_MathOperations_sum() {
        int res = new MathOperations().sum(2, 3);

        assertEquals(5, res);
    }
}
