package hooks;

import java.io.IOException;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import locators.Locators;
import util.CommonUtil;
import util.WaitHelper;

public class HooksClass {
	public static WebDriver driver;
	static protected String url;
	static protected String username;
	static protected String password;
	public Locators locators ;

	static {
		try {
			url = CommonUtil.readProperties("test.url");
			username = CommonUtil.readProperties("test.username");
			password = CommonUtil.readProperties("test.password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Before(order = 0)
	public void init() {
		System.setProperty("webdriver.chrome.driver", ".\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return driver;
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Given("User navigated to the Login page")
	public void user_navigated_to_the_Login_page() {
		// Login to portal
		driver.manage().window().maximize();
		driver.get(HooksClass.url);
		WaitHelper.pagetoLoad(driver);

	}

	@Given("Enter Username and Password")
	public void enter_Username_and_password() {
		locators = new Locators(getDriver());
		// Enter username and password for login
		locators.userNameTextBox.sendKeys(HooksClass.username);
		locators.passwordTextBox.sendKeys(HooksClass.password);
	}

	@Then("User should be able to login")
	public void user_should_be_able_to_login() {
		// Click on Login Button
		locators.loginButton.click();
		WaitHelper.visibilityOf(driver, locators.dashboardHeader);
	}

}
