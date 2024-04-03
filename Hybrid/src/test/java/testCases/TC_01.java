package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_01 extends BaseClass {//base blass methods will execute here first
	
	@Test
	public void logiTest() {
		logger.info("browser started up and running");
		driver.get(url);
		logger.info("opened the site of guru 99");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUsernameAndPasswordAndLogin(username,password);
		
		logger.info("successfully logged into the site");

	}

}
