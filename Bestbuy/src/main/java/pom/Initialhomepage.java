package pom;


	

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;

	public class Initialhomepage  extends Basepage{

		public Initialhomepage(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}

		
		@FindBy(xpath="//a[@class='us-link']")
		WebElement uslink;
		
		@FindBy(xpath="//a[@class='canada-link']")
		WebElement canadalink;
		
		
		//Action Methods
		public void clickUnitedStates() {
			uslink.click();
		}
		
		public void clickCanada() {
			canadalink.click();
		}
		
	}



