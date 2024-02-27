    package com.example.cocktailyes.ui

    import androidx.compose.foundation.layout.Column
    import androidx.compose.foundation.layout.fillMaxSize
    import androidx.compose.foundation.layout.fillMaxWidth
    import androidx.compose.foundation.layout.padding
    import androidx.compose.foundation.lazy.grid.GridCells
    import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
    import androidx.compose.foundation.lazy.grid.items
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material3.Card
    import androidx.compose.material3.ExperimentalMaterial3Api
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
    import androidx.lifecycle.viewmodel.compose.viewModel
    import com.example.a30_days_of_cocktails.model.Cocktail
    import com.example.cocktailyes.data.AlcoholLevel
    import com.example.cocktailyes.data.CocktailRepository

    @Composable
    fun CocktailGrid(
        alcoholLevels: List<AlcoholLevel>,
        onAlcoholLevelClick: (AlcoholLevel) -> Unit,
        modifier: Modifier = Modifier
    ) {
        val distinctAlcoholLevels = alcoholLevels.distinct()
        val columns = distinctAlcoholLevels.size

        LazyVerticalGrid(
            modifier = modifier.fillMaxSize(),
            columns = GridCells.Fixed(columns)
        ) {
            items(distinctAlcoholLevels) { alcoholLevel ->
                AlcoholLevelGridItem(alcoholLevel = alcoholLevel, onAlcoholLevelClick = onAlcoholLevelClick)
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun AlcoholLevelGridItem(
        alcoholLevel: AlcoholLevel,
        onAlcoholLevelClick: (AlcoholLevel) -> Unit,
        modifier: Modifier = Modifier
    ) {
        Card(
            modifier = modifier
                .padding(8.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(8.dp),
            onClick = { onAlcoholLevelClick(alcoholLevel) }
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = alcoholLevel.toString(),
                    style = TextStyle(
                        color = MaterialTheme.colorScheme.onBackground,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    ),
                    modifier = modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
    }

    @Preview
    @Composable
    fun CocktailGridPreview() {
        CocktailGrid(alcoholLevels = AlcoholLevel.entries.toList(), onAlcoholLevelClick = {})
    }
