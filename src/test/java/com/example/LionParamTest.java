package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class LionParamTest {

    @ParameterizedTest
    @ValueSource(strings = {"Самец", "Самка"})
    void lionGetFoodWorksForBothSexes(String sex) throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(List.of("Мясо"));

        Lion lion = new Lion(sex, feline);
        List<String> food = lion.getFood();

        assertEquals(List.of("Мясо"), food);
        verify(feline, times(1)).eatMeat();
    }
}