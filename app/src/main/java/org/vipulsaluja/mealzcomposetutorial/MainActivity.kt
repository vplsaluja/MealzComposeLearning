package org.vipulsaluja.mealzcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.vipulsaluja.mealzcomposetutorial.ui.composables.MealsApp
import org.vipulsaluja.mealzcomposetutorial.ui.theme.MealzComposeTutorialTheme
import org.vipulsaluja.mealzcomposetutorial.viewmodel.MealsViewModel
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {

    private val mealsViewModel:MealsViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MealzComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "meals_listing") {
                        composable(route = "meals_listing") {
                            mealsViewModel.fetchMeals()
                            MealsApp(navController = navController, modifier = Modifier())
                        }
                    }
                }
            }
        }


    }
}
