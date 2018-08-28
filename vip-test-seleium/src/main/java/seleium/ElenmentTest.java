package seleium;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ElenmentTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\soft\\geckodriver\\chromedriver.exe");//这一步必不可少
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
        driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("163邮箱");
        driver.findElement(By.xpath("//*[@id='su']")).click();
        ((JavascriptExecutor)driver).executeScript("document.documentElement. scrollTop=0");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor)driver).executeScript("document.documentElement. scrollTop=10000");
        /*try {
            File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(srcFile,new File("F:\\screenshot.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }*/
// File file = new File("F:\\tt.html");
//        String filePath = file.getAbsolutePath();
//        driver.get(filePath);
//        List<WebElement> inputs = driver.findElements(By.tagName("input"));
//        for(WebElement input : inputs){
//            System.out.println(input.getAttribute("type"));
//            String type = new String(input.getAttribute("type"));
//            if (type.equals("checkbox")){
//                input.click();
//                Thread.sleep(2000);
//              }
//            }
//        driver.quit();
    }

}
