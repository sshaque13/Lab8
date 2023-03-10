package com.example.lab8;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;

    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.countCities();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.countCities(),listSize + 1);
    }

    @Test
    public void hasCityTest() {
        list = MockCityList();
        list.addCity(new City("Saskatoon", "SK"));
        assertTrue(list.hasCity("Saskatoon"));
        assertFalse(list.hasCity("Calgary"));
    }

    @Test
    public void deleteCityTest() {
        list = MockCityList();
        list.addCity(new City("Red Deer", "Alberta"));
        assertTrue(list.hasCity("Red Deer"));
        list.deleteCity("Red Deer");
        assertFalse(list.hasCity("Red Deer"));
    }

    @Test
    public void countCitiesTest() {
        list = MockCityList();
        assertEquals(list.countCities(), 0);
        list.addCity(new City("Estevan", "SK"));
        list.addCity(new City("Edmonton", "AB"));
        list.addCity(new City("Cold Lake", "AB"));
        assertEquals(list.countCities(), 3);
    }
    
}