package WaterFallPageAction;

import WaterFallPageLocator.LoginPageLocator;
import WaterFallUtility.WaterFallBase;

public class LoginPageAction extends WaterFallBase {
	LoginPageLocator loginPageLocator =new LoginPageLocator ();
	public void userCard(String u, String p) {
		loginPageLocator.Username.sendKeys(u);
		loginPageLocator.Password.sendKeys(p);
		loginPageLocator.LoginButton.click();
		
	}

}
