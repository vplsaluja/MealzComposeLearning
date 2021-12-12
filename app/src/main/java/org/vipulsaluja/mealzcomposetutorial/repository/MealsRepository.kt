package org.vipulsaluja.mealzcomposetutorial.repository

import org.vipulsaluja.mealzcomposetutorial.model.MealsCategory
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse
import org.vipulsaluja.mealzcomposetutorial.network.RetrofitClient

class MealsRepository : IMealsRepository {

    private val retrofitApi = RetrofitClient.getRetrofitApi()

    override suspend fun getMealsListing(): MealsResponse {
        return retrofitApi.getDishList()
    }
}