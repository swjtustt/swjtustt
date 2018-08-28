package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDemo {

    private AppiumDriver driver;

    @Before
    public void calc() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("platformVersion", "4.1.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", ".Calculator");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
    }



    @Test
    public void add() {

        driver.findElementByXPath("//android.widget.Button[@text='6']").click();

        driver.findElementByXPath("//android.widget.Button[@text='+' and @content-desc='plus']").click();
        driver.findElementByXPath("//android.widget.Button[@text='3']").click();
        driver.findElementByXPath("//android.widget.Button[@text='=' and @content-desc='equals']").click();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("game over!");
        driver.quit();
    }


}
