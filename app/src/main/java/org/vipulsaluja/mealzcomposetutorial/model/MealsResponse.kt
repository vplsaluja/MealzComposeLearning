package org.vipulsaluja.mealzcomposetutorial.model

import com.google.gson.annotations.SerializedName

data class MealsResponse(@SerializedName("categories") val meals: List<MealsCategory>?)