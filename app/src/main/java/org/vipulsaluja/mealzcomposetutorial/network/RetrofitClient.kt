package org.vipulsaluja.mealzcomposetutorial.network

import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    private const val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"

    fun getRetrofitApi(): RetrofitApi {
        val retrofit = Retrofit.Builder()
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL).build();
        return retrofit.create(RetrofitApi::class.java)
    }
}