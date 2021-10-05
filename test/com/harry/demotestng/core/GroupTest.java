package com.harry.demotestng.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.testng.annotations.Test;

/**
 *
 * @author Kaizer
 */
public class GroupTest {

    @Test(groups = "Smith")
    public void printLena() {
        System.out.println("Lena Smith");
    }

    @Test(groups = "Smith")
    public void printLucy() {
        System.out.println("Lucy Smith");
    }

    @Test(groups = "Taylor")
    public void printTom() {
        System.out.println("Tom Taylor");
    }

    @Test(groups = "Taylor")
    public void printDavid() {
        System.out.println("David Taylor");
    }
}
