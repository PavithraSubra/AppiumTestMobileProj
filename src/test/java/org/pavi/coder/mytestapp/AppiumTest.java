package org.pavi.coder.mytestapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

/**
 * Unit test for simple App.
 */
public class AppiumTest extends BaseTest {

    /**
     * Rigorous Test :-)
     * @throws MalformedURLException 
     */
	@Test
    public void testAppium() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Web application started");
        driver.get("https://practice-automation.com/");
        // Perform actions on the web page        // ... 

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2500)", "");
       
      //  driver.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button']")).click();
        driver.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button'][contains(text(),'Accordions')]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        String xpath = "//a[@class='wp-block-button__link wp-element-button'][contains(text(),'Accordions')]";

        // Find the element by XPath
        WebElement element = driver.findElement(By.xpath(xpath));

        // Click the element
        element.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


	
    }
}
