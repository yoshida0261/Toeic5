package com.stah.toeic5

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.test.core.app.ActivityScenario
import junit.framework.Assert.assertEquals
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
@Config(
    instrumentedPackages = ["androidx.loader.content"]
)
class ExampleUnitTest {

    @get:Rule val composeTestRule = createComposeRule()

    @Before
    @Throws(Exception::class)
    fun setUp() {
        ShadowLog.stream = System.out // Redirect Logcat to console
    }

    @Test
    fun `when I test, then it works`() {
        ActivityScenario.launch(MainActivity::class.java)
            .use { scenario ->
                scenario.onActivity { activity: MainActivity ->
                    composeTestRule.onNodeWithTag("input Button").performClick()
                }
            }
    }

    @Test
    fun addition_isCorrect() {
        val json = Json.encodeToString(Data(42, "str"))
        print(json)
        //assertEquals(4, 2 + 2)
    }

    @Test
    fun addTest() {
        assertEquals(4, 2 + 2)
    }
}


@Serializable
data class Data(val a: Int, val b: String)
