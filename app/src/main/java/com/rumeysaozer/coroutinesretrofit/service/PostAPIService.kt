package com.rumeysaozer.coroutinesretrofit.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostAPIService {
   private val BASE_URL = "https://dummyjson.com/"
   val api = Retrofit.Builder()
       .baseUrl(BASE_URL)
       .addConverterFactory(GsonConverterFactory.create())
       .build()
       .create(PostAPI::class.java)
}