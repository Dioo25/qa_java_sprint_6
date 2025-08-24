package com.example;

import java.util.List;

public class Lion {
    private final String sex;
    private final Feline feline;

    public Lion(String sex, Feline feline) throws Exception {
        if (!"Самец".equalsIgnoreCase(sex) && !"Самка".equalsIgnoreCase(sex)) {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
        this.sex = sex;
        this.feline = feline;
    }

    public boolean doesHaveMane() {
        return "Самец".equalsIgnoreCase(sex);
    }

    public List<String> getFood() throws Exception {
        return feline.eatMeat();
    }

    public int getKittens() {
        return feline.getKittens();
    }
}


