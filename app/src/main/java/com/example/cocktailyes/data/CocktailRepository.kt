package com.example.cocktailyes.data


import com.example.a30_days_of_cocktails.model.Cocktail
import com.example.cocktailyes.R

object CocktailRepository {
    val cocktails = listOf(
        Cocktail(
            id = 1,
            imageRes = R.drawable.aperol_spritz,
            nameRes = R.string.cocktail_aperol_spritz,
            descriptionRes = R.string.description_aperol_spritz,
            alcoholLevel = AlcoholLevel.WEAK
        ),
        Cocktail(
            id = 2,
            imageRes = R.drawable.bellini,
            nameRes = R.string.cocktail_bellini,
            descriptionRes = R.string.description_bellini,
            alcoholLevel = AlcoholLevel.WEAK
        ),
        Cocktail(
            id = 3,
            imageRes = R.drawable.bloddy_mary,
            nameRes = R.string.cocktail_bloody_mary,
            descriptionRes = R.string.description_bloody_mary,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 4,
            imageRes = R.drawable.blue_lagoon,
            nameRes = R.string.cocktail_blue_lagoon,
            descriptionRes = R.string.description_blue_lagoon,
            alcoholLevel = AlcoholLevel.WEAK
        ),
        Cocktail(
            id = 5,
            imageRes = R.drawable.caipirinha,
            nameRes = R.string.cocktail_caipirinha,
            descriptionRes = R.string.description_caipirinha,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 6,
            imageRes = R.drawable.cosmopolitan,
            nameRes = R.string.cocktail_cosmopolitan,
            descriptionRes = R.string.description_cosmopolitan,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 7,
            imageRes = R.drawable.daiquiri,
            nameRes = R.string.cocktail_daiquiri,
            descriptionRes = R.string.description_daiquiri,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 8,
            imageRes = R.drawable.espresso_martini,
            nameRes = R.string.cocktail_espresso_martini,
            descriptionRes = R.string.description_espresso_martini,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 9,
            imageRes = R.drawable.french_75,
            nameRes = R.string.cocktail_french_75,
            descriptionRes = R.string.description_french_75,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 10,
            imageRes = R.drawable.gin_and_tonic,
            nameRes = R.string.cocktail_gin_and_tonic,
            descriptionRes = R.string.description_gin_and_tonic,
            alcoholLevel = AlcoholLevel.WEAK
        ),
        Cocktail(
            id = 11,
            imageRes = R.drawable.long_island_iced_tea,
            nameRes = R.string.cocktail_long_island_iced_tea,
            descriptionRes = R.string.description_long_island_iced_tea,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 12,
            imageRes = R.drawable.mai_tai,
            nameRes = R.string.cocktail_mai_tai,
            descriptionRes = R.string.description_mai_tai,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 13,
            imageRes = R.drawable.margarita,
            nameRes = R.string.cocktail_margarita,
            descriptionRes = R.string.description_margarita,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 14,
            imageRes = R.drawable.martini,
            nameRes = R.string.cocktail_martini,
            descriptionRes = R.string.description_martini,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 15,
            imageRes = R.drawable.mint_julep,
            nameRes = R.string.cocktail_mint_julep,
            descriptionRes = R.string.description_mint_julep,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 17,
            imageRes = R.drawable.moscow_mule,
            nameRes = R.string.cocktail_moscow_mule,
            descriptionRes = R.string.description_moscow_mule,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 18,
            imageRes = R.drawable.negroni,
            nameRes = R.string.cocktail_negroni,
            descriptionRes = R.string.description_negroni,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 19,
            imageRes = R.drawable.old_fashioned,
            nameRes = R.string.cocktail_old_fashioned,
            descriptionRes = R.string.description_old_fashioned,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 20,
            imageRes = R.drawable.paloma,
            nameRes = R.string.cocktail_paloma,
            descriptionRes = R.string.description_paloma,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 21,
            imageRes = R.drawable.pi_a_colada,
            nameRes = R.string.cocktail_pina_colada,
            descriptionRes = R.string.description_pina_colada,
            alcoholLevel = AlcoholLevel.WEAK
        ),
        Cocktail(
            id = 22,
            imageRes = R.drawable.sazerac,
            nameRes = R.string.cocktail_sazerac,
            descriptionRes = R.string.description_sazerac,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 23,
            imageRes = R.drawable.sidecar,
            nameRes = R.string.cocktail_sidecar,
            descriptionRes = R.string.description_sidecar,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 24,
            imageRes = R.drawable.singapore_sling,
            nameRes = R.string.cocktail_singapore_sling,
            descriptionRes = R.string.description_singapore_sling,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 25,
            imageRes = R.drawable.tequila_sunrise,
            nameRes = R.string.cocktail_tequila_sunrise,
            descriptionRes = R.string.description_tequila_sunrise,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 26,
            imageRes = R.drawable.tom_collins,
            nameRes = R.string.cocktail_tom_collins,
            descriptionRes = R.string.description_tom_collins,
            alcoholLevel = AlcoholLevel.MILD
        ),
        Cocktail(
            id = 27,
            imageRes = R.drawable.white_russian,
            nameRes = R.string.cocktail_white_russian,
            descriptionRes = R.string.description_white_russian,
            alcoholLevel = AlcoholLevel.STRONG
        ),
        Cocktail(
            id = 28,
            imageRes = R.drawable.whiskey_sour,
            nameRes = R.string.cocktail_whiskey_sour,
            descriptionRes = R.string.description_whiskey_sour,
            alcoholLevel = AlcoholLevel.MILD
        )
    )
}


