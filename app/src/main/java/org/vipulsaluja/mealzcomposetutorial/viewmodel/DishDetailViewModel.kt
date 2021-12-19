package org.vipulsaluja.mealzcomposetutorial.viewmodel

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import org.vipulsaluja.mealzcomposetutorial.model.MealsCategory
import org.vipulsaluja.mealzcomposetutorial.repository.MealsRepository

class DishDetailViewModel(val savedStateHandle: SavedStateHandle) : ViewModel() {

    private val mealsRepository = MealsRepository.getInstance()

    private val mealId = savedStateHandle.get<String>("mealId") ?: ""

    fun getMeal(): MealsCategory? {
        return mealsRepository.getMeal(mealId)
    }


}