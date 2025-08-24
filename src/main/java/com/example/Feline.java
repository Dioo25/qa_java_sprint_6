package com.example;

import java.util.Arrays;
import java.util.List;

public class Feline {
    public List<String> eatMeat() {
        return Arrays.asList("Животные", "Птицы", "Рыба");
    }

    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return 1;
    }

    public int getKittens(int count) {
        return count;
    }
}