package com.kg.formulaone.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChampionController {

    @GetMapping("/champion/{year}")
    public String championshipWinner(@PathVariable("year") int year) {
        if(year == 2008) {
            return "Lewis Hamilton";
        }
        return "Unknown";
    }
}
