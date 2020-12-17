package applitoolstesting.TestRuns;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.EyesRunner;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.services.VisualGridRunner;

import applitoolstesting.Actions.CommonActions.BrowserActions;
import applitoolstesting.CommonUtilities.CommonParameters;
import applitoolstesting.CommonUtilities.UrlProvider;
import applitoolstesting.Tests.AllTests.BaseTests;

public class Part3Tests extends BaseTests {

	private static EyesRunner runner;
	private static Eyes eyes;
	private static BatchInfo batch;
	private static WebDriver driver;
	private static UrlProvider urlProvider;
	private static BrowserActions browser;
	
	public Part3Tests() {
		super(driver);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {	
		batch = new BatchInfo(CommonParameters.batchName + " - final");
		runner = new VisualGridRunner(10);
		driver = new ChromeDriver();
		browser = new BrowserActions(driver);
	}

	@Before
	public void setUp() throws Exception {
		eyes = new Eyes(runner);	
		setUp.browserConfigurationsForAllBrowsers(eyes, batch);
		
		urlProvider = new UrlProvider();
		browser.openUrl(urlProvider.getSiteUrl_v3());
	}
	
	@Test
	public void mainPage() {
		super.verify_mainPage(eyes);
	}

	@Test
	public void filterProductGrid() {
		super.verify_filterProductGrid(eyes);	
	}

	@Test
	public void productDetails() {	
		super.verify_productDetails(eyes);
	}
	
	@After
	public void tearDown() {	
		super.tearDown(eyes);
	}

	@AfterClass
	public static void tearDownAfterClass() {
		BaseTests.tearDownAfterClass(runner);
	}
}