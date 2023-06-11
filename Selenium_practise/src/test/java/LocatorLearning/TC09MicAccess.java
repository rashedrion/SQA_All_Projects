package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TC09MicAccess {
    @Test
    public void testMicAccess() throws InterruptedException {
        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Add the arguments to allow microphone access
        options.addArguments("--use-fake-ui-for-media-stream");
        options.addArguments("--use-fake-device-for-media-stream");

        // Create a new instance of ChromeDriver with the options
        WebDriver driver = new ChromeDriver(options);


        driver.get("https://translate.google.com/?sl=en&tl=bn&op=translate");
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//button[@aria-label='Translate by voice'])[2]")).click();
        Thread.sleep(5000);

        driver.quit();
    }
}

