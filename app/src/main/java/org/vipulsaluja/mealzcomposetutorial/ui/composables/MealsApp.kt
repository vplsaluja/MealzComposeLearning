package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import java.lang.reflect.Modifier

@Composable
fun MealsApp(navController: NavController, modifier: Modifier) {
    DishViewComposable(dishName = "Demo Dish", modifier = modifier)
}