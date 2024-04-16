package com.example.segundoparcial_21767

import androidx.annotation.DrawableRes

data class Persona(
    @DrawableRes val img: Int,
    val profesion: String,
    val sexo: String,
    val edad: Int
)

