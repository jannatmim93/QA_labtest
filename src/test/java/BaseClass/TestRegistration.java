package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestRegistration {
    WebDriver driver;
@BeforeClass
    void setup() throws InterruptedException {
 driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://labsqajobs.qaharbor.com/candidate-registration");
 driver.manage().window().maximize();
 Thread.sleep(5000);
    }

    @Test

    void regtest() throws InterruptedException {
        RegistrationPage rg = new RegistrationPage(driver);
        rg.setUserName("user");
        Thread.sleep(5000);
        rg.setEmail("jmim9206@gmail.com");
        Thread.sleep(5000);
        rg.setPassword("password123");
        Thread.sleep(5000);
        rg.confirmpass("password123");
        Thread.sleep(5000);
        rg.clickRegNow();
        Thread.sleep(5000);

        //Assert.assertEquals(driver.getTitle());

    }
@AfterClass
    void tearDown(){
driver.quit();

    }
}
