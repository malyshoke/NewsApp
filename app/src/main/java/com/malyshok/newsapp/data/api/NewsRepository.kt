package com.malyshok.newsapp.data.api

import com.malyshok.newsapp.models.Article
import ru.mvlikhachev.newsapp.data.db.ArticleDao
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsService: NewsService) {
    suspend fun getNews(countryCode: String, pageNumber: Int) =
        newsService.getHeadlines(countryCode = countryCode, page = pageNumber)

    suspend fun getSearchNews(query: String, pageNumber: Int) =
        newsService.getEverything(query = query, page = pageNumber)
}