package seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class UpFile {
    public static  void  main(String [] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        File file = new File("F:/tt.html");
        String filePath = file.getAbsolutePath();
        driver.get(filePath);
        driver.findElement(By.name("file")).click();
        Thread.sleep(3000);
        Runtime rn = Runtime.getRuntime();
        try{
            String str = "F://tt.exe" ;
            rn.exec(str);
        } catch (Exception e){
            System.out.println("Error to run the exe");
        }
        Thread.sleep(10000);
        driver.quit();
    }

    public void intelligentWait(WebDriver driver,int timeOut,final By by){
        try{
            new WebDriverWait(driver,timeOut).until(new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver){
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        }catch (TimeoutException e){
            e.printStackTrace();
        }
    }
}
