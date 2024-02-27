package com.example.cocktailyes.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.a30_days_of_cocktails.model.Cocktail
import com.example.cocktailyes.data.AlcoholLevel
import com.example.cocktailyes.data.CocktailRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class CocktailViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(CocktailUiState( cocktailList = CocktailRepository.cocktails,
        currentCocktail = CocktailRepository.cocktails[0], cocktailAlcohol = AlcoholLevel.WEAK
    ))

    val uiState: StateFlow<CocktailUiState> = _uiState

    fun updateCurrentCockail(selectedCocktail: Cocktail) {
        _uiState.update {
            it.copy(currentCocktail = selectedCocktail)
        }
    }

    fun navigateToHome(){
        _uiState.update { it.copy(isShowingHomePage = true) }
    }

    fun navigateToListPage() {
        _uiState.update { it.copy(isShowingListPage = true, isShowingHomePage = false) }
    }

    fun navigateToDetailPage() {
        _uiState.update { it.copy(isShowingListPage = false, isShowingHomePage = false) }
    }


    fun showAlcoholLevelCocktails(alcoholLevel: AlcoholLevel){
        _uiState.update { it.copy(cocktailAlcohol = alcoholLevel) }
        Log.d("lololo","${alcoholLevel}")
    }

}