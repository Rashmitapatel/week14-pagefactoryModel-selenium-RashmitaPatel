package com.saucedemo.testng;

import org.testng.annotations.Test;

public class TestNGProirity {
    @Test(priority = 2)
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test(priority = 1)  // if ypu not give anyprority it will give default 0
    public void test2(){
        System.out.println("I am in test2");
    }

    @Test(priority = 3)
    public void test3(){
        System.out.println("I am in test3");
    }
}
