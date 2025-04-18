package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;

    //constructor
    LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //locator
    By txt_email_id_loc  = By.id("email");
    By txt_password_loc =  By.id("password");
    By btn_login_loc = By.xpath(("//button[contains(@class,'submit-type-reload')]"));

    //action
    public void inputEmail (String email){
        driver.findElement(txt_email_id_loc).sendKeys(email);
    }
    public void inputPassword(String password){
        driver.findElement(txt_password_loc).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(btn_login_loc).click();
    }
}
