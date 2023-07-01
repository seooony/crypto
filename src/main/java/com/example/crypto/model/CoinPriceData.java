package com.example.crypto.model;

import java.util.List;

public class CoinPriceData {
    private List<List<Object>> prices;

    public List<List<Object>> getPrices() {
        return prices;
    }

    public void setPrices(List<List<Object>> prices) {
        this.prices = prices;
    }
}
