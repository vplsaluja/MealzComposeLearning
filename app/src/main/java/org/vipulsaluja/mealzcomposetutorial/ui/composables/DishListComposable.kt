package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse

@Composable
fun DishListComposable(
    meals: MealsResponse,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(meals.meals) { meal ->
            DishViewComposable(meal = meal)
        }
    }
}