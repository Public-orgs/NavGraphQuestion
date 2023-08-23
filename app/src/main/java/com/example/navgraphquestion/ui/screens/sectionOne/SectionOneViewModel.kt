package com.example.navgraphquestion.ui.screens.sectionOne

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.navgraphquestion.domain.useCase.FormEvent
import com.example.navgraphquestion.domain.useCase.FormState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SectionOneViewModel @Inject constructor(): ViewModel() {

    var navigateScreen by mutableStateOf("")
        private set

    fun resetNavigateScreen() {
        navigateScreen = ""
    }

    var formState by mutableStateOf(FormState())

    fun onFormEvent(event: FormEvent) {
        when(event) {
            is FormEvent.NameChanged -> {
                formState = formState.copy(name = event.name)
            }
            is FormEvent.EmailChanged -> {
                formState = formState.copy(email = event.email)
            }
            is FormEvent.FavoriteFruitChanged -> {
                formState = formState.copy(favoriteFruit = event.favoriteFruit)
            }
            is FormEvent.FavoriteVegetableChanged -> {
                formState = formState.copy(favoriteVegetable = event.favoriteVegetable)
            }
            is FormEvent.FavoriteCandyChanged -> {
                formState = formState.copy(favoriteCandy = event.favoriteCandy)
            }
            is FormEvent.FavoriteDesertChanged -> {
                formState = formState.copy(favoriteDesert = event.favoriteDesert)
            }
            is FormEvent.NavigateToScreen -> {
                navigateScreen = event.route
            }
            FormEvent.Submit -> handleFormSubmit()
        }
    }

    private fun handleFormSubmit() {

    }
}