package com.stah.toeic5

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.stah.toeic5.home.ScoreNavHost
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowLog

@RunWith(RobolectricTestRunner::class)
@Config(
    instrumentedPackages = ["androidx.loader.content"]
)
class NavUnitTest {


    @get:Rule val composeTestRule = createComposeRule()

    @Before
    @Throws(Exception::class)
    fun setUp() {
        ShadowLog.stream = System.out // Redirect Logcat to console
        composeTestRule.setContent {
            navController = rememberNavController()
            ScoreNavHost(navController)
        }
    }

    lateinit var navController: NavHostController

    @Test
    fun homeNavHost() {
        composeTestRule.onNodeWithText("home screen").assertIsDisplayed()
        composeTestRule.onNodeWithTag("input Button").performClick()
    }

    @Test
    fun scoreNavHost() {
        composeTestRule.onNodeWithTag("input Button").performClick()
        composeTestRule.onNodeWithText("score screen").assertIsDisplayed()

    }
    //

}
