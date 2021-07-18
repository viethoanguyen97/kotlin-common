package com.hovispace.kotlincommons.kotlinbasic

fun main() {
    // normal if else block
    val number = 2
    if (number < 10) {
        println("number less that 10")
    } else if (number > 10) {
        println("number is greater that 10")
    }

    // when
    val name = "John"
    when (name) {
        "John" -> println("Hi man")
        "Alice" -> println("Hi lady")
    }
}