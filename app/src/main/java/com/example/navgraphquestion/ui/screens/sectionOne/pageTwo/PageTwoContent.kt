package com.example.navgraphquestion.ui.screens.sectionOne.pageOne

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
fun PageTwoContent(
    modifier: Modifier,
    formState: FormState,
    onEvent: (FormEvent) -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        OutlinedTextField(
            label = { Text("Favorite Fruit") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteFruit,
            onValueChange = {
                onEvent(FormEvent.FavoriteFruitChanged(it))
            }
        )
        OutlinedTextField(
            label = { Text("Favorite Vegetable") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteVegetable,
            onValueChange = {
                onEvent(FormEvent.FavoriteVegetableChanged(it))
            }
        )
        Button(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 32.dp).fillMaxWidth(),
            onClick = {
                onEvent(FormEvent.NavigateToScreen(Screens.SectionOneScreenThree.route))
            }
        ) {
            Text(text="Continue")
        }
    }
}