package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
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
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = rememberImagePainter(data = meal.thumbnail,
                    builder = {
                        transformations(CircleCropTransformation())
                    }),
                contentDescription = "",
                modifier = Modifier
                    .size(88.dp)
                    .padding(5.dp)
                    .align(Alignment.CenterVertically)
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth(.8f)
                    .padding(10.dp)
                    .align(Alignment.CenterVertically)
            ) {
                Text(
                    text = meal.name,
                    modifier = Modifier.padding(bottom = 5.dp),
                    style = MaterialTheme.typography.h6
                )
                Text(
                    text = meal.desc,
                    modifier = Modifier.padding(top = 5.dp),
                    style = MaterialTheme.typography.body1,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis
                )
            }
            Icon(
                imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "",
                modifier = Modifier.align(Alignment.CenterVertically)
            )
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
            thumbnail = "https://www.themealdb.com/images/category/beef.png",
            desc = "This is demo description."
        )
    )
}