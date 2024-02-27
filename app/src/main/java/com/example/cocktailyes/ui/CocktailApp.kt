package com.example.cocktailyes.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CocktailApp(onBackPressed: () -> Unit) {
    val viewModel: CocktailViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()


    if (uiState.isShowingListPage || uiState.isShowingHomePage) {
        CocktailList(cocktails = uiState.cocktailList, onItemClick = {
            viewModel.updateCurrentCockail(it)
            viewModel.navigateToListPage()
        })

    }else{
        Cocktail_Details(chosenCocktail = uiState.currentCocktail, onBackPressed = { viewModel.navigateToListPage() })
    }
}