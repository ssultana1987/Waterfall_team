package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterFallUtility.WaterFallBase;

public class HomePageLocator extends WaterFallBase{
	public HomePageLocator() {//land owned by "this" key word
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login2")
	public WebElement LoginLink;
    //webelement=location/adress of webelement which we find by id, xpath etc. locatore
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	public WebElement SamsungGalaxy;
}
//a[text()='Samsung galaxy s6']