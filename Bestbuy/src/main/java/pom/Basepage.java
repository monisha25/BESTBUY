package pom;


	

	import java.util.ResourceBundle;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

	public class Basepage {
		
		public WebDriver driver;
		public ResourceBundle rb = ResourceBundle.getBundle("data");
		
		public Basepage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

	}



