package WaterFallStepDefination;

import WaterFallPageAction.ProDuctAction;
import WaterFallUtility.WaterFallBase;
import cucumber.api.java.en.Then;

public class Product extends WaterFallBase{
	ProDuctAction proDuctAction = new ProDuctAction();
	@Then("^Click Add to Caarttt$")
	public void click_Add_to_Caarttt() throws Throwable {
		
		 proDuctAction.ClickAddtoCaarttt();
		 Thread.sleep(3000);
		
	}

	@Then("^Clickk Carttt Linkkk$")
	public void clickk_Carttt_Linkkk() throws Throwable {
		proDuctAction.ClickkCartttLinkkk();
		Thread.sleep(3000);
}
}