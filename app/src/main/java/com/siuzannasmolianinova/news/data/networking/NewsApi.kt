package com.siuzannasmolianinova.news.data.networking

import com.siuzannasmolianinova.news.data.Country
import com.siuzannasmolianinova.news.data.Response
import com.siuzannasmolianinova.news.data.db.Category
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/everything")
    fun loadGlobalNews(
        @Query("sources") source: String
    ): Call<Response>

    @GET("v2/top-headlines")
    fun loadNews(
        @Query("country") country: Country,
        @Query("category") category: Category
    ): Call<Response>
}
