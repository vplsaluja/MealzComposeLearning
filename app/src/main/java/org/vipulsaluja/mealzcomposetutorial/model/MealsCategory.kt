package org.vipulsaluja.mealzcomposetutorial.model

import com.google.gson.annotations.SerializedName

data class MealsCategory(
    @SerializedName("idCategory") val id: String,
    @SerializedName("strCategory") val name: String,
    @SerializedName("strCategoryThumb") val thumbnail: String,
    @SerializedName("strCategoryDescription") val desc: String
)