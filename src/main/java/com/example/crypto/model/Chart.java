package com.example.crypto.model;

import java.util.List;

public class Chart {
    private List<Double> priceList;

    public Chart() {
    }

    public Chart(List<Double> priceList) {
        this.priceList = priceList;
    }

    public List<Double> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<Double> priceList) {
        this.priceList = priceList;
    }
}
