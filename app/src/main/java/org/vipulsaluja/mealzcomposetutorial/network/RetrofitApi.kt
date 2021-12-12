package org.vipulsaluja.mealzcomposetutorial.network

import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse
import retrofit2.http.GET

interface RetrofitApi {
    @GET("categories.php")
    suspend fun getDishList(): MealsResponse
}