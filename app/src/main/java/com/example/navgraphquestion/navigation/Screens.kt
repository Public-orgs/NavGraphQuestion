package com.example.navgraphquestion.navigation

sealed class Screens(val route: String) {
    object Home: Screens("homeScreen")
    object SectionOneScreenOne : Screens("sectionOneScreenOne")
    object SectionOneScreenTwo : Screens("sectionOneScreenTwo")
    object SectionOneScreenThree : Screens("sectionOneScreenThree")
    object SectionOneScreenFour : Screens("sectionOneScreenFour")
}