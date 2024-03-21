package framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.utils.PageLocatorsManager;

public abstract class SupportSteps {

	protected WebDriver driver;

	protected SupportSteps(WebDriver driver) {
		this.driver=driver;
	}

	protected By getLocator(String elementSelector) {
		PageLocatorsManager pageLocatorsManager = new PageLocatorsManager(driver);
		return pageLocatorsManager.getLocator(elementSelector);
	}

	protected WebElement getElement(String elementSelector) {
		By locatorvalue = getLocator(elementSelector);
		return driver.findElement(locatorvalue);
	}

	protected List<WebElement> getElements(String elementSelector) {
		By locatorvalue = getLocator(elementSelector);
		return driver.findElements(locatorvalue);
	}
}



//	protected WebDriver driver;
//
//	protected SupportSteps(WebDriver driver) {
//		this.driver=driver;
//	}
//	protected By getLocator(String elementSelector) {
//		// Assuming locators are stored in a Map (replace with your storage mechanism)
//		Map<String, String> locatorsMap = new HashMap<>();
//		locatorsMap.put("loc_txt_username", "cssSelector:input[type='text']");
//		// ... add other locators
//
//		By locator = null;
//		if (locatorsMap.containsKey(elementSelector)) {
//			String locatorString = locatorsMap.get(elementSelector);
//			// Parse the locator string based on the format you're using (e.g., CSS selector)
//			locator = By.cssSelector(locatorString); // Adjust based on your locator type
//		} else {
//			throw new IllegalArgumentException("Locator not found: " + elementSelector);
//		}
//		return locator;
//	}
//
////	protected By getLocator(String elementSelector) {
////		PageLocatorsManager pageLocatorsManager = new PageLocatorsManager(driver);
////		return pageLocatorsManager.getLocator(elementSelector);
////	}
//
//	protected WebElement getElement(String elementSelector) {
//		By locatorvalue = getLocator(elementSelector);
//		return driver.findElement(locatorvalue);
//	}
//
//	protected List<WebElement> getElements(String elementSelector) {
//		By locatorvalue = getLocator(elementSelector);
//		return driver.findElements(locatorvalue);
//	}
//}

