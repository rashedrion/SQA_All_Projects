package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
   public WebDriver driver;

    @BeforeSuite
    public void setDriver(){
        // open a browser
        driver = new FirefoxDriver();

        // Maximize browser window
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void closeDriver(){
        // close Browser
//         driver.close();
        driver.quit();
    }
}
