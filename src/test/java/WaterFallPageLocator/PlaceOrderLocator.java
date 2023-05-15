package WaterFallPageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WaterFallUtility.WaterFallBase;

public class PlaceOrderLocator extends WaterFallBase{
	public PlaceOrderLocator() {//land owned by "this" key word
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="totalm")
	public WebElement VarifyPlaceOrder;
}
