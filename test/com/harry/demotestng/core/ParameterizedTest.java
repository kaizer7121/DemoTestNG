/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harry.demotestng.core;

import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

/**
 *
 * @author Kaizer
 */
public class ParameterizedTest {

    @DataProvider(name = "test1")
    public static Object[][] primeNumbers() {
        return new Object[][]{{2, true}, {6, false}, {19, true}};
    }
 
    @Test(dataProvider = "test1")
    public void testPrimeNumberChecker(Integer inputNumber, Boolean expectedResult) {
        System.out.println(inputNumber + " " + expectedResult);
        assertEquals(expectedResult, CheckPrimeNumber.validate(inputNumber));
    }

    @DataProvider(name = "test2")
    public static Object[][] peopeInfo() {
        return new Object[][]{{new People("Simon", 18)}, {new People("Harry", 21)}};
    }

    @Test(dataProvider = "test2")
    public void testMethod(People people) {
        System.out.println(people.getName() + ", " + people.getAge() + " year olds");
    }
}
