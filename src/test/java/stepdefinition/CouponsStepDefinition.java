package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.HooksClass;
import locators.Locators;
import util.CommonUtil;
import util.WaitHelper;

public class CouponsStepDefinition {

	WebDriver driver = HooksClass.getDriver();
	public Locators locators = new Locators(driver);
	
	public static String couponCode;

	@When("User navigates to coupon page")
	public void user_navigates_to_coupon_page() {

		locators.marketingMenu.click();
		locators.couponsOption.click();
		WaitHelper.visibilityOf(driver, locators.couponListHeader);

	}

	@When("Click on Add new Coupon")
	public void click_on_Add_new_Coupon() {

		locators.addCoupon.click();
	}

	@Then("Verify user is navigated to Create coupon screen")
	public void verify_user_is_navigated_to_Create_coupon_screen() {
		WaitHelper.visibilityOf(driver, locators.addCouponHeader);

	}



	@Then("Add a new coupon with all Inputs {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void add_a_new_coupon_with_all_Inputs(String couponName, String type, String discount,
			String totalAmount, String customerLogin, String freeShipping, String products, String category,
			String startdate, String endDate, String usePerCoupon, String usePerCustomer, String status) {

		 couponCode = CommonUtil.getRandomString()+CommonUtil.getRandomString();
		
		locators.couponNameTextBox.sendKeys(couponName);
		locators.codeTextBox.sendKeys(couponCode);

		Select typeDrop = new Select(locators.typeDropDown);
		typeDrop.selectByVisibleText(type);

		locators.discountTextBox.sendKeys(discount);

		locators.totalAmountTextBox.sendKeys(totalAmount);

		if (customerLogin.equals("Yes"))
			locators.customerLoginYesRadioButton.click();
		else
			locators.customerLoginNoRadioButton.click();

		if (freeShipping.equals("Yes"))
			locators.freeShippingYesRadioButton.click();
		else
			locators.freeShippingNoRadioButton.click();

		locators.productTextBox.sendKeys(products);

		locators.categoryTextBox.sendKeys(category);

		locators.startDateTextBox.sendKeys(startdate);

		locators.endDateTextBox.sendKeys(endDate);

		locators.usesPerCouponTextBox.sendKeys(usePerCoupon);

		locators.usesPerCustomerTextBox.sendKeys(usePerCustomer);

		Select statusDrop = new Select(locators.statusDropdown);
		statusDrop.selectByVisibleText(status);

		WaitHelper.visibilityOf(driver, locators.saveButton);
		locators.saveButton.click();

	}

	@Then("Verify coupon is added {string}")
	public void verify_coupon_is_added(String couponName) {
		WaitHelper.pagetoLoad(driver);
		WaitHelper.visibilityOf(driver, locators.successMessage);
		Assert.assertEquals(locators.tableValue("Coupon Name", couponName).getText(),couponName);
		Assert.assertEquals(locators.tableValue("Code", couponCode).getText(),couponCode);

	}

	@When("Click on Edit coupon code")
	public void click_on_Edit_coupon_code() {

		WaitHelper.pagetoLoad(driver);
		locators.editButton(couponCode).click();
		WaitHelper.visibilityOf(driver, locators.editCouponHeader);

	}
	@Then("Edit a coupon with all Inputs {string} ,{string}, {string},{string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
	public void edit_a_coupon_with_all_Inputs(String couponName, String type, String discount,
			String totalAmount, String customerLogin, String freeShipping, String products, String category,
			String startdate, String endDate, String usePerCoupon, String usePerCustomer, String status) {
		couponCode = CommonUtil.getRandomString()+CommonUtil.getRandomString();

		
		locators.couponNameTextBox.clear();
		locators.couponNameTextBox.sendKeys(couponName);

		locators.codeTextBox.clear();
		locators.codeTextBox.sendKeys(couponCode);

		Select typeDrop = new Select(locators.typeDropDown);
		typeDrop.selectByVisibleText(type);

		locators.discountTextBox.clear();
		locators.discountTextBox.sendKeys(discount);

		locators.totalAmountTextBox.clear();
		locators.totalAmountTextBox.sendKeys(totalAmount);

		if (customerLogin.equals("Yes"))
			locators.customerLoginYesRadioButton.click();
		else
			locators.customerLoginNoRadioButton.click();

		if (freeShipping.equals("Yes"))
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

		Select statusDrop = new Select(locators.statusDropdown);
		statusDrop.selectByVisibleText(status);

		locators.saveButton.click();

	}


	@When("Select a coupon code to delete based on coupon code")
	public void select_a_coupon_code_to_delete_based_on_coupon_code() {
		locators.SelectCheckbox(couponCode).click();

	}

	@Then("Delete a coupon")
	public void delete_a_coupon() {
		locators.deleteButton.click();
		driver.switchTo().alert().accept();
	}

	@Then("Verify coupon is deleted")
	public void verify_coupon_is_deleted() {
		WaitHelper.pagetoLoad(driver);
		WaitHelper.visibilityOf(driver, locators.successMessage);
	}

	@Then("Verify user is navigated to Edit coupon screen")
	public void verify_user_is_navigated_to_Edit_coupon_screen() {
		WaitHelper.pagetoLoad(driver);
		WaitHelper.visibilityOf(driver, locators.editCouponHeader);
	}

	@Then("Verify coupon is edited {string}")
	public void verify_coupon_is_edited(String couponName) {
		WaitHelper.pagetoLoad(driver);
		WaitHelper.visibilityOf(driver, locators.successMessage);
		Assert.assertEquals(locators.tableValue("Coupon Name", couponName).getText(),couponName);
		Assert.assertEquals(locators.tableValue("Code", couponCode).getText(),couponCode);

	}
}
