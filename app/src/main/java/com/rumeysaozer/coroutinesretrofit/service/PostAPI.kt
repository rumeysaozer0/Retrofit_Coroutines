package com.rumeysaozer.coroutinesretrofit.service

import com.rumeysaozer.coroutinesretrofit.model.Post
import retrofit2.Response
import retrofit2.http.GET

interface PostAPI {
    @GET("posts")
    suspend fun getPost(): Response<Post>
}