package org.pavi.coder.mytestapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

/**
 * Unit test for simple App.
 */
public class AppTest extends BaseTest {

    /**
     * Rigorous Test :-)
     * @throws MalformedURLException 
     */
    @Test
    public void testAppium() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.prismcloudinc.com/services");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println("Web application started");
        // Perform actions on the web page
        // ... 
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   //     driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiSelector().text(\"We create digital solutions.\")")).isDisplayed();

	
    }
}
