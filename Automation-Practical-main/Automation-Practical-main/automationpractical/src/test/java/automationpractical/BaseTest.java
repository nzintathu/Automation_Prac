package automationpractical;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
    
    WebDriver driver;

    String baseUrl = "http://automationpractice.com/";

    @BeforeClass
    public static void setupTestSuite(){
        WebDriverManager.chromedriver().setup();      
    }

    @Before
    public void setupTestcase(){
        driver = new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @After
    public void teardownTestcase(){
        driver.quit();
    }


}
