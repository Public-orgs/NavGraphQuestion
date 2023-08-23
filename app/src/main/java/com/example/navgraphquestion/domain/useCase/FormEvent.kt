package com.example.navgraphquestion.domain.useCase

sealed class FormEvent {
    data class NameChanged(val name: String) : FormEvent()
    data class EmailChanged(val email: String) : FormEvent()
    data class FavoriteFruitChanged(val favoriteFruit: String) : FormEvent()
    data class FavoriteVegetableChanged(val favoriteVegetable: String) : FormEvent()
    data class FavoriteDesertChanged(val favoriteDesert: String) : FormEvent()
    data class FavoriteCandyChanged(val favoriteCandy: String) : FormEvent()
    data class NavigateToScreen(val route: String): FormEvent()
    object Submit : FormEvent()
}