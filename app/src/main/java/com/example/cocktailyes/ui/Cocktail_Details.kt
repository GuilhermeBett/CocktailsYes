package com.example.cocktailyes.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30_days_of_cocktails.model.Cocktail
import com.example.cocktailyes.data.CocktailRepository


@Composable
fun Cocktail_Details(
    chosenCocktail: Cocktail,
    onBackPressed: () -> Unit,
    modifier: Modifier = Modifier
) {
    BackHandler {
        onBackPressed()
    }
    val scrollState = rememberScrollState()

    Box(modifier = modifier
        .fillMaxSize()
        .background(color = Color(0xFFD0BCFF))) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .verticalScroll(state = scrollState)
        ) {
            Surface(
                color = Color(0xFFEFB8C8),
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 84.dp)
                    .shadow(elevation = 2.dp)
            ) {
                Column(
                    modifier = modifier.padding(16.dp)
                ) {
                    Row(
                        modifier = modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        Text(
                            text = stringResource(chosenCocktail.nameRes),
                            modifier = modifier.padding(start = 90.dp),
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,


                            )

                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Image(
                        painter = painterResource(chosenCocktail.imageRes),
                        contentDescription = chosenCocktail.nameRes.toString(),
                        modifier = modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(140.dp)),
                        contentScale = ContentScale.FillWidth

                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = stringResource(chosenCocktail.descriptionRes),
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(
                            vertical = 24.dp,
                            horizontal = 40.dp
                        )
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Cocktail_DetailsPreview() {
    Cocktail_Details(CocktailRepository.cocktails[18], onBackPressed = {})
}
