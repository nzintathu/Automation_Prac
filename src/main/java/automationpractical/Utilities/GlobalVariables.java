package automationpractical.Utilities;

import org.openqa.selenium.WebDriver;

import automationpractical.Pages.BasePage;


public class GlobalVariables extends BasePage{
    public GlobalVariables(WebDriver driver){
        super(driver);
    }

    public String username = "nzintathu@gmail.com";
    public String password = "Ntuli01";
}
