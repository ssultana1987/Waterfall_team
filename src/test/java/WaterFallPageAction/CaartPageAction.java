package WaterFallPageAction;

import WaterFallPageLocator.CaartPageLocator;
import WaterFallUtility.WaterFallBase;

public class CaartPageAction extends WaterFallBase{
	CaartPageLocator caartPageLocator = new CaartPageLocator();
public void ClickPlaceOrder() throws Exception {
	
	caartPageLocator.PlaceOrder.click();
	Thread.sleep(3000);
}
}
