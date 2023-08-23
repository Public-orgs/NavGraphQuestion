package com.example.navgraphquestion.ui.screens.home

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@ExperimentalMaterial3Api
@Composable
fun HomeScreen(
    onNavigateScreen: (String) -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text("Home")
                }
            )
        }
    ) { scaffoldPadding ->
        HomeContent(
            modifier = Modifier.padding(scaffoldPadding),
            onNavigateScreen = onNavigateScreen
        )
    }
}