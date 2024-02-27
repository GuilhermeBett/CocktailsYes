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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a30_days_of_cocktails.model.Cocktail
import com.example.cocktailyes.data.AlcoholLevel
import com.example.cocktailyes.data.CocktailRepository


@Composable
fun CocktailList(
    cocktails: List<Cocktail>,
    alcoholLevel: AlcoholLevel,
    onItemClick: (Cocktail) -> Unit,
    onBackPressed: () -> Unit,
    modifier: Modifier = Modifier,
) {
    BackHandler {
        onBackPressed()
    }
    LazyColumn(
        verticalArrangement = Arrangement.SpaceBetween, modifier = modifier
            .background(color = Color(0xFFFFE0D5))
            .padding(16.dp)
    ) {

        items(cocktails) { cocktail ->
            if (cocktail.alcoholLevel == alcoholLevel) {
                Spacer(modifier = modifier.padding(12.dp))
                Cocktail_Item(cocktail = cocktail, onItemClick = onItemClick)
            }

        }
    }

}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Cocktail_Item(
    cocktail: Cocktail,
    onItemClick: (Cocktail) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = CardDefaults.cardElevation(),
        modifier = modifier,
        shape = RoundedCornerShape(20.dp),
        onClick = { onItemClick(cocktail) }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .size(128.dp)
        ) {

            Box(modifier = modifier) {
                Image(
                    painter = painterResource(cocktail.imageRes),
                    contentDescription = null,
                    alignment = Alignment.Center,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(128.dp)
                )
            }
            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .background(Color(0xFFFFF7D9))
                    .weight(1f)
            ) {
                Text(
                    text = stringResource(cocktail.nameRes),
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    modifier = modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(20.dp)
                )
                /*Text(
                    text = stringResource(cocktail.descriptionRes),
                    style = MaterialTheme.typography.bodySmall,
                    color = MaterialTheme.colorScheme.secondary,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 3
                )
                */Spacer(Modifier.weight(1f))
                Row {
                    Text(
                        text = "",
                        style = MaterialTheme.typography.bodySmall
                    )
                    Spacer(Modifier.weight(1f))
                    Text(
                        text = (cocktail.alcoholLevel.toString()),
                        style = MaterialTheme.typography.labelSmall,
                        modifier = modifier.padding(10.dp)
                    )

                }
            }
        }
    }
}

@Composable
fun CocktailListAndDetail(
    cocktails: List<Cocktail>,
    chosenCocktail: Cocktail,
    alcoholLevel: AlcoholLevel,
    onItemClick: (Cocktail) -> Unit,
    onBackPressed: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
    ) {
        CocktailList(
            cocktails = cocktails,
            onItemClick = onItemClick,
            alcoholLevel = alcoholLevel,
            onBackPressed = onBackPressed,
            modifier = Modifier
                .weight(2f)
                .padding(horizontal = 16.dp)

        )
        Cocktail_Details(
            chosenCocktail = chosenCocktail,
            modifier = Modifier.weight(3f).align(Alignment.CenterVertically),
            onBackPressed = onBackPressed,
        )
    }
}


@Preview
@Composable
fun Cocktail_ItemPreview() {
    Cocktail_Item(cocktail = CocktailRepository.cocktails[12], onItemClick = {})
}

@Preview(showBackground = true)
@Composable
fun CocktailListPreview() {

}

@Preview(device = Devices.TABLET)
@Composable
fun CocktailListAndDetailPreview() {

    CocktailListAndDetail(
        cocktails = CocktailRepository.cocktails,
        chosenCocktail = CocktailRepository.cocktails[12],
        alcoholLevel = AlcoholLevel.WEAK,
        onItemClick = {},
        onBackPressed = {},
        modifier = Modifier.fillMaxSize()
    )
}
