package com.example.crypto.service;
import com.example.crypto.model.Coin;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CoinService {

    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=krw";

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

    public Coin getCoinById(String coinId) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "&ids=" + coinId;
        Coin[] coins = restTemplate.getForObject(url, Coin[].class);
        if (coins != null && coins.length > 0) {
            return coins[0];
        }
        return null;
    }
}
