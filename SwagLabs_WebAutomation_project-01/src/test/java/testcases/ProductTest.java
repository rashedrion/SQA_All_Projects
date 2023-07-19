package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckOutPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class ProductTest extends DriverSetup{
    ProductPage productPage = new ProductPage();
    LoginTest loginTest = new LoginTest();
    CartPage cartPage= new CartPage();


@Test(priority = 5)
    public void addToProduct() throws InterruptedException {
        loginTest.testLoginWithValidCredentials();
        getDriver().navigate().to(productPage.product_page_url);
        Assert.assertEquals(getDriver().getTitle(),productPage.product_page_title);
        productPage.clickOnAElement(productPage.back_pack_add_to_cart_btn);
        Thread.sleep(2000);
        productPage.clickOnAElement(productPage.bike_light_add_to_cart_btn);
        Thread.sleep(2000);
        productPage.clickOnAElement(productPage.cart_icon);
        Thread.sleep(2000);
        productPage.takeScreenShot("product add to Cart");
        Assert.assertEquals(getDriver().getCurrentUrl(),cartPage.cart_page_url);


    }

    @Test
    public void testFakeDataCreate(){
        System.out.println(productPage.emailGenerate());
        System.out.println(productPage.firstNameGenerate());
        System.out.println(productPage.lastNameGenerate());
    }


}
