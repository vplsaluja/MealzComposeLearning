package org.vipulsaluja.mealzcomposetutorial.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.transform.CircleCropTransformation
import org.vipulsaluja.mealzcomposetutorial.model.MealsCategory

@Composable
fun DishDetailComposable(
    meal: MealsCategory,
    navigateBack: () -> Unit
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = meal.name) },
            navigationIcon = {
                IconButton(onClick = { navigateBack() }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "")
                }
            })
    }) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ) {
                Column(modifier = Modifier.padding(10.dp)) {
                    Image(
                        painter = rememberImagePainter(meal.thumbnail,
                            builder = {
                                transformations(CircleCropTransformation())
                            }), contentDescription = "",
                        modifier = Modifier
                            .size(150.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                    Text(
                        text = meal.name,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(15.dp),
                        style = MaterialTheme.typography.h5
                    )
                }
            }
            Text(
                text = meal.desc,
                modifier = Modifier
                    .padding(15.dp),
                style = MaterialTheme.typography.body1
            )
        }
    }
}