package testcases;

import org.testng.annotations.Test;
import pages.CheckOutPage;
import pages.ProductPage;
import utilities.DriverSetup;

public class ProductTest extends DriverSetup{
    ProductPage productPage = new ProductPage();

    @Test
    public void testFakeDataCreate(){
        System.out.println(productPage.emailGenerate());
        System.out.println(productPage.firstNameGenerate());
        System.out.println(productPage.lastNameGenerate());
    }


}
