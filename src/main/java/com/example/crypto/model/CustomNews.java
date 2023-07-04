package com.example.crypto.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomNews implements Comparable<CustomNews> {
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private LocalDateTime publishedAt;
    private String content;
    private News.Source source;

    public CustomNews() {
    }

    public CustomNews(News news) {
        this.author = news.getAuthor();
        this.title = news.getTitle();
        this.description = news.getDescription();
        this.url = news.getUrl();
        this.urlToImage = news.getUrlToImage();
        String publishedAtString = news.getPublishedAt().substring(0, Math.min(news.getPublishedAt().length(), 19));
        this.publishedAt = LocalDateTime.parse(publishedAtString, DateTimeFormatter.ISO_LOCAL_DATE_TIME);


        this.content = news.getContent();
        this.source = news.getSource();
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

    public LocalDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News.Source getSource() {
        return source;
    }

    public void setSource(News.Source source) {
        this.source = source;
    }

    @Override
    public int compareTo(CustomNews other) {
        return this.publishedAt.compareTo(other.publishedAt);
    }
}
