package com.artemissoftware.hilttutorial.retrofit

import retrofit2.http.GET

interface BlogRetrofit {

    @GET("blogs")
    suspend fun get(): List<BlogNetworkEntity>
}