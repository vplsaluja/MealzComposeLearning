package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

@Composable
fun DishViewComposable(dishName: String, modifier: Modifier) {
    Column() {
        Text(text = dishName)
        Text(text = dishName)
    }
}

@Preview
@Composable
fun PreviewDishViewComposable() {
    DishViewComposable(dishName = "Demo Dish", modifier = Modifier())
}