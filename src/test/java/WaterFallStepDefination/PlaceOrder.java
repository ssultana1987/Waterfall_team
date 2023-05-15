package WaterFallStepDefination;

import WaterFallPageAction.PlaceOrderAction;
import WaterFallUtility.WaterFallBase;
import cucumber.api.java.en.Then;

public class PlaceOrder extends WaterFallBase{
	PlaceOrderAction placeOrderAction = new PlaceOrderAction();
	@Then("^Verify Place Order is Display Sucessfully$")
	public void verify_Place_Order_is_Display_Sucessfully() throws Throwable {
		placeOrderAction.VerifyPlaceOrderDisplay();  
}
}