package com.saucedemo.pages;

import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LogIn extends Utility {

    //   =========userSholdLoginSuccessfullyWithValidCredentials====================
//Enter “standard_user” username
    By UserName = By.id("user-name");

    public void enterUserName(String username) {
        sendTextToElement(UserName, username);
    }

    //Enter “secret_sauce” password
    By Password = By.id("password");

    public void enterPassword(String password) {
        sendTextToElement(Password, password);
    }

    //Click on ‘LOGIN’ button
    By LogIn = By.id("login-button");

    public void clickOnLogin() {
        clickOnElement(LogIn);
    }

    //Verify the text “PRODUCTS
    By ProductsText = By.xpath("//span[contains(text(),'Products')]");

    public String verifyProductsText() {
        return getTextFromElement(ProductsText);
    }


//==========verifyThatSixProductsAreDisplayedOnPage==============


    //Verify that six products are displayed on page and store in List webelement
    public int verifyProducts() {
        List<WebElement> numOfProducts = driver.findElements(By.xpath("//div[@class='inventory_item']"));

        int number = numOfProducts.size();

        return number;

    }
}
