package com.example.crypto.model;


import java.util.List;

public class NewsApiResponse {
    private String status;
    private int totalResults;
    private List<CustomNews> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<CustomNews> getArticles() {
        return articles;
    }

    public void setArticles(List<CustomNews> articles) {
        this.articles = articles;
    }
}
