package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import org.vipulsaluja.mealzcomposetutorial.model.MealsCategory

@Composable
fun DishDetailComposable(meal: MealsCategory) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Column() {
            Image(
                painter = rememberImagePainter(meal.thumbnail,
                    builder = {
                        transformations(CircleCropTransformation())
                    }), contentDescription = "",
                modifier = Modifier.size(150.dp)
            )

            Text(text = meal.name)

            Text(text = meal.desc)
        }

    }

}

@Preview
@Composable
fun PreviewDishDetail() {
    DishDetailComposable(meal = MealsCategory("1", "Demo Dish", "", ""))
}