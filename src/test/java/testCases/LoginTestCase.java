package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LogInPage;
import testBase.BaseClass;

public class LoginTestCase extends BaseClass{
	
		@Test(priority=1)
		public void login() throws InterruptedException {
			logger.info("**starting login testcase**");
				
				HomePage hp=new HomePage(driver);
				logger.info("**clicking on my account**");
				hp.ClickOnMyAccount();	
				Thread.sleep(2000);
				logger.info("**clicking on login**");
				hp.clickonLogin();
				Thread.sleep(2000);
				
				
				
				logger.info("**entering the credentias**");
				LogInPage lp=new LogInPage(driver);
				Thread.sleep(2000);
				
				lp.sendAddress("praveengowda1310@gmail.com");
				Thread.sleep(2000);
			    lp.sendPassword("12345678");
			    Thread.sleep(2000);
			    lp.selectLogIn();
				logger.info("**login testcase is completed**");
			    
		}
	}

