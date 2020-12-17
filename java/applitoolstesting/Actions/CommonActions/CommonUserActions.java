package applitoolstesting.Actions.CommonActions;

import org.openqa.selenium.WebElement;

public class CommonUserActions {

	public void clickOn(WebElement webElement) {
		
		try {
			webElement.click();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
