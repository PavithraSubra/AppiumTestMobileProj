package org.pavi.coder.mytestapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
        driver.get("https://practice-automation.com/form-fields/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Web application started");
        
        // Perform actions on the web page
        // ... 
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
    }
}
