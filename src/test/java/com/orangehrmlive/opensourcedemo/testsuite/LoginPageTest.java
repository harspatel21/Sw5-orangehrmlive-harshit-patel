package com.orangehrmlive.opensourcedemo.testsuite;
// **** Created By Harshit Patel ****

import com.orangehrmlive.opensourcedemo.customlisteners.CustomListeners;
import com.orangehrmlive.opensourcedemo.pages.LoginPage;
import com.orangehrmlive.opensourcedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {


    LoginPage loginPage;

        @BeforeMethod(alwaysRun = true)
        public void inIt() {
            loginPage = new LoginPage();
        }


    @Test(groups = {"smoke", "regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickOnLoginButton();
        String expectedMessage  = "Dashboard";
        Assert.assertEquals(loginPage.getHeaterTitleDashboard(),expectedMessage,"Login page not displayed");
    }
}
