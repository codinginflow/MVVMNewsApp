package com.codinginflow.mvvmnewsapp.data

import com.codinginflow.mvvmnewsapp.api.NewsApi
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsApi: NewsApi,
    private val newsArticleDb: NewsArticleDatabase
) {
    private val newsArticleDao = newsArticleDb.newsArticleDao()
}