package com.hovispace.kotlincommons.kotlinbasic

class LoopingExample {
}

fun main() {
    val numbers = arrayOf("first", "second", "third", "fourth")
    for (n in numbers) {
        println(n)
    }

    // step parameter is optional and is equivalent to incrementing the counter twice in each iteration
    for (i in 2..9 step 2) {
        println(i)
    }

    val list = 1.rangeTo(10).map { it * 2 }
    println(list)
}