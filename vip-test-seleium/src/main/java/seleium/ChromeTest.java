package seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeTest {
    public static void main(String[] args) {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver","D:\\soft\\geckodriver\\chromedriver.exe");//这一步必不可少

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://www.cnblogs.com");

        String a = "alert(\"hello,this is a test!\")";
        ((ChromeDriver) driver).executeScript(a);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.linkText("注册")).click();

        driver.findElement(By.id("Email")).sendKeys("348068697@qq.com");
        driver.findElement(By.id("PhoneNum")).sendKeys("18801354489");
        driver.findElement(By.id("LoginName")).sendKeys("swjtustt");
        driver.findElement(By.id("LoginName")).sendKeys("swjtustt");
        driver.findElement(By.id("DisplayName")).sendKeys("swjtustt");
        driver.findElement(By.id("Password")).sendKeys("swjtustt0226!");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("swjtustt0226!");
        driver.findElement(By.id("submitBtn")).click();


    }
}
