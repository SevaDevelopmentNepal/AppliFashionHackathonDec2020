package applitoolstesting.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageElements {

	public String searchBarId = "INPUTtext____42";
	public String searchIconId = "A__btnsearchm__59";
	
	public WebElement searchIcon(WebDriver driver) {
		WebElement icon = driver
				.findElement(
						By.id(searchIconId));
		return icon;
	}

	public WebElement searchBar(WebDriver driver) {
		WebElement bar = driver
				.findElement(
						By.id(searchBarId));
		return bar;
	}

}
