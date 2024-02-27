package com.example.cocktailyes.ui

import android.util.Log
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cocktailyes.data.AlcoholLevel

@Composable
fun CocktailApp(windowSize: WindowWidthSizeClass,) {
    val viewModel: CocktailViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()

    val contentType = when (windowSize) {
        WindowWidthSizeClass.Compact,
        WindowWidthSizeClass.Medium -> CocktailStateUtils.LIST_ONLY

        WindowWidthSizeClass.Expanded -> CocktailStateUtils.LIST_AND_DETAIL
        else -> CocktailStateUtils.LIST_ONLY
    }

    if (contentType == CocktailStateUtils.LIST_AND_DETAIL){
        if (uiState.isShowingHomePage) {
            CocktailGrid(alcoholLevels = AlcoholLevel.entries, onAlcoholLevelClick = {
                viewModel.showAlcoholLevelCocktails(it)
                viewModel.navigateToListPage()
                Log.d("lololo", "$it")
            })

        }else {
            CocktailListAndDetail(
                cocktails = uiState.cocktailList,
                chosenCocktail = uiState.currentCocktail,
                alcoholLevel = uiState.cocktailAlcohol,
                onItemClick = { viewModel.updateCurrentCockail(it) },
                onBackPressed = { viewModel.navigateToHome() },
                modifier = Modifier.fillMaxSize()
            )
        }
    }else {
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
                onBackPressed = { viewModel.navigateToHome() },
                modifier = Modifier.fillMaxWidth()
            )

        } else {
            Cocktail_Details(
                chosenCocktail = uiState.currentCocktail,
                onBackPressed = { viewModel.navigateToListPage() },
            )
            Log.d("Details", "estou  nos details")

        }
    }
}