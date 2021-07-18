package com.hovispace.kotlincommons.kotlinbasic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LambdaExampleUnitTest {

    @Test
    fun test_lambda() {
        val listOfNumbers = listOf(1, 2, 3)
        val sumLambda = { a: Int, b: Int -> a + b }

        assertEquals(6, listOfNumbers.reduce { a, b -> a + b })
        assertEquals(6, listOfNumbers.reduce(sumLambda))
    }
}