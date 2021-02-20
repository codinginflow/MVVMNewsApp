package com.codinginflow.mvvmnewsapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [NewsArticle::class, BreakingNews::class, SearchResult::class, SearchQueryRemoteKey::class],
    version = 1
)
abstract class NewsArticleDatabase : RoomDatabase() {

    abstract fun newsArticleDao(): NewsArticleDao

    abstract fun searchQueryRemoteKeyDao(): SearchQueryRemoteKeyDao
}