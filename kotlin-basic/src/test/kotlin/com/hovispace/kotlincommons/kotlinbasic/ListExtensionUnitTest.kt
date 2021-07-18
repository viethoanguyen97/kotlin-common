package com.hovispace.kotlincommons.kotlinbasic

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ListExtensionUnitTest {

    @Test
    fun getRandomElement() {
        val element = listOf(1,2,3)

        val randomElement = ListExtension().getRandomElement(element)

        assertTrue(element.contains(randomElement))
    }
}