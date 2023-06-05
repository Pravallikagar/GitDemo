package Basics;



	import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
	import java.net.MalformedURLException;
	import java.net.URL;
	import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

	public class Inspector {
		

	  private AndroidDriver driver;

	  @Test
	  public void setUp() throws MalformedURLException {
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("appium:app", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Automation\\\\src\\\\test\\\\java\\\\Resources\\\\ApiDemos-debug.apk");
	    desiredCapabilities.setCapability("appium:deviceName", "Pravallikaemulator");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
	    
	    
	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
	    desiredCapabilities.setCapability("appium:app", "C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\Automation\\\\src\\\\test\\\\java\\\\Resources\\\\ApiDemos-debug.apk");
	    desiredCapabilities.setCapability("appium:deviceName", "Pravallikaemulator");
	    desiredCapabilities.setCapability("platformName", "Android");
	    desiredCapabilities.setCapability("appium:automationName", "UIAutomator2");
	    desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
	    desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
	    desiredCapabilities.setCapability("appium:newCommandTimeout", 3600);
	    desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

	    URL remoteUrl = new URL("http://127.0.0.1:4723/");

	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
	    driver.findElement(AppiumBy.accessibilityId("Media")).click();

	 

	  
	    driver.quit();
	  }
	}