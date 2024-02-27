package com.example.cocktailyes.ui

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.cocktailyes.data.AlcoholLevel

@Composable
fun CocktailApp() {
    val viewModel: CocktailViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsState()


    if (uiState.isShowingHomePage){

        CocktailGrid(alcoholLevel = AlcoholLevel.entries, onClickAction ={
            viewModel.navigateToListPage()
            Log.d("Home","HomeScreen")
        } )

    } else if (uiState.isShowingListPage ) {
        CocktailList(cocktails = uiState.cocktailList, onItemClick = {
            viewModel.updateCurrentCockail(it)
            viewModel.navigateToDetailPage()
            Log.d("List","ESTOU NA LISTA")
        })

    }else{
        Cocktail_Details(chosenCocktail = uiState.currentCocktail, onBackPressed = { viewModel.navigateToListPage() })
        Log.d("Details","estou  nos details")

    }
}