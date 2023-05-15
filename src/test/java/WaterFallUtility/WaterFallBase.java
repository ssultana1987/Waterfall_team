package WaterFallUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class WaterFallBase {
	public static WebDriver driver;
	public static Properties wpro;
	
public WaterFallBase () {
	try {
		FileInputStream waterfallFile =new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\WaterFallConfig\\WaterFallConfigFile.Properties");
		wpro= new Properties();
		wpro.load(waterfallFile);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void waterfallBrowser() {
	String Browser = wpro.getProperty("WaterFallBrowser1");
	if(Browser.equalsIgnoreCase("Chrome")) {
		//System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"\\WaterfallDriver\\chromedriver.exe")); //Chrome driver
	    //driver = new ChromeDriver();//Chrome Driver
	    System.setProperty("webdriver.edge.driver", (System.getProperty("user.dir")+"\\WaterFallDriverIE\\msedgedriver.exe")); //IE Driver
	    EdgeOptions co = new EdgeOptions();
	    co.addArguments("--remote-allow-origins=*");
	    driver = new EdgeDriver(co);// IE Driver
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaterFallTestData.implicitlyWait));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WaterFallTestData.pageLoadTimeout));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	else if (Browser.equalsIgnoreCase("FF"));
		
	}
	public static void waterfallURL(String URL) {
		driver.get(wpro.getProperty("URLQA"));
	
}
}
