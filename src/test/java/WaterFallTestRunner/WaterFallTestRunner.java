package WaterFallTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import WaterFallUtility.WaterFallBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/resources/WaterFallFolder"},
plugin = {"json:target/cucumber.json"},
glue = "WaterFallStepDefination",tags = {"@Sultana"})

public class WaterFallTestRunner extends AbstractTestNGCucumberTests{
@BeforeTest  
public void WaterFallOpenURL() {
	WaterFallBase test=new WaterFallBase();
	test.waterfallBrowser();
}
@AfterTest
public void WaterFallCloseURL() {
	WaterFallBase test=new WaterFallBase();
	test.driver.quit();
}
}