package com.example.navgraphquestion.navigation.navgraphs

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.example.navgraphquestion.navigation.NavGraphs
import com.example.navgraphquestion.navigation.Screens
import com.example.navgraphquestion.navigation.destinations.sectionOne.pageFourComposable
import com.example.navgraphquestion.navigation.destinations.sectionOne.pageOneComposable
import com.example.navgraphquestion.navigation.destinations.sectionOne.pageThreeComposable
import com.example.navgraphquestion.navigation.destinations.sectionOne.pageTwoComposable

@ExperimentalMaterial3Api
fun NavGraphBuilder.sectionOneNavGraph(
    navController: NavHostController
) {
    navigation(
        route = NavGraphs.SectionOne.route,
        startDestination = Screens.SectionOneScreenOne.route
    ) {
        pageOneComposable(
            navController = navController,
        )
        pageTwoComposable(
            navController = navController,
        )
        pageThreeComposable(
            navController = navController,
        )
        pageFourComposable(
            navController = navController,
        )
    }
}