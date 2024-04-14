package com.example.taskplanerversion_01

import com.example.taskplanerversion_01.recipes.Recipe
import com.example.taskplanerversion_01.recipes.Step
import org.junit.Assert.assertEquals
import org.junit.Test

class RecipeAndStepTest {

    @Test
    fun testStep() {
        val step = Step(
            instructions = "Mix ingredients",
            donE = false,
            time = 60,
            imagePath = "/path/to/image"
        )

        assertEquals("Mix ingredients", step.instructions)
        assertEquals(false, step.donE)
        assertEquals(60, step.time)
        assertEquals("/path/to/image", step.imagePath)
    }

    @Test
    fun testRecipe() {
        val steps = listOf(
            Step(
                instructions = "Mix ingredients",
                donE = false,
                time = 60,
                imagePath = "/path/to/image"
            )
        )

        val recipe = Recipe("Recipe 1", "Details for Recipe 1", steps)

        assertEquals("Recipe 1", recipe.title)
        assertEquals("Details for Recipe 1", recipe.description)
        assertEquals(steps, recipe.steps)
    }
}