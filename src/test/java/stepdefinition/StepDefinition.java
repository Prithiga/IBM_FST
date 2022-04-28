package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.HooksClass;
import locators.Locators;
import util.WaitHelper;

public class StepDefinition {

	 WebDriver driver = HooksClass.driver;
	 Locators locators = new Locators(driver);
	

	 @Given("User navigated to the Login page")
		public void user_navigated_to_the_Login_page() {
		    // Login to portal
			driver.manage().window().maximize();
			driver.get("http://retailm1.upskills.in/admin");
			WaitHelper.pagetoLoad(driver);
			    
		}

		@Given("Enter Username {string} and password {string}")
		public void enter_Username_and_password(String username, String password) {
		    // Enter username and password for login
			System.out.println(password);
		    locators.userNameTextBox.sendKeys(username);
		    locators.passwordTextBox.sendKeys(password);
		}

		@Then("User should be able to login")
		public void user_should_be_able_to_login() {
		    // Click on Login Button
			locators.loginButton.click();
			
			WaitHelper.visibilityOf( driver,locators.dashboardHeader);
			}


		@When("User navigates to coupon page")
		public void user_navigates_to_coupon_page() {
		    
			locators.marketingMenu.click();
			locators.couponsOption.click();
			WaitHelper.visibilityOf( driver,locators.couponListHeader);
			
		}

		@When("Click on Add new Coupon")
		public void click_on_Add_new_Coupon() {
		    
			locators.addCoupon.click();
		}

		@Then("Verify user is navigated to Create coupon screen")
		public void verify_user_is_navigated_to_Create_coupon_screen() {
			WaitHelper.visibilityOf( driver,locators.addCouponHeader);
			
		}

		@Then("Add a new coupon with Mandatory Inputs Coupon Name {string} and Coupon Code {string}")
		public void add_a_new_coupon_with_Mandatory_Inputs_Coupon_Name_and_Coupon_Code(String couponName, String couponCode) {
		    
			locators.couponNameTextBox.sendKeys(couponName);
			locators.codeTextBox.sendKeys(couponCode);
			locators.saveButton.click();
			
		}
		
		@Then("Add a new coupon with all Inputs {string} , {string} , {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
		public void add_a_new_coupon_with_all_Inputs(String couponName, String couponCode, String type, String discount, String totalAmount, String customerLogin, String freeShipping, String  products,
				String category, String startdate, String endDate, String usePerCoupon, String usePerCustomer, String status) {
			
			locators.couponNameTextBox.sendKeys(couponName);
			locators.codeTextBox.sendKeys(couponCode);
			
			Select typeDrop= new Select(locators.typeDropDown);
			typeDrop.selectByVisibleText(type);
			
			locators.discountTextBox.sendKeys(discount);
			
			locators.totalAmountTextBox.sendKeys(totalAmount);
			
			if(customerLogin.equals("Yes"))
			locators.customerLoginYesRadioButton.click();
			else
				locators.customerLoginNoRadioButton.click();
			

			if(freeShipping.equals("Yes"))
			locators.freeShippingYesRadioButton.click();
			else
				locators.freeShippingNoRadioButton.click();
			
			locators.productTextBox.sendKeys(products);
			
			locators.categoryTextBox.sendKeys(category);
			
			locators.startDateTextBox.sendKeys(startdate);
			
			locators.endDateTextBox.sendKeys(endDate);
			
			locators.usesPerCouponTextBox.sendKeys(usePerCoupon);
			
			locators.usesPerCustomerTextBox.sendKeys(usePerCustomer);
			
			Select statusDrop= new Select(locators.statusDropdown);
			statusDrop.selectByVisibleText(status);	
			
			WaitHelper.visibilityOf(driver, locators.saveButton);
			locators.saveButton.click();

		}

		@Then("Verify coupon is added")
		public void verify_coupon_is_added() {
			WaitHelper.pagetoLoad(driver);
			WaitHelper.visibilityOf( driver,locators.successMessage);
			
		}
		
		@When("Click on Edit coupon code {string}")
		public void click_on_Edit_coupon_code(String string) {
			WaitHelper.pagetoLoad(driver);
			locators.editButton(string).click();
			WaitHelper.visibilityOf( driver,locators.editCouponHeader);

		}

		@Then("Edit a coupon with all Inputs {string} , {string} , {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
		public void edit_a_coupon_with_all_Inputs(String couponName, String couponCode, String type, String discount, String totalAmount, String customerLogin, String freeShipping, String  products,
				String category, String startdate, String endDate, String usePerCoupon, String usePerCustomer, String status) {
			
			locators.couponNameTextBox.clear();
			locators.couponNameTextBox.sendKeys(couponName);
			
			locators.codeTextBox.clear();
			locators.codeTextBox.sendKeys(couponCode);
			
			Select typeDrop= new Select(locators.typeDropDown);
			typeDrop.selectByVisibleText(type);
			
			locators.discountTextBox.clear();
			locators.discountTextBox.sendKeys(discount);
			
			locators.totalAmountTextBox.clear();
			locators.totalAmountTextBox.sendKeys(totalAmount);
			
			if(customerLogin.equals("Yes"))
			locators.customerLoginYesRadioButton.click();
			else
				locators.customerLoginNoRadioButton.click();
			

			if(freeShipping.equals("Yes"))
			locators.freeShippingYesRadioButton.click();
			else
				locators.freeShippingNoRadioButton.click();
			
			locators.productTextBox.clear();
			locators.productTextBox.sendKeys(products);
			
			locators.categoryTextBox.clear();
			locators.categoryTextBox.sendKeys(category);
			
			locators.startDateTextBox.clear();
			locators.startDateTextBox.sendKeys(startdate);
			
			locators.endDateTextBox.clear();
			locators.endDateTextBox.sendKeys(endDate);
			
			locators.usesPerCouponTextBox.clear();
			locators.usesPerCouponTextBox.sendKeys(usePerCoupon);
			
			locators.usesPerCustomerTextBox.clear();
			locators.usesPerCustomerTextBox.sendKeys(usePerCustomer);
			
			Select statusDrop= new Select(locators.statusDropdown);
			statusDrop.selectByVisibleText(status);	
			
			locators.saveButton.click();

		}



	@When("Select a coupon code to delete based on coupon code {string}")
	public void select_a_coupon_code_to_delete_based_on_coupon_code(String string) {
	    locators.SelectCheckbox(string).click();;
	    
	}
	
	@Then("Delete a coupon")
	public void delete_a_coupon() {
	   locators.deleteButton.click();
	   driver.switchTo().alert().accept();
	}
	
	@Then("Verify coupon is deleted")
	public void verify_coupon_is_deleted() {
		WaitHelper.pagetoLoad(driver);
		WaitHelper.visibilityOf( driver,locators.successMessage);
	}
	
	@Then("Verify user is navigated to Edit coupon screen")
	public void verify_user_is_navigated_to_Edit_coupon_screen() {
		WaitHelper.pagetoLoad(driver);
		WaitHelper.visibilityOf( driver,locators.editCouponHeader);
	}

	@Then("Verify coupon is edited")
	public void verify_coupon_is_edited() {
		WaitHelper.pagetoLoad(driver);
		WaitHelper.visibilityOf( driver,locators.successMessage);
	}
}
