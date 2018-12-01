package com.kg.formulaone.api;

import com.kg.formulaone.domain.Winner;

public interface ChampionshipService {

    Winner winners(int year);

}
