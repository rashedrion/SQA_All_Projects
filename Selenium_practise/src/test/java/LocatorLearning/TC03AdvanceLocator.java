package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC03AdvanceLocator extends DriverSetup {

    @Test
    public void testLocator(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//        String title = driver.findElement(By.cssSelector("h1")).getText();
        String title = driver.findElement(By.xpath("//h1")).getText();
        System.out.println(title);
    }

    @Test
    public void testClick() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       WebElement radioBtn1 = driver.findElement(By.xpath("//*[@value='radio1']"));
       radioBtn1.click();
       Thread.sleep(2000);
    }

    @Test
    public void testWrite() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement inputTextField = driver.findElement(By.id("autocomplete"));
        inputTextField.sendKeys("Test Automation");
        Thread.sleep(2000);
        inputTextField.clear();
        Thread.sleep(2000);
    }

    @Test
    public void testGetAttributeValue() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioBtn3 = driver.findElement(By.xpath("//*[@value='radio3']"));
        String classValue = radioBtn3.getAttribute("class");
        System.out.println(classValue);
        Thread.sleep(2000);
    }

    @Test
    public void testGetElementText() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioBtn3 = driver.findElement(By.xpath("//*[@for='radio3']"));
        String radioBtnText = radioBtn3.getText();
        System.out.println(radioBtnText);
        Thread.sleep(2000);
    }


    @Test
    public void testDisplay() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement displayInputField = driver.findElement(By.id("displayed-text"));
        System.out.println(displayInputField.isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(displayInputField.isDisplayed());
        Thread.sleep(2000);
    }

    @Test
    public void testSelectStatus() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement radioBtn3 = driver.findElement(By.xpath("//*[@value='radio3']"));
        System.out.println(radioBtn3.isSelected());
        radioBtn3.click();
        System.out.println(radioBtn3.isSelected());
        Thread.sleep(2000);
    }
}
