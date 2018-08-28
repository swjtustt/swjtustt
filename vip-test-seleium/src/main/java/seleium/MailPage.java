package seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MailPage {
    public static void main(String[] agrs) {
        System.setProperty("webdriver.chrome.driver", "D:\\soft\\geckodriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://mail.qq.com/");
//        driver.switchTo().frame("login_frame");//转换到对应的iframe再获取元素
//        driver.findElement(By.id("switcher_plogin")).click();
//        driver.findElement(By.id("u")).sendKeys("webdriver");
        driver.get("http://www.baidu.com");
        String sreach_handle = driver.getWindowHandle();
        System.out.println(sreach_handle);
        driver.findElement(By.linkText("登录")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.linkText("立刻注册")).click();
        Set<String> handles = driver.getWindowHandles();
        for (String handle : handles) {
            if (handle.equals(sreach_handle) == false) {
                //切换到注册页面
                driver.switchTo().window(handle);
                System.out.println("now register window!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.findElement(By.name("account")).clear();
                driver.findElement(By.name("account")).sendKeys("username");
                driver.findElement(By.name("password")).sendKeys("password");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}