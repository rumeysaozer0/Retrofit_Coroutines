package com.rumeysaozer.coroutinesretrofit.model


import com.google.gson.annotations.SerializedName

data class PostX(
    @SerializedName("body")
    val body: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("reactions")
    val reactions: Int,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("title")
    val title: String,
    @SerializedName("userId")
    val userId: Int
)