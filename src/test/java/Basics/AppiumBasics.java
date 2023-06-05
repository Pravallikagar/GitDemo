package Basics;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasics {
	
	@Test
	public void AppiumTest() throws MalformedURLException {
		
	
	    //appium code--server--mobile
		
		
		UiAutomator2Options options =new UiAutomator2Options();
		UiAutomator2Options options =new UiAutomator2Options();
		UiAutomator2Options options =new UiAutomator2Options();
		options.setDeviceName("Pravallikaemulator");
		options.setApp("C:\\Users\\Dell\\eclipse-workspace\\Automation\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
		options.setApp("C:\\Users\\Dell\\eclipse-workspace\\Automation\\src\\test\\java\\Resources\\ApiDemos-debug.apk");

		
		
		AndroidDriver driver =new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.findElement(AppiumBy.accessibilityId("Media")).click();
		driver.quit();
		
	}

}
