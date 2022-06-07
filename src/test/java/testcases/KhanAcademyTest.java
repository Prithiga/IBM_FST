package testcases;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.KhanAcademySearch;
import util.BaseTest;

public class KhanAcademyTest extends BaseTest{

	@BeforeClass
	public void setup() throws MalformedURLException {
		launchKhanAcademy();
	}
	
	@Test
	public void test() throws InterruptedException {
		KhanAcademySearch search = new KhanAcademySearch(driver);
		search.clickonExplore();
		search.clickOnEconomics();
		search.clickOnFinanceAndCapitalMarkets();
		search.validateUserIsNavigatedToFinanceAndCapitalMarkets();
	}
	
}
