package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class AlexTest {

    @Test
    @DisplayName("Проверка, что Алекс — лев самец с гривой")
    void alexIsMaleLionWithMane() throws Exception {
        Feline feline = mock(Feline.class);
        Alex alex = new Alex(feline);

        assertTrue(alex.doesHaveMane());
    }

    @Test
    @DisplayName("Проверка, что у Алекса нет котят")
    void alexHasNoKittens() throws Exception {
        Feline feline = mock(Feline.class);
        Alex alex = new Alex(feline);

        assertEquals(0, alex.getKittens());
    }

    @Test
    @DisplayName("Проверка списка друзей Алекса")
    void alexHasFriends() throws Exception {
        Feline feline = mock(Feline.class);
        Alex alex = new Alex(feline);

        List<String> friends = alex.getFriends();
        assertTrue(friends.contains("Марти"));
        assertTrue(friends.contains("Глория"));
        assertTrue(friends.contains("Мелман"));
    }

    @Test
    @DisplayName("Проверка места проживания Алекса")
    void alexPlaceOfLivingIsZoo() throws Exception {
        Feline feline = mock(Feline.class);
        Alex alex = new Alex(feline);

        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }
}