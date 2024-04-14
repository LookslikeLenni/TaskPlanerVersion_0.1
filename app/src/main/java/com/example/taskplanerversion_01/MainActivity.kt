package com.example.taskplanerversion_01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.taskplanerversion_01.ui.theme.TaskPlanerVersion_01Theme

import com.example.taskplanerversion_01.recipes.RecipeView
import com.example.taskplanerversion_01.recipes.RecipeManager

import androidx.compose.ui.viewinterop.AndroidView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        RecipeManager.debugExamples()
        print("Hello World")
        setContent {
            TaskPlanerVersion_01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RecipeViewContainer()
                }
            }
        }
    }
}

@Composable
fun RecipeViewContainer() {
    AndroidView(factory = { context ->
        RecipeView(context)
    })
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskPlanerVersion_01Theme {
        RecipeViewContainer()
    }
}