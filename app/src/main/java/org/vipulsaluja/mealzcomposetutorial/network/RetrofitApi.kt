package org.vipulsaluja.mealzcomposetutorial.network

import org.vipulsaluja.mealzcomposetutorial.model.MealsCategory
import retrofit2.http.GET

interface RetrofitApi {
    @GET("categories.php")
    fun getDishList(): List<MealsCategory>
}