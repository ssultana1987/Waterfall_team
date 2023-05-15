package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterFallUtility.WaterFallBase;

public class ProDuctLocator extends WaterFallBase{
	public ProDuctLocator() {//land owned by "this" key word
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Add to cart']")
	public WebElement AddToCaarttS;
	@FindBy(xpath="//a[text()='Cart']")
	public WebElement CaartLink;
}
