package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProceedToCheckoutPage {
    private WebDriver driver;

    public ProceedToCheckoutPage(WebDriver driver) {this.driver = driver;}

    public PurchaseInfoPage InsertPassword(String password){
        driver.findElement(By.id("ap_password")).sendKeys(password);

        return new PurchaseInfoPage(driver);
    }

//    public ShipmentOptionsPage SelectTheShipmentAddress(){
//        driver.findElement(By.xpath("//*[@id='spc-orders']//child::input[contains( @title, 'R$ 30,73 Entrega Padrão')]")).click();
//
//        return new ShipmentOptionsPage(driver);
    //}
    public ShipmentOptionsPage SelectTheShipmentType() {
        driver.findElement(By.cssSelector("input[type=\"radio\"][title=\"GRÁTIS Entrega Padrão\"]")).click();

        return new ShipmentOptionsPage(driver);

    }

}
