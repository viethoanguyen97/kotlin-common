package com.hovispace.kotlincommons.kotlinbasic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class KotlinJavaInteroperabilityTest {

    @Test
    fun test_StringUtils_toUpperCase() {
        val testString = StringUtils.toUpperCase("grapes")
        assertEquals("GRAPES", testString)
    }
}