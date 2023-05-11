package com.saucedemo.testsuite;

import com.saucedemo.customlisteners.CustomListeners;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity", "regression"})

    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterEmailId("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        softAssert(homePage.getHeadingText(), "Products", "User login not success");
    }

    @Test(groups = {"smoke", "regression"})

    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterEmailId("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        Assert.assertEquals(homePage.countItems(), 6, "Products are not displayed correctly");
    }
}