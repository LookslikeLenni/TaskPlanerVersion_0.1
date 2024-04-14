package com.example.taskplanerversion_01.recipes

data class Step(
    val instructions: String,
    val donE: Boolean = false,
    val time: Int? = null,       // Optional time (in seconds, perhaps)
    val imagePath: String? = null // Optional image path
)