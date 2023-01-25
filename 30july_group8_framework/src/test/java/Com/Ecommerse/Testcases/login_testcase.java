package Com.Ecommerse.Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerse.Baseclass.ecommerse_baseclass;
import Com.Ecommerse.Pageclass.ecommerse_loginpage;

public class login_testcase extends ecommerse_baseclass {

	@Test
	public void logintestcase()  {
		
		logger.info("open ecommerce url");
		
		ecommerse_loginpage TEL=new ecommerse_loginpage();
		
		TEL.login(mail);
		logger.info("enter mail");
		 
		TEL.pass(passwords);
		logger.info("enter password");
		
		TEL.click();
		logger.info("click on login");
		
		
		if(driver.getTitle().equals("nopCommerce demo store")) {
			Assert.assertTrue(true);
			logger.info("login succesful");
		}
		else {
			Assert.assertTrue(false);
			logger.info("login unsuccesful");
		}
		
		
	}
}
