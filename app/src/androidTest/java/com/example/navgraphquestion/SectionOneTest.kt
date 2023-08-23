package com.example.navgraphquestion

import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.navgraphquestion.navigation.MyNavHost
import com.example.navgraphquestion.navigation.NavGraphs
import com.example.navgraphquestion.navigation.navgraphs.sectionOneNavGraph
import com.example.navgraphquestion.ui.screens.sectionOne.SectionOneViewModel
import com.example.navgraphquestion.ui.theme.NavGraphQuestionTheme
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import kotlin.time.Duration.Companion.seconds

@ExperimentalMaterial3Api
class SectionOneTest {
    @get: Rule
    val composeRule = createAndroidComposeRule<MainActivity>()

    @Before
    fun setup() {
        composeRule.activity.setContent {
            val navController = rememberNavController()

            //This viewmodel gets destroyed before I can use it in the test

            val viewModel = hiltViewModel<SectionOneViewModel>()
            viewModel.formState = viewModel.formState.copy(
                name = "Hello for test!"
            )

            NavGraphQuestionTheme {
                NavHost(
                    navController = navController,
                    startDestination = NavGraphs.SectionOne.route
                ) {
                    sectionOneNavGraph(
                        navController = navController
                    )
                }
            }
        }
    }

    @Test
    fun assert_section_one_loads() {
        composeRule.onNodeWithText("Name").assertExists()
    }

    @Test
    fun assert_navigation_to_page_two_works() {
        composeRule.onNodeWithText("Name").assertExists()
        composeRule.onNodeWithText("Continue").performClick()
        composeRule.onNodeWithText("Name").assertDoesNotExist()
        composeRule.onNodeWithText("Fruit", substring = true).assertExists()
    }

    @Test
    fun assert_name_text_is_empty() {
        composeRule.onNodeWithText("Name").assertExists()
        composeRule.onNodeWithTag("name-textField").assertExists()
        composeRule.onNodeWithTag("name-textField").assertTextEquals("Name", "")
    }

    @Test
    fun assert_name_text_is_not_empty() {
        /*
            How could I run the following code in the test?


            val viewModel = hiltViewModel<SectionOneViewModel>()
            viewModel.formState = viewModel.formState.copy(
                name = "Hello for test!"
            )
        */
        composeRule.onNodeWithText("Name").assertExists()
        composeRule.onNodeWithTag("name-textField").assertExists()
        composeRule.onNodeWithTag("name-textField").assertTextEquals("Name", "Hello for test!")
    }
}