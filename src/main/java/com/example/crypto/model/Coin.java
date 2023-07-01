package com.example.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Coin {
    private String id;
    private String name;
    private String symbol;
    private int rank;
    private long circulatingSupply;
    private long totalSupply;
    private long maxSupply;
    private double betaValue;
    private String firstDataAt;
    private String lastUpdated;
    private Quotes quotes;

    public Coin() {
    }

    public Coin(
            @JsonProperty("id") String id,
            @JsonProperty("name") String name,
            @JsonProperty("symbol") String symbol,
            @JsonProperty("rank") int rank,
            @JsonProperty("circulating_supply") long circulatingSupply,
            @JsonProperty("total_supply") long totalSupply,
            @JsonProperty("max_supply") long maxSupply,
            @JsonProperty("beta_value") double betaValue,
            @JsonProperty("first_data_at") String firstDataAt,
            @JsonProperty("last_updated") String lastUpdated,
            @JsonProperty("quotes") Quotes quotes) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.rank = rank;
        this.circulatingSupply = circulatingSupply;
        this.totalSupply = totalSupply;
        this.maxSupply = maxSupply;
        this.betaValue = betaValue;
        this.firstDataAt = firstDataAt;
        this.lastUpdated = lastUpdated;
        this.quotes = quotes;
    }

    // Getter and setter methods

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

    public long getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(long circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public long getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(long totalSupply) {
        this.totalSupply = totalSupply;
    }

    public long getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(long maxSupply) {
        this.maxSupply = maxSupply;
    }

    public double getBetaValue() {
        return betaValue;
    }

    public void setBetaValue(double betaValue) {
        this.betaValue = betaValue;
    }

    public String getFirstDataAt() {
        return firstDataAt;
    }

    public void setFirstDataAt(String firstDataAt) {
        this.firstDataAt = firstDataAt;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Quotes getQuotes() {
        return quotes;
    }

    public void setQuotes(Quotes quotes) {
        this.quotes = quotes;
    }
}
