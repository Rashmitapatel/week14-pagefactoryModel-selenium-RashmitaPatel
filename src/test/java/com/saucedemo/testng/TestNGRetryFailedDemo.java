package com.saucedemo.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
    @Test
    public void test1(){
        System.out.println("I am in test1");
    }

    @Test
    public void test2(){
        System.out.println("I am in test2");
    }

    @Test(retryAnalyzer = Retryanalyser.class)// real time sometest case one time fail and second time pass then use this Retryanalyser
    public void test3(){
        System.out.println("I am in test3");
        Assert.assertTrue(false);// it will run 3 times//if wite true then run only once
    }
}
