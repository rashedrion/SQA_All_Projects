package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckOutPage;
import utilities.DriverSetup;

public class CheckOutTest extends DriverSetup {

    CheckOutPage checkOutPage = new CheckOutPage();
    LoginTest loginTest = new LoginTest();
    @Test(priority = 6)

    public void checkoutWithValidData() throws InterruptedException {
        loginTest.testLoginWithValidCredentials();
        getDriver().navigate().to(checkOutPage.checkout_url);
        Thread.sleep(200);
        checkOutPage.writeOnByLocator(checkOutPage.first_name_field,"Rashed");
        Thread.sleep(200);
        checkOutPage.writeOnByLocator(checkOutPage.last_name_field,"rion");
        Thread.sleep(200);
        checkOutPage.writeOnByLocator(checkOutPage.postal_code_field,"1229");
        Thread.sleep(200);
        checkOutPage.clickOnAElement(checkOutPage.continue_btn);
        Thread.sleep(200);
        checkOutPage.clickOnAElement(checkOutPage.finish_btn);
        Thread.sleep(200);
        checkOutPage.takeScreenShot("Order Completed");
        Assert.assertEquals(checkOutPage.getElementText(checkOutPage.order_complete_locator),checkOutPage.order_complete_msg);


    }
}
