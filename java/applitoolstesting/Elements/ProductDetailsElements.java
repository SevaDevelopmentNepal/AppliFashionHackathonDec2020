package applitoolstesting.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsElements {

	public String shoeImageId = "shoe_img";
	public String shoeSizeXpath = "//*[@id='DIV__customsele__92']/div/span";

	public WebElement blackShoeLargeImage(WebDriver driver) {
		WebElement image = driver
				.findElement(
						By.id(shoeImageId));
		return image;
	}

	public WebElement shoeSize(WebDriver driver) {
		WebElement shoeSize = driver
				.findElement(
						By.xpath(shoeSizeXpath));
		return shoeSize;
	}
}
