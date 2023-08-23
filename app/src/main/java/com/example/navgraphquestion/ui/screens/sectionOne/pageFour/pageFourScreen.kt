package com.example.navgraphquestion.ui.screens.sectionOne.pageFour

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import com.example.navgraphquestion.ui.screens.sectionOne.SectionOneViewModel

@ExperimentalMaterial3Api
@Composable
fun PageFourScreen(
    viewModel: SectionOneViewModel,
    onNavigateScreen: (String) -> Unit
) {
    LaunchedEffect(viewModel.navigateScreen) {
        if (viewModel.navigateScreen.isNotEmpty()) {
            onNavigateScreen(viewModel.navigateScreen)
            viewModel.resetNavigateScreen()
        }
    }
    PageFourContent(
        modifier = Modifier,
        formState = viewModel.formState,
        onEvent = viewModel::onFormEvent
    )
}