package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.How; // Import How for more flexibility

public class EntityPageLocators {

	@FindBy(how = How.CSS, using = "div.entity-details form input[type='text'][name='entityId']")
	public WebElement entityIdInput; // More descriptive name

	@FindBy(how = How.CSS, using = "span.labelStyle") // Using How.CSS for clarity
	public WebElement entityNameLabel; // Improved name for clarity

	public EntityPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}


//public class EntityPageLocators {
//	@FindBy(css = "span.labelStyle")
//	public WebElement loc_txt_entityname;
//
//	@FindBy(css = "input[type='text']")
//	public WebElement loc_txt_entityid;
//
//	public EntityPageLocators(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//
//	}
//
//}
