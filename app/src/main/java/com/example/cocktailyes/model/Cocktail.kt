package com.example.a30_days_of_cocktails.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.cocktailyes.data.AlcoholLevel

data class Cocktail(
    val id: Int,
    @DrawableRes val imageRes: Int,
    @StringRes val nameRes:Int,
    @StringRes val descriptionRes: Int,
    val alcoholLevel: AlcoholLevel
)
