package com.example.crypto.service;

import com.example.crypto.model.Coin;
import com.example.crypto.model.CoinPriceData;
import com.example.crypto.model.Chart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CoinService {

    private static final String API_URL = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd";
    private static final String PRICE_API_URL = "https://api.coingecko.com/api/v3/coins/{coinName}/market_chart?vs_currency=usd&days={days}";


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

    public Chart getCoinPriceChart(String coinId, int days) {
        String priceUrl = PRICE_API_URL.replace("{coinName}", coinId) + "&days=" + days;
        RestTemplate restTemplate = new RestTemplate();
        try {
            CoinPriceData coinPriceData = restTemplate.getForObject(priceUrl, CoinPriceData.class);
            if (coinPriceData != null) {
                List<List<Object>> prices = coinPriceData.getPrices();
                List<Double> priceList = new ArrayList<>();
                for (List<Object> priceData : prices) {
                    if (priceData.size() == 2 && priceData.get(1) instanceof Double) {
                        Double price = (Double) priceData.get(1);
                        priceList.add(price);
                    }
                }
                return new Chart(priceList);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }



}
