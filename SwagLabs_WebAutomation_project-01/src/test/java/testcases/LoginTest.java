package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;
import utilities.DataSet;
import utilities.DriverSetup;

import static org.testng.Assert.assertEquals;

public class LoginTest extends DriverSetup {
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();

    @Test(priority = 4 , description = "Test description from testNG" )
    @Description("Test description from Allure")
    public void testLoginWithValidCredentials(){
        getDriver().get(loginPage.login_page_url);
        loginPage.writeOnByLocator(loginPage.username_input_field, "standard_user");
        loginPage.writeOnByLocator(loginPage.password_input_field, "secret_sauce");
        loginPage.clickOnAElement(loginPage.login_button);
        loginPage.takeScreenShot("login with valid credentials");
        assertEquals(getDriver().getCurrentUrl(), productPage.product_page_url);
    }

    @Test(priority = 3)
    public void testLoginWithInvalidPassword(){
        getDriver().get(loginPage.login_page_url);
        loginPage.writeOnByLocator(loginPage.username_input_field, "standard_user");
        loginPage.writeOnByLocator(loginPage.password_input_field, "secret_sauc");
        loginPage.clickOnAElement(loginPage.login_button);
        loginPage.takeScreenShot("Unsuccessful login ");
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator), loginPage.error_msg);
    }

    @Test(priority = 2)
    public void testLoginWithInvalidUsername(){
        getDriver().get(loginPage.login_page_url);
        loginPage.writeOnByLocator(loginPage.username_input_field, "standard_use");
        loginPage.writeOnByLocator(loginPage.password_input_field, "secret_sauce");
        loginPage.clickOnAElement(loginPage.login_button);
        loginPage.takeScreenShot("Unsuccessful login ");
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator), loginPage.error_msg);
    }

    @Test( priority = 1, dataProvider = "invalidCredentials",  dataProviderClass = DataSet.class)
    public void testLoginWithInvalidCredentials(String username, String password){
        getDriver().get(loginPage.login_page_url);
        loginPage.writeOnByLocator(loginPage.username_input_field, username);
        loginPage.writeOnByLocator(loginPage.password_input_field, password);
        loginPage.clickOnAElement(loginPage.login_button);
        loginPage.takeScreenShot("Unsuccessful login ");
        assertEquals(loginPage.getElementText(loginPage.error_msg_locator), loginPage.error_msg);
    }

}
