package applitoolstesting.Actions.PageActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import applitoolstesting.Actions.CommonActions.CommonUserActions;
import applitoolstesting.Elements.*;

public class FilterProductGridActions {
	
	WebDriver driver;
	
	public FilterProductGridActions(WebDriver driver) {
		this.driver = driver;
	}
	
	WebDriverWait wait;
	FilterProductGridElements filterPage = new FilterProductGridElements();
	CommonUserActions userAction = new CommonUserActions();
	
	public void filterBlackShoe() {
			
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		if (!(filterPage.blackCheckBox(driver).isDisplayed())) {
			
			userAction.clickOn(filterPage.filterIcon(driver));
			wait.until(ExpectedConditions.elementToBeClickable(filterPage.blackCheckBox()));
		}

		userAction.clickOn(filterPage.blackCheckBox(driver));
		userAction.clickOn(filterPage.filterButton(driver));
	}
	
	public void clickOnAppliAirxNightShoe() {	
		
		userAction.clickOn(filterPage.appliAirxNight(driver));
	}
	
	public List<WebElement> filteredCountOfBlackShoes() {
		
		List<WebElement> shoes = filterPage.filteredBlackShoes(driver);
		return shoes;
	}
}