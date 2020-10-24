package testbase;

import org.openqa.selenium.support.PageFactory;

public class GooglePage extends TestBase{
	


	//Initializing the Page Objects:
	public GooglePage(){
		PageFactory.initElements(driver, this);
	}

	//Actions:
			public String validateGooglePageTitle(){
				return driver.getTitle();
			}

}
