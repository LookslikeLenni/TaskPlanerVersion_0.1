package com.example.taskplanerversion_01.recipes

class RecipeManager {

    companion object {
        val recipeList: List<Recipe> = exampleRecipes()
        fun exampleRecipes(): List<Recipe> {
            val steps1 = listOf(
                Step(
                    instructions = "Cut Vegetables",
                    donE = false,
                    time = 5,
                ),
                Step(
                    instructions = "Mix ingredients",
                    donE = false,
                    time = 2,

                    ),
                Step(
                    instructions = "Bake at 350 degrees",
                    donE = false,
                    time = 60,

                    )
            )

            val steps2 = listOf(
                Step(
                    instructions = "Peel Carrots",
                    donE = false,
                    time = 5,
                ),
                Step(
                    instructions = "Make dip",
                    donE = false,
                    time = 10,

                    )
            )

            return listOf(
                Recipe("Recipe 1", "Details for Recipe 1", steps1),
                Recipe("Recipe 2", "Details for Recipe 2", steps2)
            )
        }

        fun debugExamples() {
            for (recipe in recipeList) {
                println("Recipe: ${recipe.title}")
                for (step in recipe.steps) {
                    println("Step: ${step.instructions}")
                    println("Time: ${step.time} seconds")
                }
            }
        }
    }


}