package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse

@Composable
fun MealsApp(title: String, meals: MealsResponse, navigateToDetail: (String) -> Unit) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = title) })
    }) {
        DishListComposable(meals = meals, navigateToDetail = navigateToDetail)
    }
}