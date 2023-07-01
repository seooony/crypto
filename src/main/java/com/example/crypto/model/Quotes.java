package com.example.crypto.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quotes {
    private Quote KRW;

    public Quotes() {
    }

    public Quotes(@JsonProperty("KRW") Quote KRW) {
        this.KRW = KRW;
    }

    // Getter and setter methods

    public Quote getKRW() {
        return KRW;
    }

    public void setKRW(Quote KRW) {
        this.KRW = KRW;
    }
}
