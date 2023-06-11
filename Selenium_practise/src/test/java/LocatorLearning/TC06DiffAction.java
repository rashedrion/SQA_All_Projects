package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC06DiffAction extends DriverSetup {
    @Test
    public void testDifferentAction(){
        driver.get("https://www.daraz.com.bd");
        Actions actions = new Actions(driver);
        WebElement automobiles = driver.findElement(By.id("Level_1_Category_No12"));
        actions.clickAndHold(automobiles).build().perform();
        WebElement vehicleCare = driver.findElement(By.linkText("Vehicle Care"));
        actions.clickAndHold(vehicleCare).build().perform();
        driver.findElement(By.linkText("Polishing & Rubbing Compounds")).click();
    }
    @Test
    public void scrollTo() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
//        actions.scrollByAmount(0, 1000).build().perform();
        actions.scrollToElement(driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"))).build().perform();
        Thread.sleep(4000);
    }
}
