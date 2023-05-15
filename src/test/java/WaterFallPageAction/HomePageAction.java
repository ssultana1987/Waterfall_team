package WaterFallPageAction;

import WaterFallPageLocator.HomePageLocator;
import WaterFallUtility.WaterFallBase;

public class HomePageAction extends WaterFallBase{
	HomePageLocator homePageLocator =new HomePageLocator ();
	public void ClickLoginnn() {
		
		homePageLocator.LoginLink.click();
	}
	public void ClickSamsungGalaxy() throws Exception {//create method with Steps
		homePageLocator.SamsungGalaxy.click();
		Thread.sleep(3000);
		
	}

	
}
