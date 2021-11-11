package automationpractical.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By addBtn = By.id("cart_quantity_up_5_19_0_0");
    By unitPrice = By.xpath("//span[@class='price']//span[1]");
    By quantity = By.xpath("//td[contains(@class, 'cart_quantity')]//input[2]");
    By totalPrice = By.id("total_product_price_5_19_0");

    public CartPage(WebDriver driver){
        super(driver);
    }

    
    public void clickIncreaseQuantityBtn() {
        waitVisibility(addBtn);
        driver.findElement(addBtn).click();
    }

    
    public String getUnitPrice() {
        waitVisibility(unitPrice);
        return driver.findElement(unitPrice).getText();
    }

    
    public String getQuantity(){
        waitVisibility(quantity);
        return driver.findElement(quantity).getAttribute("value");
    }

    
    public double calculateTotal(){

        double total = 0;

        double price = Double.parseDouble(getUnitPrice().replace("$", ""));
        int q = Integer.parseInt(getQuantity());
        total = price * q;

        return total;
    }

    
    public double getTotalPrice() {
        waitVisibility(totalPrice);
        double total = Double.parseDouble(driver.findElement(totalPrice).getText().replace("$", ""));

        return total;
    }

    
}
