package testcases;


	

	import org.testng.Assert;
	import org.testng.annotations.Test;

	import baseclass.Baseclass;
import pom.Account;
import pom.Brands;
import pom.Checkoutpage;
import pom.Homepage;
import pom.Paymentpage;

	public class Checkout  extends Baseclass{
		
		@Test
		public void testCheckoutItem() {
			try
			{
				Homepage hp = new Homepage(driver);
				hp.clickMenu();
				Thread.sleep(1000);
				hp.clickBrands();
				Thread.sleep(1000);
				hp.clickBestBuyBrands();
				Thread.sleep(2000);
				
				Brands bbb = new Brands(driver);
				bbb.clickBestBuyBrandsAppliances();
				bbb.clickBestBuyBrandsAC();
				Thread.sleep(2000);
				bbb.clickBBBFirstItem();
				Thread.sleep(1000);
				bbb.clickBBBAddtoCart();
				Thread.sleep(3000);
				bbb.clickContinueShopping();
				
				Account map = new Account(driver);
				map.clickCart();
				Thread.sleep(2000);
				map.verifyCheckout();
				
				Checkoutpage cp = new Checkoutpage(driver);
				cp.clickCheckout();
				Thread.sleep(2000);
				
				//Enter Billing address details
				cp.clickContinueAsGuest();
				Thread.sleep(1000);
				cp.enterFirstName(rb.getString("firstname"));
				cp.enterLastName(rb.getString("lastname"));
				cp.enterAddress(rb.getString("address"));
				cp.enterCity(rb.getString("city"));
				cp.selectState(rb.getString("state"));
				cp.enterZipcode(rb.getString("zip"));
				cp.clickApply();
				Thread.sleep(1000);
				
				cp.checkSorryMessage();
				
				//Enter contact information
				cp.enterEmail(rb.getString("email"));
				cp.enterPhone(rb.getString("phone"));
				cp.clickContinueInfo();
				
				Thread.sleep(2000);
				
				//Enter Card details in payment page
				Paymentpage pp = new Paymentpage(driver);
				pp.enterCardNumber(rb.getString("cardnumber"));
				pp.selectMonth(rb.getString("expmonth"));
				pp.selectYear(rb.getString("expyear"));
				pp.enterCVV(rb.getString("CVV"));
				
				pp.clickPlaceYourOrder();
				
			}
			catch(Exception e) {
				e.printStackTrace();
				Assert.fail();
			}
		}

	}



