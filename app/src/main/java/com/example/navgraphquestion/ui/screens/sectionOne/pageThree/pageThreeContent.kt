package com.example.navgraphquestion.ui.screens.sectionOne.pageThree

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.navgraphquestion.domain.useCase.FormEvent
import com.example.navgraphquestion.domain.useCase.FormState
import com.example.navgraphquestion.navigation.Screens

@Composable
@ExperimentalMaterial3Api
fun PageThreeContent(
    modifier: Modifier,
    formState: FormState,
    onEvent: (FormEvent) -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        OutlinedTextField(
            label = { Text("Favorite Desert") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteDesert,
            onValueChange = {
                onEvent(FormEvent.FavoriteDesertChanged(it))
            }
        )
        OutlinedTextField(
            label = { Text("Favorite Candy") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteCandy,
            onValueChange = {
                onEvent(FormEvent.FavoriteCandyChanged(it))
            }
        )
        Button(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 32.dp).fillMaxWidth(),
            onClick = {
                onEvent(FormEvent.NavigateToScreen(Screens.SectionOneScreenFour.route))
            }
        ) {
            Text(text="Continue")
        }
    }
}