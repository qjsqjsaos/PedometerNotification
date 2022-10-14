package com.sooyeol.pedometernotification.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.unit.dp

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

private val AndroidBlueColor = Color(0xff9bbed3)
private val AndroidBlueDarkerColor = Color(0xff073042)

val DarkColorPalette = darkColors(
    primary = AndroidBlueColor,
    primaryVariant = AndroidBlueColor,
    secondary = Color(0xff86e6a9),
    surface = AndroidBlueColor.copy(alpha = 0.08f).compositeOver(Color(0xff121212)),
    background = AndroidBlueColor.copy(alpha = 0.08f).compositeOver(Color(0xff121212))
)

val LightColorPalette = lightColors(
    primary = AndroidBlueDarkerColor,
    primaryVariant = AndroidBlueDarkerColor,
    secondary = Color(0xff3ddc84)
)

val Shapes = Shapes(
    small = RoundedCornerShape(16.dp),
    medium = RoundedCornerShape(24.dp),
    large = RoundedCornerShape(24.dp)
)
