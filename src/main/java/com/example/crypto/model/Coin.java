package com.example.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Coin {
    private String id;
    private String name;
    private String symbol;
    private int rank;
    private double currentPrice;
    private long marketCap;
    private double totalVolume;
    private double priceChangePercentage24h;

    private double marketCapChangePercentage24h;

    private List<Double> priceList;

    // ... 이전 코드 생략 ...

    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }


    public Coin() {
    }

    public Coin(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("symbol") String symbol,
            @JsonProperty("market_cap_rank") int rank,
            @JsonProperty("current_price") double currentPrice,
            @JsonProperty("market_cap") long marketCap,
            @JsonProperty("total_volume") double totalVolume,
            @JsonProperty("price_change_percentage_24h") double priceChangePercentage24h,
            @JsonProperty("market_cap_change_percentage_24h") double marketCapChangePercentage24h) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.currentPrice = currentPrice;
        this.marketCap = marketCap;
        this.totalVolume = totalVolume;
        this.priceChangePercentage24h = priceChangePercentage24h;
        this.marketCapChangePercentage24h = marketCapChangePercentage24h;
    }

    // Getter and Setter methods

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public long getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(long marketCap) {
        this.marketCap = marketCap;
    }

    public double getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(double totalVolume) {
        this.totalVolume = totalVolume;
    }

    public double getPriceChangePercentage24h() {
        return priceChangePercentage24h;
    }

    public void setPriceChangePercentage24h(double priceChangePercentage24h) {
        this.priceChangePercentage24h = priceChangePercentage24h;
    }

    public double getMarketCapChangePercentage24h() {
        return marketCapChangePercentage24h;
    }

    public void setMarketCapChangePercentage24h(double marketCapChangePercentage24h) {
        this.marketCapChangePercentage24h = marketCapChangePercentage24h;
    }
}