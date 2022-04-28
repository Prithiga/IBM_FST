package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
	public static WebDriver driver;
	
@Before
public void init() {
	System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@After
public void tearDown() {
	driver.quit();
}
}
