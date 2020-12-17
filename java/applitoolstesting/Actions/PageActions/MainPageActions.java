package applitoolstesting.Actions.PageActions;

import org.openqa.selenium.WebDriver;
import applitoolstesting.Elements.*;

public class MainPageActions {
	
	MainPageElements home = new MainPageElements();
	
	WebDriver driver;
	
	public MainPageActions(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @return 
	 * true -> if search is displayed appropriately
	 * false -> if otherwise
	 */
	public boolean verifySearchBar() {
		
		Boolean searchIcon = home
				.searchIcon(driver)
				.isDisplayed() ? true : false;
		
		Boolean searchBar = home
				.searchBar(driver)
				.isDisplayed() ? true : false;
		
		return (searchIcon && searchBar) ? false : true;
	}
}
