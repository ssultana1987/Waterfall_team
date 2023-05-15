package WaterFallPageAction;

import org.testng.Assert;

import WaterFallPageLocator.PlaceOrderLocator;
import WaterFallUtility.WaterFallBase;

public class PlaceOrderAction extends WaterFallBase{
	PlaceOrderLocator placeOrderLocator = new PlaceOrderLocator();
public void VerifyPlaceOrderDisplay() throws Exception {
	Thread.sleep(3000);
	
	boolean verifyorderP=placeOrderLocator.VarifyPlaceOrder.isDisplayed();
	Assert.assertTrue(verifyorderP);
}
}
