package com.hovispace.kotlincommons.kotlinbasic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class StringTemplateTest {

    @Test
    fun test_string_template() {
        val firstName = "Tom"
        val secondName = "Mary"
        val concatOfNames = "$firstName + $secondName"
        val sum = "four: ${2 + 2}"

        assertEquals("Tom + Mary", concatOfNames)
        assertEquals("four: 4", sum)
    }

    @Test
    fun test_evaluate_expression() {
        val itemManager = ItemManager("cat_id", "db://connection")

        // evaluate an expression inside the ${} block:
        val result = "function result: ${itemManager.isFromSpecificCategory("1")}"

        assertEquals("function result: false", result)
    }
}