package com.example.crypto.service;

import com.example.crypto.model.CustomNews;
import com.example.crypto.model.NewsApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
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
            return response.getArticles();
        }
        return new ArrayList<>();
    }
}
