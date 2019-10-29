package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Web;

public class AddToCartPage {
    private WebDriver driver;
    public AddToCartPage(WebDriver driver) {this.driver = driver;}

    public ProceedToCheckoutPage ProceedToCheckout(){
        driver.findElement(By.id("hlb-ptc-btn-native")).click();

        return new ProceedToCheckoutPage(driver);
    }


}
