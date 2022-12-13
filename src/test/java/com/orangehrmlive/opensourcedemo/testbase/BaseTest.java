package com.orangehrmlive.opensourcedemo.testbase;
// **** Created By Harshit Patel ****


import com.orangehrmlive.opensourcedemo.propertyreader.PropertyReader;
import com.orangehrmlive.opensourcedemo.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }
}
