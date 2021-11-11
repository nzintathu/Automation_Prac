package automationpractical;

import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.google.gson.JsonObject;

import org.junit.Test;

import automationpractical.Pages.HomePage;
import automationpractical.Utilities.TestdataManager;

public class HomePageTest extends BaseTest{   
    HomePage homePage;
    JsonObject jsonObject;

    @Test
    public void searchForDress(){
        homePage = new HomePage(driver);
        homePage.search("Dress");
        
        assertTrue(homePage.getSearchResults().contains("Dress"));
    }

    @Test
    public void searchUsingArray(){
        homePage = new HomePage(driver);
        String searchCriteria = "Dress,Blouse,T-shirt";
        String[] searchvalues = searchCriteria.split(",");

        for (int i = 0; i < searchvalues.length; i++) { 
            homePage.search(searchvalues[i]);
            assertTrue(homePage.getSearchResults().contains(searchvalues[i]));
        }

    }

    @Test
    public void searchUsingDataFile() throws FileNotFoundException{  
        jsonObject = TestdataManager.readTestDataFile("Search");

        homePage = new HomePage(driver);
        homePage.search(jsonObject.get("searchItem").getAsString());
        
        assertTrue(homePage.getSearchResults().contains(jsonObject.get("searchItem").getAsString()));

    }

    @Test
    public void navigatePage(){
        homePage = new HomePage(driver);

        homePage.navigate();

        assertTrue(homePage.getCategoryName().contains("EVENING DRESSES"));
    }

}
