package seleium.chrome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ChromeTest {

    private WebDriver driver;

    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver","D:\\soft\\geckodriver\\chromedriver.exe");//这一步必不可少
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
    }


    public void login(WebDriver driver){
        driver.get("https://yunpan.360.cn/");

        driver.findElement(By.xpath("//input[starts-with(@id,'quc_account_')]")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_account_')]")).sendKeys("18801354489");
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_password_')]")).clear();
        driver.findElement(By.xpath("//input[starts-with(@id,'quc_password_')]")).sendKeys("swjtustt0226");
        driver.findElement(By.xpath("//div/div[1]/form/p[5]/input")).click();
        WebElement element = driver.findElement(By.id("guideTarget2"));
        Assert.assertNotNull(element);
    }


    public void openFile(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("//div[starts-with(@title,'tt')]"));
        System.out.println("element:   "+element);
        Actions action = new Actions(driver);
        action.contextClick(element).perform();
    }

    public void addFile(WebDriver driver){
        WebElement element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[1]/div/div[2]/ul"));
        Actions actions = new Actions(driver);
        actions.click(element).pause(1000);

    }

    @Test
    public  void test(){
        ChromeTest test = new ChromeTest();
        System.out.println("----------登录开始-------------");
        test.login(driver);
        System.out.println("----------登录结束-------------");
        System.out.println("----------打开文件开始-------------");
        test.openFile(driver);
        System.out.println("----------打开文件结束-------------");
        System.out.println("----------新增文件开始-------------");
        test.addFile(driver);
        System.out.println("----------新增文件结束-------------");
    }


}
