package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LionTest {

    private Feline feline;

    @BeforeEach
    void setUp() {
        feline = mock(Feline.class);
    }

    @Test
    @DisplayName("Проверка, что у самца есть грива")
    void maleLionHasMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    @DisplayName("Проверка, что у самки нет гривы")
    void femaleLionDoesNotHaveMane() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test
    @DisplayName("Проверка выброса исключения при некорректном поле")
    void invalidSexThrowsException() {
        Exception exception = assertThrows(Exception.class, () -> new Lion("Неизвестно", feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка вызова метода getFood у Feline")
    void getFoodCallsEatMeat() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.eatMeat()).thenReturn(List.of("Мясо"));

        List<String> food = lion.getFood();

        assertEquals(List.of("Мясо"), food);
        verify(feline, times(1)).eatMeat();
    }

    @Test
    @DisplayName("Проверка делегирования getKittens в Feline")
    void getKittensDelegatesToFeline() throws Exception {
        Lion lion = new Lion("Самка", feline);
        when(feline.getKittens()).thenReturn(3);

        int kittens = lion.getKittens();

        assertEquals(3, kittens);
        verify(feline, times(1)).getKittens();
    }
}