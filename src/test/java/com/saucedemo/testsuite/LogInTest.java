package com.saucedemo.testsuite;

import com.saucedemo.pages.LogIn;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
    LogIn login = new LogIn();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //Enter “standard_user” username
        login.enterUserName("standard_user");
//Enter “secret_sauce” password
        login.enterPassword("secret_sauce");
//Click on ‘LOGIN’ button
        login.clickOnLogin();
//Verify the text “PRODUCTS
        String expectedText = "PRODUCTS";
        String actualText = login.verifyProductsText();
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        //Enter “standard_user” username
        login.enterUserName("standard_user");
//Enter “secret_sauce” password
        login.enterPassword("secret_sauce");
//Click on ‘LOGIN’ button
        login.clickOnLogin();
//Verify that six products are displayed on page and store in List webelement

        // to check how many products are,use size method
        int actualNumOfProducts = login.verifyProducts();
        int expectedNoOfProducts = 6;
        Assert.assertEquals(actualNumOfProducts,expectedNoOfProducts);

    }
}
