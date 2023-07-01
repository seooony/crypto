package com.example.crypto.controller;

import com.example.crypto.model.Coin;
import com.example.crypto.model.Quotes;
import com.example.crypto.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CoinController {

    private final CoinService coinService;

    @Autowired
    public CoinController(CoinService coinService) {
        this.coinService = coinService;
    }

    @GetMapping("/")
    public String getIndexPage(Model model) {
        List<Coin> coins = coinService.getTop100Coins();
        model.addAttribute("coins", coins);
        return "index";
    }
}
