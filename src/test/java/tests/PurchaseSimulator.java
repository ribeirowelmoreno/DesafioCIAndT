package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import support.Web;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

    @RunWith(DataDrivenTestRunner.class)
    @DataLoader(filePaths = "userInfo.csv")

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PurchaseSimulator {
    private WebDriver driver;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp(){driver = Web.createChrome();}

    @Test
    public void AddProductIntoCart(@Param(name="email")String email, @Param(name="password")String password){
            new MainPage(driver)
                    .StartLogin()
                    .InsertEmailAndContinue(email, password)
                    .SearchForSomeProduct("iphone 11 pro 64gb")
                    .ClickingOnProduct("//*[@id=\"search\"]//span[contains(text(), \"Celular Apple iPhone 11 Pro 64gb / Tela 5.8'' / 12MP / iOS 13\")]")
                    .AddingProductToCart()
                    .ProceedToCheckout();
    }

    @Test
    public void NewProductOnCart(@Param(name="email")String email, @Param(name="password")String password){
            new MainPage(driver)
                    .StartLogin()
                    .InsertEmailAndContinue(email, password)
                    .SearchForSomeProduct("mouse sem fio gamer pro m5")
                    .ClickingOnProduct("//*[@id=\"search\"]//h2//span[contains(text(), \"Mouse Gamer PRO M5 RGB Preto FORTREK, Fortrek, Mouses\")]")
                    .AddingProductToCart()
                    .ProceedToCheckout()
                    .ChangeQuantity();
    }

   @After
    public void tearDown(){
        driver.quit();
   }

}
