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
import com.example.navgraphquestion.ui.screens.sectionOne.pageThree.PageThreeScreen

@ExperimentalMaterial3Api
fun NavGraphBuilder.pageThreeComposable(
    navController: NavHostController,
) {
    composable(
        route = Screens.SectionOneScreenThree.route
    ) { navBackStackEntry ->
        PageThreeScreen(
            viewModel = navBackStackEntry.sharedViewModel(navController = navController),
            onNavigateScreen = {
                navController.navigateSingleTopTo(it)
            }
        )
    }
}
