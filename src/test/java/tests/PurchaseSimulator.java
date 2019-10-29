package tests;

import org.easetech.easytest.annotation.DataLoader;
import org.easetech.easytest.annotation.Param;
import org.easetech.easytest.runner.DataDrivenTestRunner;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import support.Web;

@RunWith(DataDrivenTestRunner.class)
    @DataLoader(filePaths = "userInfo.csv")

public class PurchaseSimulator {
    private WebDriver driver;

    @Rule
    public TestName test = new TestName();

    @Before
    public void setUp(){driver = Web.createChrome();}

    @Test
    public void testAddProductIntoCart(@Param(name="email")String email, @Param(name="password")String password){
            new MainPage(driver)
                    .StartLogin()
                    .InsertEmailAndContinue(email, password)
                    .SearchForSomeProduct("iphone 11 pro 64gb")
                    .ClickingOnProduct()
                    .AddingProductToCart()
                    .ProceedToCheckout()
                    .SelectTheShipmentType()
                    .PressContinue()
                    .CloseOrder();


    }
}
