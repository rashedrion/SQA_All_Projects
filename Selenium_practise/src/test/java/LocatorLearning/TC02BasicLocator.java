package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC02BasicLocator extends DriverSetup {
    @Test
    public void testOption1() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String title = driver.findElement(By.tagName("h1")).getText();
        System.out.println(title);

        WebElement option1 = driver.findElement(By.id("checkBoxOption1"));
        option1.click();
        WebElement option2 = driver.findElement(By.name("checkBoxOption2"));
        option2.click();

        Thread.sleep(2000);

        WebElement radioBtn1 = driver.findElement(By.className("radioButton"));
        radioBtn1.click();
        Thread.sleep(1000);

        WebElement freeAccess = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));

        System.out.println(freeAccess.getText());

        WebElement freeAccess1 = driver.findElement(By.partialLinkText("Free Access to"));

        System.out.println("Text: " + freeAccess1.getText());

        driver.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(5000);

    }
    @Test
    public void testDarazDonate() throws InterruptedException {
        driver.get("https://www.daraz.com.bd");
        driver.findElement(By.linkText("Daraz Donates")).click();
        Thread.sleep(5000);

    }
}


