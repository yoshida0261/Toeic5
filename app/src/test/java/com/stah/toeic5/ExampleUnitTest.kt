package com.stah.toeic5

import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun addition_isCorrect() {
        val json = Json.encodeToString(Data(42, "str"))
        print(json)
        //assertEquals(4, 2 + 2)
    }
}


@Serializable
data class Data(val a: Int, val b: String)
