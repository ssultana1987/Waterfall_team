package WaterFallStepDefination;

import WaterFallPageAction.HomePageAction;
import WaterFallUtility.WaterFallBase;
import cucumber.api.java.en.Then;

public class Homee extends WaterFallBase{
	HomePageAction homePageAction =new HomePageAction();
	@Then("^Click Samsung Galaxy$")
	public void click_Samsung_Galaxy() throws Throwable {
		homePageAction.ClickSamsungGalaxy();
	}
}
