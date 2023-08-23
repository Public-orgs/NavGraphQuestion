package com.example.navgraphquestion.navigation.destinations.home

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.navgraphquestion.navigation.Screens
import com.example.navgraphquestion.navigation.navigateSingleTopTo
import com.example.navgraphquestion.ui.screens.home.HomeScreen

@ExperimentalMaterial3Api
fun NavGraphBuilder.homeComposable(
    navController: NavHostController,
) {
    composable(
        route = Screens.Home.route
    ) {
        HomeScreen(
            onNavigateScreen = {
                navController.navigateSingleTopTo(it)
            }
        )
    }
}