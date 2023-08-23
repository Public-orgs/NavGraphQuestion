package com.example.navgraphquestion.navigation.destinations.sectionOne

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.navgraphquestion.navigation.Screens
import com.example.navgraphquestion.navigation.navigateSingleTopTo
import com.example.navgraphquestion.navigation.sharedViewModel
import com.example.navgraphquestion.ui.screens.sectionOne.SectionOneViewModel
import com.example.navgraphquestion.ui.screens.sectionOne.pageOne.PageOneScreen
import com.example.navgraphquestion.ui.screens.sectionOne.pageOne.PageTwoScreen

@ExperimentalMaterial3Api
fun NavGraphBuilder.pageTwoComposable(
    navController: NavHostController,
) {
    composable(
        route = Screens.SectionOneScreenTwo.route
    ) { navBackStackEntry ->
        PageTwoScreen(
            viewModel = navBackStackEntry.sharedViewModel(navController = navController),
            onNavigateScreen = {
                navController.navigateSingleTopTo(it)
            }
        )
    }
}
