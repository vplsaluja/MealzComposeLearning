package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse

@Composable
fun DishListComposable(
    meals: MealsResponse,
    navigateToDetail: (String) -> Unit
) {
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(meals.meals) { meal ->
            DishViewComposable(
                meal = meal,
                navigateToDetail = navigateToDetail
            )
        }
    }
}