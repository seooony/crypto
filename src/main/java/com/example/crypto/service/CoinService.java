package com.example.crypto.service;

import com.example.crypto.model.Coin;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CoinService {

    private static final String API_URL = "https://api.coinpaprika.com/v1/tickers?quotes=KRW";

    public List<Coin> getTop100Coins() {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL;
        Coin[] coins = restTemplate.getForObject(url, Coin[].class);
        List<Coin> coinList = Arrays.asList(coins);
        if (coinList.size() > 100) {
            coinList = coinList.subList(0, 100); // 상위 100개만 유지
        }
        return coinList;
    }
}