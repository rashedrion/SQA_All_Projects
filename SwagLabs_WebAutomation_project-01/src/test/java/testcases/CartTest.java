package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckOutPage;
import utilities.DriverSetup;

public class CartTest extends DriverSetup {
    CartPage cartPage = new CartPage();
    LoginTest loginTest = new LoginTest();
    CheckOutPage checkOutPage=new CheckOutPage();
    @Test
    public void cartPageTest(){
        loginTest.testLoginWithValidCredentials();
        getDriver().navigate().to(cartPage.cart_page_url);
        cartPage.clickOnAElement(cartPage.checkout_btn);
        cartPage.takeScreenShot("Checkout information page");
        Assert.assertEquals(getDriver().getCurrentUrl(),checkOutPage.checkout_url);
    }

}
