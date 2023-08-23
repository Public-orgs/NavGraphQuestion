package com.example.navgraphquestion.navigation.destinations.sectionOne

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.navgraphquestion.navigation.Screens
import com.example.navgraphquestion.navigation.sharedViewModel
import com.example.navgraphquestion.ui.screens.sectionOne.pageFour.PageFourScreen

@ExperimentalMaterial3Api
fun NavGraphBuilder.pageFourComposable(
    navController: NavHostController,
) {
    composable(
        route = Screens.SectionOneScreenFour.route
    ) { navBackStackEntry ->
        PageFourScreen(
            viewModel = navBackStackEntry.sharedViewModel(navController = navController),
            onNavigateScreen = {
                navController.popBackStack(it, inclusive = false)
            }
        )
    }
}
