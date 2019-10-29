package support;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Web {

    public static WebDriver createChrome(){
        System.setProperty("webdriver.chrome.driver", "D:\\Wellynton\\Projetos\\DesafioCIANDT\\src\\test\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com.br/");

        return driver;

    }

    public static void ExplicitWait(WebDriver driver, String itemPath){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(itemPath)));
    }
}
