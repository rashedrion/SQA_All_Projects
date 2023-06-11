package LocatorLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC05HandleAlert extends DriverSetup {

    @Test
    public void handleDifferentTypesAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[text()= 'Click for JS Alert']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You successfully clicked an alert");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()= 'Click for JS Confirm']")).click();
        Thread.sleep(2000);
        alert = driver.switchTo().alert();
        alert.dismiss();
        result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You clicked: Cancel");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()= 'Click for JS Prompt']")).click();
        Thread.sleep(2000);
        alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Test User");
        alert.accept();
        result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You entered: Test User");
        Thread.sleep(2000);
    }

}
