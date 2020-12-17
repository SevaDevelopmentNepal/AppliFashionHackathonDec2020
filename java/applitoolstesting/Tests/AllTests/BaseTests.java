package applitoolstesting.Tests.AllTests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.TestResultsSummary;
import com.applitools.eyes.selenium.Eyes;

import applitoolstesting.Actions.PageActions.FilterProductGridActions;
import applitoolstesting.Actions.PageActions.MainPageActions;
import applitoolstesting.Actions.PageActions.ProductDetailActions;
import applitoolstesting.CommonUtilities.BaseSetUp;
import applitoolstesting.CommonUtilities.CommonParameters;
import applitoolstesting.Elements.FilterProductGridElements;

public class BaseTests {
	
	private static WebDriver driver;	
	protected CommonParameters setParameter = new CommonParameters();
	protected BaseSetUp setUp = new BaseSetUp();
	String appName = setParameter.appName;
	FilterProductGridElements filterElements = new FilterProductGridElements();
	FilterProductGridActions filterPage = new FilterProductGridActions(driver);
	MainPageActions home = new MainPageActions(driver);
	ProductDetailActions productPage = new ProductDetailActions(driver);
	
	public BaseTests(WebDriver driver) {
		BaseTests.driver = driver;
	}
	
	public void verify_mainPage(Eyes eyes) {
		
		eyes.open(driver, appName, setParameter.test1);
		
		eyes.checkWindow(setParameter.step1);
	}
	
	public void verify_filterProductGrid(Eyes eyes) {
		
		eyes.open(driver, appName, setParameter.test2);
		
		filterPage.filterBlackShoe();
		
		eyes.checkRegion(filterElements.productGrid(), setParameter.step2);
		
		assertEquals(2, filterPage.filteredCountOfBlackShoes().size());
	}

	public void verify_productDetails(Eyes eyes) {
		
		eyes.open(driver, appName, setParameter.test3);
		
		filterPage.clickOnAppliAirxNightShoe();
		
		eyes.checkWindow(setParameter.step3);
	}
	
	public void tearDown(Eyes eyes) {
		try {  eyes.closeAsync(); }
		finally { eyes.abortAsync(); }
	}

	public static void tearDownAfterClass(EyesRunner runner) {
		driver.quit();
		TestResultsSummary allTestResults = runner.getAllTestResults();
		System.out.println(allTestResults);
	}
}