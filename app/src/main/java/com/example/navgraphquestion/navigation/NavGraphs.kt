package com.example.navgraphquestion.navigation

sealed class NavGraphs(val route: String) {
    object SectionOne : NavGraphs("sectionOneNavGraph")
    object SectionTwo : NavGraphs("sectionTwoNavGraph")
}