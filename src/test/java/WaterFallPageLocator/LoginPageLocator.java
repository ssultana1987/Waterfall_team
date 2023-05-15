package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterFallUtility.WaterFallBase;

public class LoginPageLocator extends WaterFallBase{
	public LoginPageLocator() {//land owned by "this" key word
		PageFactory.initElements(driver, this);

}
	@FindBy(id="loginusername")
	public WebElement Username;
    //webelement=locator
	@FindBy(id="loginpassword")
	public WebElement Password;
    //webelement=locator
	@FindBy(xpath="//button[text()='Log in']")
	public WebElement LoginButton;
    //webelement=locator
}