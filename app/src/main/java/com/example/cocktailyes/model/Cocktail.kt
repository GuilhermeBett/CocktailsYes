package com.example.a30_days_of_cocktails.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Cocktail(
    @DrawableRes val imageRes: Int,
    @StringRes val nameRes:Int,
    @StringRes val descriptionRes: Int
)
