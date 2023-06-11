package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.DriverSetup;

public class TC08HandleSelect extends DriverSetup {
    @Test
    public void testSelectElement() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement dorpdown = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(dorpdown);
        select.selectByIndex(3);
        softAssert.assertEquals(select.getFirstSelectedOption().getText(), "Option3");

        Thread.sleep(3000);
        select.selectByValue("option2");
        softAssert.assertEquals(select.getFirstSelectedOption().getText(), "Option1");
        Thread.sleep(3000);
        select.selectByVisibleText("Option1");
        softAssert.assertEquals(select.getFirstSelectedOption().getText(), "Option1");
        Thread.sleep(3000);
        softAssert.assertAll();

    }

    @Test
    public void testMultiSelect() throws InterruptedException {
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
        Actions actions = new Actions(driver);
        driver.switchTo().frame("iframeResult");
        Select select = new Select(driver.findElement(By.id("cars")));
        select.selectByVisibleText("Saab");
        select.selectByIndex(3);
        actions.keyDown(Keys.COMMAND).click(select.getOptions().get(2)).click(select.getOptions().get(0)).keyUp(Keys.COMMAND).build().perform();
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
    }
}
