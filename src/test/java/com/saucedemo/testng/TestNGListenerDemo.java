package com.saucedemo.testng;

import org.testng.SkipException;
import org.testng.annotations.Test;
//@Listeners(TestNGListeners.class) // not recommended
public  class TestNGListenerDemo { // if you uncommented than working from two side 1. listner .xml file level
    @Test

    public void test1() {
        System.out.println("I am inside Test1");

    }

    @Test
    public void test2() {
        System.out.println("I am inside Test2");
    }

    @Test
    public void test3() {
        System.out.println("I am inside Test3");
        throw new SkipException("Test Skipped");
    }

}