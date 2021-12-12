package org.vipulsaluja.mealzcomposetutorial.repository

import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse

interface IMealsRepository {
    suspend fun getMealsListing(): MealsResponse
}