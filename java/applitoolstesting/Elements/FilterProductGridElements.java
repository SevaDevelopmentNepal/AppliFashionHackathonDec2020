package applitoolstesting.Elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterProductGridElements {

	public String productGridId = "product_grid";
	public String blackCheckSelector = "#SPAN__checkmark__107"; 
	public String filterIconSelector = "#ti-filter";
	public String filterButtonSelector = "#filterBtn";
	public String blackShoesXpath = "//*[@id='product_grid']/div";
	public String appliAirxNightXpath = "//a/h3[text()='Appli Air x Night']";

	public WebElement blackCheckBox(WebDriver driver) {
		WebElement check = driver
				.findElement(
						By.cssSelector(blackCheckSelector));
		return check;
	}
	
	public By blackCheckBox() {
		By checkBox = By.cssSelector(blackCheckSelector);
		return checkBox;
	}
	
	public WebElement filterIcon(WebDriver driver) {
		WebElement icon = driver
				.findElement(
						By.cssSelector(filterIconSelector));
		return icon;
	}

	public WebElement filterButton(WebDriver driver) {
		WebElement filter = driver
				.findElement(
						By.cssSelector(filterButtonSelector));
		return filter;
	}

	public By productGrid() {
		By grid = By.id(productGridId);
		return grid;
	}
	
	public List<WebElement> filteredBlackShoes(WebDriver driver) {
		List<WebElement> shoes = driver
				.findElements(
						By.xpath(blackShoesXpath));
		return shoes;
	}
	
	public WebElement appliAirxNight(WebDriver driver) {
		WebElement blackShoe = driver
				.findElement(
						By.xpath(appliAirxNightXpath));
		return blackShoe;
	}
}
