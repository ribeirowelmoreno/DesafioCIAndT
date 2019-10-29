package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
        private WebDriver driver;

        public SearchResultPage(WebDriver driver) {this.driver = driver;}

        public ProductPage ClickingOnProduct(){
            driver.findElement(By.xpath("//*[@id=\"search\"]//span[contains(text(), \"Celular Apple iPhone 11 Pro 64gb / Tela 5.8'' / 12MP / iOS 13\")]")).click();

            return new ProductPage(driver);
        }
}
