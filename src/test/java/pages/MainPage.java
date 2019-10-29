package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.Web;

public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver){this.driver = driver;}


    public MainPage StartLogin(){
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a")).click();

        return this;

    }

    public SignInPage InsertEmailAndContinue(String email, String password){
        driver.findElement(By.xpath("//*[@id='ap_email']")).click();
        driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys(email);
//        WebElement continueButton = driver.findElement(By.xpath("//*[@id='continue']//span[contains(text(), 'Continuar')]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(continueButton);
//        actions.click();
        driver.findElement(By.cssSelector("")).click();

        //Web.ExplicitWait(driver,"ap_password");
        driver.findElement(By.id("ap_password")).sendKeys(password);
        driver.findElement(By.id("signInSubmit")).click();

        return new SignInPage(driver);
    }
}
