package com.orangehrmlive.opensourcedemo.pages;
// **** Created By Harshit Patel ****

import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "txtUsername")
    WebElement username;

    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//h6[text() = 'Dashboard']")
    WebElement headerTitleDashboard;


    public void enterUsername() {
        Reporter.log("Send " + usernameField + " To User Name Field" + usernameField.toString());
        sendTextToElement(usernameField, "Admin");
    }

    public void enterPassword() {
        Reporter.log("Send Password " + passwordField + " To Password Field" + passwordField.toString());
        sendTextToElement(passwordField, "admin123");
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
    }

    public String getHeaterTitleDashboard() {
        Reporter.log("Get Header Title : " + headerTitleDashboard.toString());
        return getTextFromElement(headerTitleDashboard);

    }
}
