package com.karimsinouh.onBoarding.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Primary200,
    primaryVariant = PrimaryVariant,
    background = BlackDark,
    surface = BlackLight,
    onBackground = WhiteLight,
    onSurface = WhiteLight,
    onPrimary = BlackDark
)

private val LightColorPalette = lightColors(
    primary = Primary,
    primaryVariant = PrimaryVariant,
    background = WhiteDark,
    surface = WhiteLight,
    onBackground = BlackDark,
    onSurface = BlackDark,
    onPrimary = WhiteLight
)

@Composable
fun OnBoardingTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}