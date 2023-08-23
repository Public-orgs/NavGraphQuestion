package com.example.navgraphquestion.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.navgraphquestion.navigation.NavGraphs

@Composable
fun HomeContent(
    modifier: Modifier,
    onNavigateScreen: (String) -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = {
                onNavigateScreen(NavGraphs.SectionOne.route)
            }
        ) {
            Text("Section One")
        }
        Button(
            onClick = {
                onNavigateScreen(NavGraphs.SectionTwo.route)
            }
        ) {
            Text("Section Two")
        }
    }
}