package com.hovispace.kotlincommons.kotlinbasic

import java.util.*

class ItemService {
    // The important thing to notice is returned type of that method.
    // It is an object followed by a question mark. It is a construct from Kotlin language, meaning that Item returned from that method could be null.
    // We need to handle that case at compile-time, deciding what we want to do with that object (it is more or less equivalent to Java 8 Optional<T> type).

    // If the method signature has type without question mark:
    // fun findItemNameForId(id: String): Item
    // then calling code will not need to handle a null case because it is guaranteed by the compiler and Kotlin language, that returned object can not be null.
    fun findItemNameForId(id: String): Item? {
        val itemId = UUID.randomUUID().toString()
        return Item(itemId, "name-$itemId")
    }
}

/**
 * ItemManager class has a default constructor that populates two fields — categoryId and dbConnection — and an optional email field:
 * That ItemManager(…) construct creates constructor and two fields in our class: categoryId and dbConnection
 * Note that the constructor uses the val keyword for its arguments — this means that the corresponding fields will be final and immutable.
 * If using var keyword, then those fields would be mutable.
 *
 * Create an instance of ItemManager using the default constructor:
 * ItemManager("cat_id", "db://connection")
 *
 * Construct ItemManager using named parameters. It is very useful when we need to pass more arguments to a function.
 * ItemManager(categoryId = "catId", dbConnection = "db://Connection")
 */
class ItemManager(val categoryId: String, val dbConnection: String) {
    var email = ""

    // Define an additional constructor by using the constructor keyword.
    // Note that this constructor invokes the default constructor before setting the email field.
    // And since I already defined categoryId and dbConnection to be immutable using the val keyword in the default constructor,
    // I do not need to repeat the val keyword in the additional constructor.
    // create an instance using the additional constructor: ItemManager("cat_id", "db://connection", "foo@bar.com")
    constructor(categoryId: String, dbConnection: String, email: String) : this(categoryId, dbConnection) {
        this.email = email
    }

    // define an instance method on ItemManager
    fun isFromSpecificCategory(catId: String): Boolean {
        return categoryId == catId
    }

    fun makeAnalysisOfCategory(catId: String): Unit {
        // conditional statement if is an equivalent of a function that returns some value.
        val result = if (catId == "100") "Yes" else "No"
        println(result)
    }

    // There are some special identifiers in Java language ( is, object, in, ..) that when used in Kotlin code needs to be escaped.
    // For example, we could define a method that has a name object() but we need to remember to escape that name as this is a special identifier in java:
    // Then we could execute that method: `object`
    fun `object`(): String {
        return "this is object"
    }
}