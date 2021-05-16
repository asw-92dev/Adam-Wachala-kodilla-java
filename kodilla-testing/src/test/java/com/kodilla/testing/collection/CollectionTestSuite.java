package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

public class CollectionTestSuite {

    OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();

    @Before
    public void before(){
        System.out.println("Test Case: Begin.");
    }
    @After
    public void after() {
        System.out.println("Test Case: End.");
    }

    @DisplayName("checking if the class behaves correctly when the list is empty")

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        oddNumbersExterminator.exterminate(emptyList);
        int result = emptyList.size();
        //Then
        Assertions.assertEquals(0, result);
    }

    @DisplayName("checking if the class behaves correctly when the list contains even and odd numbers")

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<Integer>(Arrays.asList(234,567,22,899,12,15,3,5));
        ArrayList<Integer> evenList = new ArrayList<Integer>(Arrays.asList(234,22,12));
        //When
        ArrayList<Integer> listNumbers = (ArrayList<Integer>) OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing"+listNumbers);
        //Then
        Assertions.assertEquals(evenList,listNumbers);
    }
}
