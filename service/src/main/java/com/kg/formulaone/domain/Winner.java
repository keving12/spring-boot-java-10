package com.kg.formulaone.domain;

import java.util.Objects;

public class Winner {

    private String driver;
    private String constructor;

    public Winner(String driver, String constructor) {
        this.driver = driver;
        this.constructor = constructor;
    }

    public String getDriver() {
        return driver;
    }

    public String getConstructor() {
        return constructor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Winner winner = (Winner) o;
        return Objects.equals(driver, winner.driver) &&
                Objects.equals(constructor, winner.constructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driver, constructor);
    }
}
