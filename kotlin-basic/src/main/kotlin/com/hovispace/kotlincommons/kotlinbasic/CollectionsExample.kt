package com.hovispace.kotlincommons.kotlinbasic

fun main() {
    // Collections
    // Immutable list
    val items = listOf(1, 2, 3, 4)

    // Mutable list
    // A mutable list has add() method so we could append an element to it.
    // There are also equivalent method to other types of collections: mutableMapOf(), mapOf(), setOf(), mutableSetOf()
    val rwList = mutableListOf(1, 2, 3)
    rwList.add(5)
}