package com.hovispace.kotlincommons.kotlinbasic

/**
 * The mechanism of exception handling is very similar to the one in Java.
 *
 * All exception classes extend Throwable. The exception must have a message, stacktrace, and an optional cause.
 * Every exception in Kotlin is unchecked, meaning that compiler does not force us to catch them.
 */
class ExceptionHandling {

    fun tryCatchBlock(): Int? {
        try {
            val message = "message"
            return message.toInt()
        } catch (exception: NumberFormatException) {
            println("NumberFormatException thrown")
            return null
        }
    }

    fun tryCatchFinallyBlock(): Int? {
        return try {
            val message = "message"
            message.toInt()
        } catch (exception: NumberFormatException) {
            println("NumberFormatException thrown")
            null
        } finally {
            println("Finally block invoked")
        }
    }
}

fun main() {
    val exceptionHandling = ExceptionHandling()
    exceptionHandling.tryCatchBlock()
    exceptionHandling.tryCatchFinallyBlock()
}