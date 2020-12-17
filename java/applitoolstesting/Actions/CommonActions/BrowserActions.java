package applitoolstesting.Actions.CommonActions;

import org.openqa.selenium.WebDriver;

public class BrowserActions {
	
	WebDriver driver;
	
	public BrowserActions(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @param url - pass respective URLs in browser 
	 * 				for testing in different test environments
	 */
	public void openUrl(String url) {
		driver.get(url);
	}
}
