package automationpractical;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import automationpractical.Pages.CartPage;
import automationpractical.Pages.HomePage;

public class CartPageTest extends BaseTest {
    HomePage homePage;
    CartPage cartPage;

    @Test
    public void cartTest(){
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);

        homePage.search("Dress");     
        assertTrue(homePage.getSearchResults().contains("Dress"));

        homePage.addItemToCart();
        homePage.viewCart();

        cartPage.clickIncreaseQuantityBtn();

        assertEquals(cartPage.calculateTotal(), cartPage.getTotalPrice(), 1);

    }
}
