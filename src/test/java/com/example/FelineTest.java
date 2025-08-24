package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {

    @Test
    @DisplayName("eatMeat возвращает список хищной еды")
    void eatMeatReturnsPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> food = feline.eatMeat();
        assertTrue(food.contains("Животные") || food.contains("Птицы") || food.contains("Рыба"));
    }

    @Test
    @DisplayName("getFamily возвращает 'Кошачьи'")
    void getFamilyReturnsFeline() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    @DisplayName("getKittens без параметров возвращает 1")
    void getKittensWithoutParametersReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    @Test
    @DisplayName("getKittens с параметром возвращает переданное значение")
    void getKittensWithParameterReturnsValue() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}