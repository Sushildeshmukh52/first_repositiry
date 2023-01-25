package Com.Ecommerse.Baseclass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.google.j2objc.annotations.Property;

import Com.Ecommerse.Configure.readconfiguration;
import Com.Ecommerse.Utilities.ecommerse_utilities;

public class ecommerse_baseclass {
	public static WebDriver driver;
	public static Logger logger;
	readconfiguration readcon=new readconfiguration();
	public String baseURL=readcon.appurl();
	public String mail=readcon.appmail();
	public String passwords=readcon.apppass();
	public String chromepath=readcon.appchromepath();

	
	
	@BeforeMethod
	public void setup() {
		logger=logger.getLogger("30 July");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		System.setProperty("webdriver.chrome.driver",chromepath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ecommerse_utilities.impl_wait,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(ecommerse_utilities.pageload,TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}
