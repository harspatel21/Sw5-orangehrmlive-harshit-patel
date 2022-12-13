package com.orangehrmlive.opensourcedemo.pages;
// **** Created By Harshit Patel ****

import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']")
    WebElement forgotPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordTitle;

    public void clickOnForgotPasswordLink() {
        Reporter.log("Click on Forgot Password Link " + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
    }

    public String getResetPasswordMessage() {
        Reporter.log("Reset Title Message" + resetPasswordTitle.toString());
        return getTextFromElement(resetPasswordTitle);
    }

}
