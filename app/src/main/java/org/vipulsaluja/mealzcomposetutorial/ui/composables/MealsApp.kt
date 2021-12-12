package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse

@Composable
fun MealsApp(meals: MealsResponse, navController: NavController, modifier: Modifier = Modifier) {
    DishListComposable(meals = meals, navController = navController, modifier = modifier)
}