package com.example.networks.model

import retrofit2.Call
import retrofit2.http.GET

interface APService {
    @GET("/products/1")
    fun getProduct(): Call<APIResponse>
}