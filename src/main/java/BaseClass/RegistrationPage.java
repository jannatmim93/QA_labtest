package BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;
    //constructor
    RegistrationPage(WebDriver driver){
        this.driver = driver;
    }
    //locator
  By txt_user_name_loc  = (By.id("username"));
    By txt_email_id_loc = (By.id("email"));
    By txt_password_loc =  (By.id("password"));
    By txt_confirm_pass_loc = (By.id("conf-pass"));
    By btn_regNow_loc = (By.xpath("//button[normalize-space()='REGISTER NOW']"));
    //action
    public void setUserName(String user){
driver.findElement(txt_user_name_loc).sendKeys(user);
    }
    public void setEmail(String email){
        driver.findElement(txt_email_id_loc).sendKeys(email);
    }
    public void setPassword(String pass){
        driver.findElement(txt_password_loc).sendKeys(pass);
    }
    public void confirmpass(String confpass){
        driver.findElement(txt_confirm_pass_loc).sendKeys(confpass);
    }
    public void clickRegNow(){
        driver.findElement(btn_regNow_loc).click();
    }
}
