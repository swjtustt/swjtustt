package seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ChromeDemo {
    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","D:\\soft\\geckodriver\\chromedriver.exe");//这一步必不可少
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);

        driver.get("https://yunpan.360.cn/");

        driver.findElement(By.xpath("//input[starts-with(@id,'quc_account_')]")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_account_')]")).sendKeys("18801354489");
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_password_')]")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_password_')]")).sendKeys("swjtustt0226");
        driver.findElement(By.xpath("//div/div[1]/form/p[5]/input")).click();

        WebElement element = driver.findElement(By.xpath("//div[starts-with(@title,'tt')]"));
        System.out.println("element:   "+element);
        Actions action = new Actions(driver);
        action.contextClick(element).perform();

        driver.get("http://www.baidu.com");
        Actions act = new Actions(driver);
        act.clickAndHold(driver.findElement(By.linkText("设置"))).perform();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("当前的题目是："+driver.getTitle());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("当前的地址为："+driver.getCurrentUrl());
        String text = driver.findElement(By.id("su")).getText();
        System.out.println("当前的地址为："+text);
    }
}
