package com.kg.formulaone.controllers;

import com.kg.formulaone.api.ChampionshipService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChampionController {

    private ChampionshipService championshipService;

    public ChampionController(ChampionshipService championshipService) {
        this.championshipService = championshipService;
    }

    @GetMapping("/driver/{year}")
    public String winningDriver(@PathVariable("year") int year) {
        return championshipService.winners(year).getDriver();
    }

    @GetMapping("/constructor/{year}")
    public String winningConstructor(@PathVariable("year") int year) {
        return championshipService.winners(year).getConstructor();
    }
}
