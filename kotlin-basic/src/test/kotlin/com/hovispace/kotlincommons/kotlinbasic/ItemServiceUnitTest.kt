package com.hovispace.kotlincommons.kotlinbasic

import org.junit.jupiter.api.Test
import kotlin.test.assertNotNull

class ItemServiceUnitTest {

    @Test
    fun test_findItemNameForId() {
        val id = "item_id"
        val itemService = ItemService()

        val result = itemService.findItemNameForId(id)

        // We are seeing here that after executing method findItemNameForId(), the returned type is of Kotlin Nullable.
        // To access a field of that object (id), we need to handle that case at compile time.
        // Method let() will execute only if a result is non-nullable.
        // Id field can be accessed inside of a lambda function because it is null safe.
        assertNotNull(result?.let { it -> it.id })

        // Another way to access that nullable object field is to use Kotlin operator !!. It is equivalent to:
        // if (result == null){
        //    throwNpe();
        // }
        // return result;
        //
        // If that object is a null, it will throw a NullPointerException. Otherwise, it will return a proper object. Function throwNpe() is a Kotlin internal function.
        assertNotNull(result!!.id)
    }
}