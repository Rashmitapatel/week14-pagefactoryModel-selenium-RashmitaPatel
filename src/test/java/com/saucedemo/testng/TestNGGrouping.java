package com.saucedemo.testng;

import org.testng.annotations.Test;

public class TestNGGrouping {    // control your execution ......when build comming you just need to run sanity ...and smoke ...ehich you grouping
    @Test(groups = {"sanity","regression"})// case sensitive what group ypu mention same name should be in xml file
    public void loginTest1() {
        System.out.println("Running test - loginTest1");
    }

    @Test(groups = {"sanity","smoke", "regression"})
    public void loginTest2() {
        System.out.println("Running test - loginTest2");
    }

    @Test(groups = {"smoke", "regression1"})
    public void loginTest3() {
        System.out.println("Running test - loginTest3");
    }

    @Test(groups = {"smoke","regression1"})
    public void loginTest4() {
        System.out.println("Running test - loginTest4");
    }

    @Test(groups = {"regression","regression1"})
    public void regressionTest1() {
        System.out.println("Running test - regressionTest1");
    }

    @Test(groups ={"regression","regression1"} )
    public void regressionTest2() {
        System.out.println("Running test - regressionTest2");
    }

    @Test(groups ={"regression","regression1"} )
    public void regressionTest3() {
        System.out.println("Running test - regressionTest3");
    }
}
