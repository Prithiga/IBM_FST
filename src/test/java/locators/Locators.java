package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {

	 WebDriver driver;
	public Locators(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Login Page
	@FindBy(xpath ="//button[text()=' Login']")
	public WebElement loginButton;
	
	@FindBy(id = "input-username")
	public WebElement userNameTextBox;
	
	@FindBy(id ="input-password")
	public WebElement passwordTextBox;
	
	//Dashboard Page
	@FindBy(xpath ="//h1[text()='Dashboard']")
	public WebElement dashboardHeader;
	
	@FindBy(xpath ="//li[@id='menu-marketing']/a")
	public WebElement marketingMenu;
	
	@FindBy(xpath = "//li[@id='menu-marketing']/ul/li/a[text()='Coupons']")
	public WebElement couponsOption;
	
	//Coupons Page
	@FindBy(xpath ="//h3[text()=' Coupon List']")
	public WebElement couponListHeader;
	
	@FindBy(xpath ="//a[@data-original-title ='Add New']")
	public WebElement addCoupon;
	
	@FindBy(xpath ="//div[text()=' Success: You have modified coupons!      ']")
	public WebElement successMessage;
	
	@FindBy(xpath ="//button[@data-original-title='Delete']")
	public WebElement deleteButton;
	
	
	//CreateCoupon Page
	@FindBy(xpath ="//h3[text()=' Add Coupon']")
	public WebElement addCouponHeader;
	
	@FindBy(id ="input-name")
	public WebElement couponNameTextBox;
	
	@FindBy(id ="input-code")
	public WebElement codeTextBox;
	
	@FindBy(id ="input-type")
	public WebElement typeDropDown;
	
	@FindBy(id ="input-discount")
	public WebElement discountTextBox;
	
	@FindBy(id ="input-total")
	public WebElement totalAmountTextBox;
	
	@FindBy(xpath ="//label/span[text()='Customer Login']/../../div//label[1]/input")
	public WebElement customerLoginYesRadioButton;
	
	@FindBy(xpath ="//label/span[text()='Customer Login']/../../div//label[2]/input")
	public WebElement customerLoginNoRadioButton;
	
	@FindBy(xpath ="//label[text()='Free Shipping']/..//div//label[1]/input")
	public WebElement freeShippingYesRadioButton;
	
	@FindBy(xpath ="//label[text()='Free Shipping']/..//div//label[2]/input")
	public WebElement freeShippingNoRadioButton;
	
	@FindBy(id ="input-product")
	public WebElement productTextBox;
	
	@FindBy(id ="input-category")
	public WebElement categoryTextBox;
	
	@FindBy(name ="date_start")
	public WebElement startDateTextBox;
	
	@FindBy(name ="date_end")
	public WebElement endDateTextBox;
	
	@FindBy(id ="input-uses-total")
	public WebElement usesPerCouponTextBox;
	
	@FindBy(id ="input-uses-customer")
	public WebElement usesPerCustomerTextBox;
	
	@FindBy(id ="input-status")
	public WebElement statusDropdown;
	
	@FindBy(xpath ="//button[@data-original-title='Save']")
	public WebElement saveButton;
	
	//Edit Screen
	@FindBy(xpath ="//h3[text()=' Edit Coupon']")
	public WebElement editCouponHeader;
	
	public WebElement tableValue(String columnName,String value) {
		WebElement element = null;
		if(columnName.equals("Coupon Name"))
		 element = driver.findElement(By.xpath("//table/tbody//tr/td[2][text()='"+value+"']"));
		if(columnName.equals("Code"))
			 element = driver.findElement(By.xpath("//table/tbody//tr/td[3][text()='"+value+"']"));
		return element;
	}
	
	
	public WebElement editButton(String couponCode) {
		return driver.findElement(By.xpath("//tr/td[3][text()='"+couponCode+"']/../td/a[@data-original-title='Edit']"));
	}
	
	public WebElement SelectCheckbox(String couponCode) {
		return driver.findElement(By.xpath("//tr/td[3][text()='"+couponCode+"']/../td/input[@type='checkbox']"));
	}
	
	
}
