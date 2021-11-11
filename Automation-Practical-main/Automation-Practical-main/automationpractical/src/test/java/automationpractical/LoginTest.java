package automationpractical;

import org.junit.Test;

import automationpractical.Pages.HomePage;
import automationpractical.Pages.LoginPage;
import automationpractical.Utilities.GlobalVariables;

public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    GlobalVariables globalvariables;

    @Test
    public void logInTest(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        globalvariables = new GlobalVariables(driver);
        homePage.goToLoginPage();

        loginPage.setEmailText(globalvariables.username);
        loginPage.setPasswrdText(globalvariables.password);
        loginPage.clickSigninBtn();
    }
}
