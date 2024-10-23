package org.pavi.coder.mytestapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.chromium.ChromiumDriver;
import io.appium.java_client.chromium.options.ChromiumOptions;

public class BaseTestWeb {
	
	//AndroidDriver driver;
		
		@BeforeClass
		public void ConfigureWeb() throws MalformedURLException
		{

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Home-PC\\eclipse-workspace\\mytestapp\\drivers\\chromedriver");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromiumOptions.BROWSER_NAME_OPTION, "chrome");
			
			WebDriver driver = null;
			

		}
		@AfterClass
		public void tearDown()
		{

		}

}
