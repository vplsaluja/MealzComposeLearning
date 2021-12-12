package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.vipulsaluja.mealzcomposetutorial.model.MealsCategory
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse

@Composable
fun DishViewComposable(meal: MealsCategory, modifier: Modifier = Modifier) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth()
            .padding(all = 5.dp)
            .background(MaterialTheme.colors.background)
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Text(text = meal.name, modifier = Modifier.padding(bottom = 5.dp))
            Text(text = meal.desc, modifier = Modifier.padding(top = 5.dp))
        }

    }
}

@Preview
@Composable
fun PreviewDishViewComposable() {
    DishViewComposable(
        meal = MealsCategory(
            id = "1",
            name = "Dish Demo Name",
            thumbnail = "",
            desc = "This is demo description"
        )
    )
}