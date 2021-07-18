package com.hovispace.kotlincommons.kotlinbasic

import java.util.concurrent.ThreadLocalRandom

class ListExtension {

    fun <T> List<T>.random(): T? {
        if (this.isEmpty()) {
            return null
        }
        return get(ThreadLocalRandom.current().nextInt(count()))
    }

    fun <T> getRandomElement(list: List<T>): T? {
        return list.random()
    }
}