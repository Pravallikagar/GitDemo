package Basics;


	import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;

	public class AiDE {

		@Test
		
	    public  void Appium() throws Exception {

	        // Set the Desired Capabilities
	        DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pravallikaemulator");
	        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
	        
	        caps.setCapability(MobileCapabilityType.APP,("C:\\Users\\Dell\\eclipse-workspace\\Automation\\src\\test\\java\\Resources\\ApiDemos-debug.apk"));

	        // Instantiate Appium Driver
	        URL appiumServerURL = new URL("http://127.0.0.1:4723");
	        AppiumDriver driver = new AndroidDriver(appiumServerURL, caps);

	        // Locate Element using Appium Inspector
	        driver.findElement(AppiumBy.accessibilityId("Preference")).click();

	        // Close the Appium Driver
	        driver.quit();
	    }
	}


