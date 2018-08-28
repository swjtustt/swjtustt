package seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MouseDemo {
    public static void main(String [] args){
        System.setProperty("webdriver.firefox.bin", "D:\\soft\\firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\soft\\geckodriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);

        driver.get("https://yunpan.360.cn/");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_account_')]")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_account_')]")).sendKeys("18801354489");
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_password_')]")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_password_')]")).sendKeys("swjtustt0226");
        driver.findElement(By.xpath("//div/div[1]/form/p[5]/input")).click();

    }
}
