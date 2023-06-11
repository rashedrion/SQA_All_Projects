package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.util.ArrayList;
import java.util.List;

public class TC04Get_Navigate_Browser extends DriverSetup {

    @Test
    public void navigateToAPage() throws InterruptedException {
        driver.get("https://search.yahoo.com/web?vm=p");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
    }

    @Test
    public void  handleBrowserWindow() throws InterruptedException {
        driver.navigate().to("https://www.google.com");
        System.out.println(driver.getTitle());
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://search.yahoo.com/web?vm=p");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://facebook.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    }

    @Test
    public void  BrowserWindow() throws InterruptedException {
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("opentab")).click();
        System.out.println(driver.getTitle());

        driver.findElement(By.id("openwindow")).click();
        System.out.println(driver.getTitle());


        Thread.sleep(2000);

        System.out.println("Current window: " + driver.getWindowHandle());

        List<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());

        System.out.println(windowHandles.get(0));
        System.out.println(windowHandles.get(1));
        System.out.println(windowHandles.get(2));

        System.out.println("----------------------------------------------");

        driver.switchTo().window(windowHandles.get(2));
        System.out.println("Title of window number 3: " + driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(windowHandles.get(1));
        System.out.println("Title of window number 2: " + driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(windowHandles.get(0));
        System.out.println("Title of window number 1: " + driver.getTitle());
        System.out.println(driver.getCurrentUrl());

    }

}
