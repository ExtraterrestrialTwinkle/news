package com.siuzannasmolianinova.news.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.siuzannasmolianinova.news.data.db.ArticlesDatabase.Companion.DB_VERSION
import com.siuzannasmolianinova.news.data.db.type_converters.CategoryConverter
import com.siuzannasmolianinova.news.data.db.type_converters.CountryConverter

@TypeConverters(CategoryConverter::class, CountryConverter::class)
@Database(
    entities = [
        Article::class
    ],
    version = DB_VERSION
)
abstract class ArticlesDatabase : RoomDatabase() {

    abstract fun articleDao(): ArticleDao

    companion object {
        const val DB_VERSION = 1
        const val DB_NAME = "articles_database"
    }
}
