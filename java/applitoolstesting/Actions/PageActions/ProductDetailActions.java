package applitoolstesting.Actions.PageActions;

import org.openqa.selenium.WebDriver;

import applitoolstesting.Elements.*;

public class ProductDetailActions {
	
	ProductDetailsElements product = new ProductDetailsElements();
	
	WebDriver driver;
	
	public ProductDetailActions(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @return true only when size & image is displayed correctly
	 */
	public boolean verifyProductDetails() {
				
		Boolean smallSize = product
				.shoeSize(driver)
				.getText()
				.equals("Small (S)");
		
		Boolean largeShoeImage = product
				.blackShoeLargeImage(driver)
				.isDisplayed();
		
		return smallSize && largeShoeImage;
	}
}
