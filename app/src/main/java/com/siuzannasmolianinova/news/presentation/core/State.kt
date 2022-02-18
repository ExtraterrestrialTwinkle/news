package com.siuzannasmolianinova.news.presentation.core

import com.siuzannasmolianinova.news.data.db.Article
import kotlinx.coroutines.flow.Flow

sealed class State {
    data class Loading(val isLoading: Boolean) : State()
    data class Success(val data: Flow<List<Article>>) : State()
    data class Error(val error: Throwable) : State()
}
