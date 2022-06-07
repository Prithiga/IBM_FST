package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;



public class KhanAcademySearch {

	WebDriver driver;
	public KhanAcademySearch(WebDriver driver){
		this.driver = driver;
	}

	public void clickonExplore() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("Search tab")).click();

	}
	
	public void clickOnEconomics() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Economics\")")).click();
		Reporter.log("User is successfully navigated to Economics");

	}
	
	public void clickOnFinanceAndCapitalMarkets() throws InterruptedException {
		
		Thread.sleep(3000);

		driver.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Finance and capital markets\")")).click();
	}
	
	public void validateUserIsNavigatedToFinanceAndCapitalMarkets() {
		String element =driver.findElement(AppiumBy.androidUIAutomator("UiSelector().text(\"Finance and capital markets\")")).getText();
		Assert.assertEquals(element, "Finance and capital markets");
		Reporter.log("User is successfully navigated to Finance and Capital markets");
	}
}
