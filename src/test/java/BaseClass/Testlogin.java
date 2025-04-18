package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Testlogin {

    WebDriver driver;
    @BeforeClass

    void setup() throws InterruptedException {
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://labsqajobs.qaharbor.com/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }
    @Test
    void loginTest() throws InterruptedException {
        LoginPage lg = new LoginPage(driver);
        lg.inputEmail("jmim9206@gmail.com");
        Thread.sleep(5000);
        lg.inputPassword("password123");
        Thread.sleep(5000);
        lg.clickLogin();
        Thread.sleep(5000);

        //Assert.assertEquals(driver.getTitle(),"https/labsqajobs.qaharbor.com/account");
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
