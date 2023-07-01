package com.example.crypto.controller;

import com.example.crypto.model.Coin;
import com.example.crypto.model.CustomNews;
import com.example.crypto.model.Chart;
import com.example.crypto.service.CoinService;
import com.example.crypto.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CoinController {

    private final CoinService coinService;
    private final NewsService newsService;

    @Autowired
    public CoinController(CoinService coinService, NewsService newsService) {
        this.coinService = coinService;
        this.newsService = newsService;
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {
        List<Coin> coins = coinService.getTop100Coins();
        model.addAttribute("coins", coins);
        return "index";
    }

    @GetMapping("/coin/{coinId}")
    public String getCoinPage(@PathVariable("coinId") String coinId, Model model) {
        Coin coin = coinService.getCoinById(coinId);
        if (coin == null) {
            // 적절한 오류 처리를 수행하거나 오류 페이지로 리다이렉트 등을 처리
            return "error";
        }

        model.addAttribute("coin", coin);

        // 클릭한 코인에 대한 뉴스 기사 가져오기
        List<CustomNews> newsList = newsService.getNewsByCoin(coin.getName());
        model.addAttribute("newsList", newsList);

        // 코인 가격 데이터 가져오기

        Chart chart7Days = coinService.getCoinPriceChart(coin.getName(), 7);
        model.addAttribute("chart7Days", chart7Days);

        Chart chart14Days = coinService.getCoinPriceChart(coin.getName(), 14);
        model.addAttribute("chart14Days", chart14Days);

        Chart chart30Days = coinService.getCoinPriceChart(coin.getName(), 30);
        model.addAttribute("chart14Days", chart30Days);


        return "coin";
    }
}
