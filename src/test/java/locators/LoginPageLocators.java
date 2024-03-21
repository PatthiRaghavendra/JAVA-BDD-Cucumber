package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageLocators {

	@FindBy(css = "input[type='email'][name='identifier']")
	public WebElement loc_txt_username;

	@FindBy(css = "span[jsname='V67aGc'].VfPpkd-vQzf8d")
	public WebElement Click_on_next;

	@FindBy(css = "input[type='password']")
	public WebElement loc_txt_password;

	@FindBy(css = "button[type='button'] span")
	public WebElement loc_btn_login;

	@FindBy(css = "div.ui-toast-message-content div")
	public WebElement loc_toast_message;

	public LoginPageLocators(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
