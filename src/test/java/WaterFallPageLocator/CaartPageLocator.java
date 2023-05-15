package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterFallUtility.WaterFallBase;

public class CaartPageLocator extends WaterFallBase {
	public CaartPageLocator () {//land owned by "this" key word
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[text()='Place Order']")
	public WebElement PlaceOrder;
}
