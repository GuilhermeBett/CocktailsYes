package com.example.cocktailyes.ui

import com.example.a30_days_of_cocktails.model.Cocktail
import com.example.cocktailyes.data.AlcoholLevel
import com.example.cocktailyes.data.CocktailRepository

data class CocktailUiState(
    val cocktailList: List<Cocktail> = emptyList(),
    val currentCocktail: Cocktail = CocktailRepository.cocktails[0],
    val cocktailAlcohol: AlcoholLevel,
    val isShowingListPage: Boolean = false,
    val isShowingHomePage: Boolean = true,

    )
