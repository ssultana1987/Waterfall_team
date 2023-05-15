package WaterFallStepDefination;

import WaterFallPageAction.CaartPageAction;
import WaterFallUtility.WaterFallBase;
import cucumber.api.java.en.Then;

public class CarttStep extends WaterFallBase{
	CaartPageAction caartPageAction =new CaartPageAction();
	@Then("^Click Place Order$")
	public void click_Place_Order() throws Throwable {
		caartPageAction.ClickPlaceOrder();
	}    
}
