package com.example.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.example.crypto.model.News;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomNews {
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private String publishedAt;

    public CustomNews() {
    }

    public CustomNews(News news) {
        this.author = news.getAuthor();
        this.title = news.getTitle();
        this.description = news.getDescription();
        this.url = news.getUrl();
        this.urlToImage = news.getUrlToImage();
        this.publishedAt = news.getPublishedAt();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
}
