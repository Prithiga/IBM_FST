package util;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	public WebDriver driver;
 
  public void launchChrome() throws MalformedURLException {
	  ChromeOptions chromeOptions = new ChromeOptions();
	  
		chromeOptions.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
		chromeOptions.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		chromeOptions.setCapability("chromedriverExecutable", System.getProperty("user.dir")+"\\driver\\chromedriver.exe");
		chromeOptions.setCapability("unicodeKeyboard", true);
		chromeOptions.setCapability("resetKeyboard", true);
		 driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),chromeOptions);
  }

  public void launchKhanAcademy() throws MalformedURLException {
	  DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86");
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		
		capability.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
		
		capability.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"org.khanacademy.android.ui.library.MainActivity");
		 driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),capability);
  }
}
