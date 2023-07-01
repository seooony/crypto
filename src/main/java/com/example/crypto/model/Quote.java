package com.example.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {
    private double price;
    private long marketCap;
    private double volume24h;
    private double percentChange1h;
    private double percentChange24h;
    private double percentChange7d;
    private double percentChange30d;
    private double percentChange60d;
    private double percentChange90d;

    public Quote() {
    }

    public Quote(
            @JsonProperty("price") double price,
            @JsonProperty("market_cap") long marketCap,
            @JsonProperty("volume_24h") double volume24h,
            @JsonProperty("percent_change_1h") double percentChange1h,
            @JsonProperty("percent_change_24h") double percentChange24h,
            @JsonProperty("percent_change_7d") double percentChange7d,
            @JsonProperty("percent_change_30d") double percentChange30d,
            @JsonProperty("percent_change_60d") double percentChange60d,
            @JsonProperty("percent_change_90d") double percentChange90d) {
        this.price = price;
        this.marketCap = marketCap;
        this.volume24h = volume24h;
        this.percentChange1h = percentChange1h;
        this.percentChange24h = percentChange24h;
        this.percentChange7d = percentChange7d;
        this.percentChange30d = percentChange30d;
        this.percentChange60d = percentChange60d;
        this.percentChange90d = percentChange90d;
    }

    // Getter and setter methods

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public double getVolume24h() {
        return volume24h;
    }

    public void setVolume24h(double volume24h) {
        this.volume24h = volume24h;
    }

    public double getPercentChange1h() {
        return percentChange1h;
    }

    public void setPercentChange1h(double percentChange1h) {
        this.percentChange1h = percentChange1h;
    }

    public double getPercentChange24h() {
        return percentChange24h;
    }

    public void setPercentChange24h(double percentChange24h) {
        this.percentChange24h = percentChange24h;
    }

    public double getPercentChange7d() {
        return percentChange7d;
    }

    public void setPercentChange7d(double percentChange7d) {
        this.percentChange7d = percentChange7d;
    }

    public double getPercentChange30d() {
        return percentChange30d;
    }

    public void setPercentChange30d(double percentChange30d) {
        this.percentChange30d = percentChange30d;
    }

    public double getPercentChange60d() {
        return percentChange60d;
    }

    public void setPercentChange60d(double percentChange60d) {
        this.percentChange60d = percentChange60d;
    }

    public double getPercentChange90d() {
        return percentChange90d;
    }

    public void setPercentChange90d(double percentChange90d) {
        this.percentChange90d = percentChange90d;
    }
}
