package org.vipulsaluja.mealzcomposetutorial.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse
import org.vipulsaluja.mealzcomposetutorial.repository.MealsRepository

class MealsViewModel : ViewModel() {

    private val repository = MealsRepository()

    private var meals: MutableState<MealsResponse> = mutableStateOf(MealsResponse(emptyList()))

    fun fetchMeals() {
        viewModelScope.launch(Dispatchers.IO) {
            val mealsResponse = repository.getMealsListing()
            meals.value = mealsResponse
        }
    }

    fun getMeals(): MealsResponse {
        return meals.value
    }
}