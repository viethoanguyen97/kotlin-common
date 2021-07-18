package com.hovispace.kotlincommons.kotlinbasic

/**
 * By default, Kotlin’s classes are closed for extension — the equivalent of a class marked final in Java.
 * In order to specify that a class is open for extension, use the "open" keyword when defining the class.
 */
open class Item(val id: String, val name: String = "unknown_name") {
    //Denoting the getIdOfItem() method as open to allow it to be overridden.
    open fun getIdOfItem(): String {
        return id
    }
}

class ItemWithCategory(id: String, name: String, val categoryId: String) : Item(id, name) {
    override fun getIdOfItem(): String {
        return id + name
    }
}