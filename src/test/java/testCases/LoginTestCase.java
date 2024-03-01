package testCases;

public class LoginTestCase extends BaseClass{
	
		@Test(priority=1)
		public void register() throws InterruptedException {
			logger.info("**starting login testcase**");
				
				HomePage hp=new HomePage(driver);
				logger.info("**clicking on my account**");
				hp.clickOnMyAccount();	
				Thread.sleep(2000);
				logger.info("**clicking on login**");
				hp.clickOnLogin();
				Thread.sleep(2000);
				
				
				
				logger.info("**entering the credentias**");
				LoginPage lp=new LoginPage(driver);
				Thread.sleep(2000);
				
				lp.enterUserName("asharanic59@gmail.com");
				Thread.sleep(2000);
			    lp.enterPassword("12345678");
			    Thread.sleep(2000);
			    lp.clickOnLogin();
				logger.info("**login testcase is completed**");
			    
		}
	}

