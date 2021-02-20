package com.codinginflow.mvvmnewsapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news_articles")
data class NewsArticle(
    val title: String?,
    @PrimaryKey val url: String,
    val thumbnailUrl: String?,
    val isBookmarked: Boolean,
    val updatedAt: Long = System.currentTimeMillis()
)

@Entity(tableName = "breaking_news")
data class BreakingNews(
    val articleUrl: String,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)

@Entity(tableName = "search_results", primaryKeys = ["searchQuery", "articleUrl"])
data class SearchResult(
    val searchQuery: String,
    val articleUrl: String,
    val queryPosition: Int
)