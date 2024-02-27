package com.example.cocktailyes.ui.theme

import androidx.compose.ui.graphics.Color

import androidx.wear.compose.material.Colors

val lightColors = Colors(
    primary = Color(0xFFD0BCFF), // Purple80 from your code
    primaryVariant = Color(0xFFCCC2DC), // PurpleGrey80 from your code
    secondary = Color(0xFFEFB8C8), // Pink80 from your code
    background = Color(0xFFF5F5F5), // Adjust if needed (light background)
    surface = Color(0xFFF5F5F5), // Adjust if needed (light surface)
    onPrimary = Color.Black, // Text color on primary background
    onSecondary = Color.Black, // Text color on secondary background
    onBackground = Color.Black, // Text color on background
    onSurface = Color.Black  // Text color on surface
)

val darkColors = Colors(
    primary = Color(0xFF6650a4), // Purple40 from your code
    primaryVariant = Color(0xFF625b71), // PurpleGrey40 from your code
    secondary = Color(0xFFEFB8C8), // Pink80 from your code (use same for consistency)
    background = Color(0xFF121212), // Adjust if needed (dark background)
    surface = Color(0xFF121212), // Adjust if needed (dark surface)
    onPrimary = Color.White, // Text color on primary background
    onSecondary = Color.White, // Text color on secondary background
    onBackground = Color.White, // Text color on background
    onSurface = Color.White  // Text color on surface
)
