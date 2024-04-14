package com.example.taskplanerversion_01.recipes

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

import kotlin.math.cos
import kotlin.math.sin

class RecipeView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        val centerX = width / 2f
        val centerY = height / 2f
        val radius = minOf(centerX, centerY) * 0.8.toFloat()

        val textPaint = Paint().apply {
            isAntiAlias = true
            textSize = 36f
        }

        val rL = RecipeManager.recipeList
        for ((index, recipe) in rL.withIndex()) {
            val angle = Math.toRadians((index.toDouble() / rL.size) * 360) // Convert to radians
            val x = centerX + radius * cos(angle).toFloat()
            val y = centerY + radius * sin(angle).toFloat()
            canvas.drawText(recipe.title, x, y, textPaint)
        }
    }


}