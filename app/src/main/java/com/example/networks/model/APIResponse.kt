package com.example.networks.model

import com.google.gson.annotations.SerializedName

data class APIResponse (
    @SerializedName("id")
    var id: Int,
    @SerializedName("price")
    var price: String,
    @SerializedName("title")
    var title: String,
    @SerializedName("category")
    var category: String,
    @SerializedName("description")
    var description: String,
    @SerializedName("image")
    var image: String
)

