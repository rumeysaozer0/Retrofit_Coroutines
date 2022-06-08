package com.rumeysaozer.coroutinesretrofit.model


import com.google.gson.annotations.SerializedName

data class Post(
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("posts")
    val posts: List<PostX>,
    @SerializedName("skip")
    val skip: Int,
    @SerializedName("total")
    val total: Int
)