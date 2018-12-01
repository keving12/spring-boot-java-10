package com.kg.formulaone.impl;

import com.kg.formulaone.api.ChampionshipService;
import com.kg.formulaone.domain.Winner;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ChampionshipServiceImpl implements ChampionshipService {

    public static Map<Integer, Winner> driverWinners = new HashMap<>();

    static {
        driverWinners.put(2000, new Winner("Michael Schumacher", "Ferrari"));
        driverWinners.put(2001, new Winner("Michael Schumacher", "Ferrari"));
        driverWinners.put(2002, new Winner("Michael Schumacher", "Ferrari"));
        driverWinners.put(2003, new Winner("Michael Schumacher", "Ferrari"));
        driverWinners.put(2004, new Winner("Michael Schumacher", "Ferrari"));
        driverWinners.put(2005, new Winner("Fernando Alonso", "Renault"));
        driverWinners.put(2006, new Winner("Fernando Alonso", "Renault"));
        driverWinners.put(2007, new Winner("Kimi Raikkonen", "Ferrari"));
        driverWinners.put(2008, new Winner("Lewis Hamilton", "Ferrari"));
        driverWinners.put(2009, new Winner("Jenson Button", "Brawn GP"));
        driverWinners.put(2010, new Winner("Sebastian Vettel", "Red Bull"));
        driverWinners.put(2011, new Winner("Sebastian Vettel", "Red Bull"));
        driverWinners.put(2012, new Winner("Sebastian Vettel", "Red Bull"));
        driverWinners.put(2013, new Winner("Sebastian Vettel", "Red Bull"));
        driverWinners.put(2014, new Winner("Lewis Hamilton", "Mercedes"));
        driverWinners.put(2015, new Winner("Lewis Hamilton", "Mercedes"));
        driverWinners.put(2016, new Winner("Nico Rosberg", "Mercedes"));
        driverWinners.put(2017, new Winner("Lewis Hamilton", "Mercedes"));
        driverWinners.put(2018, new Winner("Lewis Hamilton", "Mercedes"));
    }

    @Override
    public Winner winners(int year) {
        return driverWinners.getOrDefault(year, new Winner("Unknown", "Unknown"));
    }
}
