package WaterFallPageAction;

import org.testng.Assert;

import WaterFallPageLocator.ProfilePageLocator;
import WaterFallUtility.WaterFallBase;

public class ProfilePageAction extends WaterFallBase{
	ProfilePageLocator profilePageLocator =new ProfilePageLocator ();
	public void VerifyUserCanLoginnnSuccessfullyy() {
		boolean profilevalidation= profilePageLocator.Profile.isDisplayed();
		Assert.assertTrue(profilevalidation);
		
	}

}
