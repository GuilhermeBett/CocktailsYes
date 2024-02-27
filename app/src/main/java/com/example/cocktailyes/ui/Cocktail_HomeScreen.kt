package com.example.cocktailyes.ui

import android.service.autofill.OnClickAction
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30_days_of_cocktails.model.Cocktail
import com.example.cocktailyes.data.AlcoholLevel
import com.example.cocktailyes.data.CocktailRepository

@Composable
fun CocktailGrid( // Renamed for consistency
    alcoholLevel: List<AlcoholLevel>,
    onClickAction: (AlcoholLevel)->Unit,
    modifier: Modifier = Modifier
) {
    val distinctAlcoholLevels = alcoholLevel.size
    val columns = distinctAlcoholLevels// Adjust column count as needed

    LazyVerticalGrid(
        modifier = modifier.fillMaxSize(),
        columns = GridCells.Fixed(columns)
    ) {
        items(distinctAlcoholLevels) { level ->
            AlcoholLevelGridItem(alcoholLevel = alcoholLevel[level], onClickAction= {}) // Use correct argument
        }
    }
}

@Composable
fun AlcoholLevelGridItem(
    alcoholLevel: AlcoholLevel,
    onClickAction: (Cocktail)->Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = alcoholLevel.toString(), // Use string resource for label
                style = TextStyle(
                    color = MaterialTheme.colorScheme.onBackground, // Use theme colors
                    fontSize = 16.sp, // Adjust font size
                    fontWeight = FontWeight.Bold
                ),
                modifier = modifier.align(Alignment.CenterHorizontally)
            )
            // Add optional icon or description below the text
        }
    }
}

@Preview
@Composable
fun CocktailGridPreview() { // Renamed for clarity
CocktailGrid(alcoholLevel = AlcoholLevel.entries, onClickAction = {})
}
