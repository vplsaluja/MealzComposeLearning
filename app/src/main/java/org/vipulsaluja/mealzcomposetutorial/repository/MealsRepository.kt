package org.vipulsaluja.mealzcomposetutorial.repository

import org.vipulsaluja.mealzcomposetutorial.model.MealsCategory
import org.vipulsaluja.mealzcomposetutorial.model.MealsResponse
import org.vipulsaluja.mealzcomposetutorial.network.RetrofitClient

class MealsRepository : IMealsRepository {

    private val retrofitApi = RetrofitClient.getRetrofitApi()

    private var cachedResponse = listOf<MealsCategory>()

    override suspend fun getMealsListing(): MealsResponse {
        val response = retrofitApi.getDishList()
        cachedResponse = response.meals
        return response
    }

    override fun getMeal(id: String): MealsCategory? {
        return cachedResponse.firstOrNull {
            it.id == id
        }
    }

    companion object {
        private var repositoryInstance: MealsRepository? = null

        fun getInstance() = repositoryInstance ?: synchronized(this) {
            repositoryInstance ?: MealsRepository().also { repositoryInstance = it }
        }
    }


}