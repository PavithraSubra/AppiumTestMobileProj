package org.pavi.coder.mytestapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {

	AndroidDriver driver;

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException
	{

        UiAutomator2Options caps = new UiAutomator2Options();
        
       
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "homephone"); // Replace with your device name
        caps.setCapability("automationName", "UiAutomator2"); // Use UiAutomator2
        
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "6");
        
        caps.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability(CapabilityType.BROWSER_VERSION, "12");

        caps.setCapability("AndroidMobileCapabilityType.APP_ACTIVITY", "com.google.android.apps.chrome.Main");

      caps.setCapability("autoDownload", true);
      URL url = new URL("http://127.0.0.1:4723/");
        driver = new AndroidDriver(url, caps);

	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();

	}
}
