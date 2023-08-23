package com.example.navgraphquestion

import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.rememberNavController
import com.example.navgraphquestion.navigation.MyNavHost
import com.example.navgraphquestion.ui.theme.NavGraphQuestionTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

@ExperimentalMaterial3Api
class EndToEndTest {
    @get: Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {
        composeRule.activity.setContent {
            val navController = rememberNavController()
            NavGraphQuestionTheme {
                MyNavHost(
                    navController = navController
                )
            }
        }
    }

    @Test
    fun assert_home_screen_loads() {
        composeRule.onNodeWithText("Home").assertExists()
    }

    @Test
    fun assert_navigation_to_section_one() {
        composeRule.onNodeWithText("Home").assertExists()
        composeRule.onNodeWithText("Section One").performClick()
        composeRule.onNodeWithText("Name").assertExists()
    }
}