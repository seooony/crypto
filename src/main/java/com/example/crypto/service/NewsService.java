package com.example.crypto.service;

import com.example.crypto.model.CustomNews;
import com.example.crypto.model.News;
import com.example.crypto.model.NewsApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class NewsService {

    private static final String API_URL = "https://newsapi.org/v2/everything?q={coinName}&apiKey={apiKey}";

    private final RestTemplate restTemplate;
    private final String apiKey;

    public NewsService() {
        this.restTemplate = new RestTemplate();
        this.apiKey = "25f38055cf9240b6a94b60e0c8f810f3";
    }

    public List<CustomNews> getNewsByCoin(String coin) {
        String url = API_URL.replace("{coinName}", coin).replace("{apiKey}", apiKey);
        NewsApiResponse response = restTemplate.getForObject(url, NewsApiResponse.class);
        if (response != null && response.getArticles() != null) {
            List<News> articles = convertToNews(response.getArticles());
            List<CustomNews> customNewsList = convertToCustomNews(articles);
            sortArticlesByPublishedAt(customNewsList);
            return customNewsList;
        }
        return new ArrayList<>();
    }

    private List<News> convertToNews(List<CustomNews> customNewsList) {
        List<News> newsList = new ArrayList<>();
        for (CustomNews customNews : customNewsList) {
            News news = new News();
            news.setAuthor(customNews.getAuthor());
            news.setTitle(customNews.getTitle());
            news.setDescription(customNews.getDescription());
            news.setUrl(customNews.getUrl());
            news.setUrlToImage(customNews.getUrlToImage());
            news.setPublishedAt(customNews.getPublishedAt().toString()); // LocalDateTime을 String으로 변환
            news.setContent(customNews.getContent());
            news.setSource(customNews.getSource());
            newsList.add(news);
        }
        return newsList;
    }


    private List<CustomNews> convertToCustomNews(List<News> newsList) {
        List<CustomNews> customNewsList = new ArrayList<>();
        for (News news : newsList) {
            CustomNews customNews = new CustomNews(news);
            customNewsList.add(customNews);
        }
        return customNewsList;
    }

    private void sortArticlesByPublishedAt(List<CustomNews> articles) {
        Collections.sort(articles, Comparator.comparing(CustomNews::getPublishedAt).reversed());
    }

}
