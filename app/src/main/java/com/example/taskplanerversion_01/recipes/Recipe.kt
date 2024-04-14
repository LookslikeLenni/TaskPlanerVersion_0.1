package com.example.taskplanerversion_01.recipes

data class Recipe(
    val title: String,
    val description: String,
    val steps: List<Step>   // Using a List for steps
)
