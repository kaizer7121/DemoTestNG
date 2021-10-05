/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.harry.demotestng.core;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Kaizer
 */
public class DependenciesTest {

    @Test
    public void startCar() {
        System.out.println("Car is started");
        fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    public void driveCar() {
        System.out.println("Car is driven");
    }

    @Test(dependsOnMethods = {"driveCar"}, alwaysRun = true)
    public void stopCar() {
        System.out.println("Car is stopped");
    }

    @Test(dependsOnMethods = {"stopCar"})
    public void parkCar() {
        System.out.println("Car is parked");
    }
}
