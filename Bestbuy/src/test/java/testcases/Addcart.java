package testcases;




	import org.openqa.selenium.JavascriptExecutor;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	import baseclass.Baseclass;
import pom.Account;
import pom.Homepage;

public class Addcart extends Baseclass{
		
		@Test
		public void AddCartbyShopDepartment() {
			
			try {
			Homepage hp= new Homepage(driver);
			
			hp.clickMenu();
			Thread.sleep(1000);
			
			hp.clickApplianceShopByDepartment();
			Thread.sleep(1000);
			
			hp.clickWasherDryers();
			Thread.sleep(1000);
			
			hp.clickFrontLoadMachines();
			Thread.sleep(1000);
			
			hp.clickFirstProduct();
			Thread.sleep(1000);
			
			Account map = new Account(driver);
			
			//JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	        
	       // jsExecutor.executeScript("arguments[0].scrollIntoView({ behavior: 'auto', block: 'center', inline: 'center' });", element);
			
			map.clickAddToCart();
			Thread.sleep(2000);
			
			map.clickCart();
			Thread.sleep(2000);
			
			map.verifyCheckout();
			
			
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}

	}



