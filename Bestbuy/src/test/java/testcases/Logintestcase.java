package testcases;


	

	import org.testng.Assert;
	import org.testng.annotations.Test;

import baseclass.Baseclass;
import pom.Account;
import pom.Homepage;
import pom.Loginpage;

	public class Logintestcase extends Baseclass{
		
		@Test
		public void testLogin() {
			
			try {
			Homepage hp = new Homepage(driver);
			hp.clickAccount();
			hp.clickSignIn();
			
			Loginpage lp = new Loginpage(driver);
			lp.enterValidEmail(rb.getString("validemail"));
			lp.enterValidPassword(rb.getString("password"));
			lp.clickSignin();
			Thread.sleep(2000);
			
			Account map =new Account(driver);
			map.verifySuccessfulLogin();
			
			}
			catch(Exception e) {
				Assert.fail();
			}
			
		}

	}


