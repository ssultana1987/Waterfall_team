package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterFallUtility.WaterFallBase;

public class ProfilePageLocator extends WaterFallBase{
	public ProfilePageLocator() {//land owned by "this" key word
		PageFactory.initElements(driver, this);

}
	@FindBy(id="nameofuser")
	public WebElement Profile;
}