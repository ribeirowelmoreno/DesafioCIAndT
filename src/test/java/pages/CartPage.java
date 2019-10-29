package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {this.driver = driver;}

    public CartPage ChooseQuantity(Integer index){
        Select quantity = new Select(driver.findElement(By.id("//*[@id=\"a-autoid-0-announce\"]")));
        quantity.selectByIndex(index);

        return this;
    }
}
