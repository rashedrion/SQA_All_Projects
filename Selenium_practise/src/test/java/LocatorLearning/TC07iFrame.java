package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC07iFrame extends DriverSetup {
    @Test
    public void testIFrameElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, 1400).build().perform();
//        driver.switchTo().frame("iframe-name");
        driver.switchTo().frame(0);

        System.out.println(driver.findElement(By.linkText("Courses")).getText());
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText());
    }
}
