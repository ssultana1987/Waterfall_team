package WaterFallStepDefination;



import WaterFallPageAction.HomePageAction;
import WaterFallPageAction.LoginPageAction;
import WaterFallPageAction.ProfilePageAction;
import WaterFallUtility.WaterFallBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WaterFallLogin extends WaterFallBase{
	HomePageAction homePageAction =new HomePageAction();
	LoginPageAction loginPageAction =new LoginPageAction();
	ProfilePageAction profilePageAction = new ProfilePageAction();
	
	@Given("^Open Demoblaze <\"([^\"]*)\"> Application$")
	public void open_Demoblaze_Application(String URL) throws Throwable {
		waterfallURL(URL) ;
		Thread.sleep(2000);
	}

	@Then("^Click Loginnn$")
	public void click_Loginnn() throws Throwable {
		homePageAction.ClickLoginnn(); 
		Thread.sleep(2000);
	}

	@Then("^Enter Usernamee and Passwordd and Click Login(\\d+)$")
	public void enter_Usernamee_and_Passwordd_and_Click_Login(int arg1) throws Throwable {
		loginPageAction.userCard(wpro.getProperty("Username"),wpro.getProperty("Password")); 
		Thread.sleep(2000);
	}

	@Then("^Verify User Can Loginnn Successfullyy$")
	public void verify_User_Can_Loginnn_Successfullyy() throws Throwable {
		profilePageAction.VerifyUserCanLoginnnSuccessfullyy();
		Thread.sleep(2000);
	    
	}
}
