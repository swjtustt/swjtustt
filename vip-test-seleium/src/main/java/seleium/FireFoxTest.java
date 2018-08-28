package seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTest {

    public static void  main(String [] args){
        System.setProperty("webdriver.firefox.bin", "D:\\soft\\firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "D:\\soft\\geckodriver\\geckodriver.exe");

        //初始化一个火狐浏览器实例，实例名称叫driver
        WebDriver driver = new FirefoxDriver();
        //最大化窗口
        driver.manage().window().maximize();
        //设置隐性等待时间
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // get()打开一个站点
        driver.get("https://www.baidu.com");
        //getTitle()获取当前页面title的值
        System.out.println("当前打开页面的标题是： "+ driver.getTitle());
        driver.findElement(By.xpath("//*[@id='kw']")).sendKeys("163邮箱");
        driver.findElement(By.xpath("//*[@id='su']")).click();
//        try {
//            Thread.sleep(10000);
//       } catch (InterruptedException e) {
//            e.printStackTrace();
//       }
//        driver.findElement(By.xpath("//*[@id='op_email3_username']")).sendKeys("swjtustt");
//        driver.findElement(By.className("op_email3_password")).sendKeys("swjtustt0226");
//        driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]/a[1]")).click();
        ((JavascriptExecutor)driver).executeScript("document.documentElement. scrollTop=10000");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ((JavascriptExecutor)driver).executeScript("document.documentElement. scrollTop=0");
//        driver.findElement(By.id("kw")).sendKeys("安居客");
//        driver.findElement(By.xpath("//input[@id='su']")).click();
//
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        driver.findElement(By.xpath("//div[@id='1']/h3/a")).click();
//        driver.getWindowHandle();
//        String title = "北京二手房";
//        Set<String> handlers = driver.getWindowHandles();
//        for(String handler : handlers){
//            if(handler.equals(driver.getWindowHandle())){
//                continue;
//            }else{
//                driver.switchTo().window(handler);
//                if(driver.getTitle().contains(title)){
//                    break;
//                }else{
//                    continue;
//                }
//            }
//        }
        //关闭并退出浏览器
//        driver.quit();
    }
}
