package com.example.cocktailyes.ui

import android.util.Log
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cocktailyes.data.AlcoholLevel

@Composable
fun CocktailApp() {
    val viewModel: CocktailViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()


    if (uiState.isShowingHomePage) {

        CocktailGrid(alcoholLevels = AlcoholLevel.entries, onAlcoholLevelClick = {
            viewModel.showAlcoholLevelCocktails(it)
            viewModel.navigateToListPage()
            Log.d("lololo", "$it")
        })

    } else if (uiState.isShowingListPage) {
        CocktailList(
            cocktails = uiState.cocktailList,
            alcoholLevel = uiState.cocktailAlcohol,
            onItemClick = {
                viewModel.updateCurrentCockail(it)
                viewModel.navigateToDetailPage()
                Log.d("List", "ESTOU NA LISTA")
            },
            onBackPressed = { viewModel.navigateToHome() })

    } else {
        Cocktail_Details(
            chosenCocktail = uiState.currentCocktail,
            onBackPressed = { viewModel.navigateToListPage() })
        Log.d("Details", "estou  nos details")

    }
}