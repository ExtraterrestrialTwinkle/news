package com.siuzannasmolianinova.news.data

import com.siuzannasmolianinova.news.data.db.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Response(
    @Json(name = "status")
    val status: String?,
    @Json(name = "articles")
    val articles: List<Article>
)
