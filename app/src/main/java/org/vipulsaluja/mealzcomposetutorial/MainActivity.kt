package org.vipulsaluja.mealzcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.vipulsaluja.mealzcomposetutorial.ui.composables.DishDetailComposable
import org.vipulsaluja.mealzcomposetutorial.ui.composables.MealsApp
import org.vipulsaluja.mealzcomposetutorial.ui.theme.MealzComposeTutorialTheme
import org.vipulsaluja.mealzcomposetutorial.viewmodel.DishDetailViewModel
import org.vipulsaluja.mealzcomposetutorial.viewmodel.MealsViewModel

class MainActivity : ComponentActivity() {

    private val mealsViewModel: MealsViewModel by viewModels()

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
                            MealsApp(
                                title = getString(R.string.app_name),
                                meals = mealsViewModel.getMeals()
                            ) { mealId ->
                                navController.navigate("meals_detail/$mealId")
                            }
                        }
                        composable(
                            route = "meals_detail/{mealId}",
                            arguments = listOf(navArgument("mealId") {
                                type = NavType.StringType
                            })
                        ) {
                            val dishDetailViewModel: DishDetailViewModel = viewModel()
                            dishDetailViewModel.getMeal()
                                ?.let { item ->
                                    DishDetailComposable(
                                        meal = item,
                                        navigateBack = { navController.popBackStack() }
                                    )
                                }
                        }
                    }
                }
            }
        }
    }
}
