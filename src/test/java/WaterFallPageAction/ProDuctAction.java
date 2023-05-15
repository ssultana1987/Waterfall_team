package WaterFallPageAction;

import WaterFallPageLocator.ProDuctLocator;
import WaterFallUtility.WaterFallBase;

public class ProDuctAction extends WaterFallBase{
	ProDuctLocator proDuctLocator = new ProDuctLocator();
	public void ClickAddtoCaarttt() throws Exception {
		proDuctLocator.AddToCaarttS.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	public void ClickkCartttLinkkk() throws Exception {
		Thread.sleep(3000);
		proDuctLocator.CaartLink.click();
		Thread.sleep(3000);
	}
}

