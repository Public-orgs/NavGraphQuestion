package com.example.navgraphquestion.ui.screens.sectionOne.pageFour

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
fun PageFourContent(
    modifier: Modifier,
    formState: FormState,
    onEvent: (FormEvent) -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth(),
    ) {
        OutlinedTextField(
            label = { Text("Name") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.name,
            onValueChange = {},
            enabled = false
        )
        OutlinedTextField(
            label = { Text("Email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.email,
            onValueChange = {},
            enabled = false
        )
        OutlinedTextField(
            label = { Text("Favorite Fruit") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteFruit,
            onValueChange = {},
            enabled = false
        )
        OutlinedTextField(
            label = { Text("Favorite Vegetable") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteVegetable,
            onValueChange = {},
            enabled = false
        )
        OutlinedTextField(
            label = { Text("Favorite Desert") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteDesert,
            onValueChange = {},
            enabled = false
        )
        OutlinedTextField(
            label = { Text("Favorite Candy") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            value = formState.favoriteCandy,
            onValueChange = {},
            enabled = false
        )
        Button(
            modifier = Modifier.padding(vertical = 16.dp, horizontal = 32.dp).fillMaxWidth(),
            onClick = {
                onEvent(FormEvent.NavigateToScreen(Screens.Home.route))
            }
        ) {
            Text(text="Finish")
        }
    }
}