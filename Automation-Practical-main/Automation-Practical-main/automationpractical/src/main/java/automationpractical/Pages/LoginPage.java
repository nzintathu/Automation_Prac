package automationpractical.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage{
    
    By emailTextBox = By.id("email");
    By passwordtextBox = By.id("passwd");
    By signInBtn = By.id("SubmitLogin");
    
    public LoginPage(WebDriver driver){
        super(driver);
    }

    
    public void setEmailText(String emailText){
        waitVisibility(emailTextBox);
        driver.findElement(emailTextBox).clear();
        driver.findElement(emailTextBox).sendKeys(emailText);
    }

    
    public void setPasswrdText(String PasswrdText){
        waitVisibility(passwordtextBox);
        driver.findElement(passwordtextBox).clear();
        driver.findElement(passwordtextBox).sendKeys(PasswrdText);
    }

    
    public void clickSigninBtn(){
        waitVisibility(signInBtn);
        driver.findElement(signInBtn).click();
    }
}
