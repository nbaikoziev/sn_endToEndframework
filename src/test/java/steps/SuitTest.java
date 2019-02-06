package steps;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import utilities.Driver;

public class SuitTest {

  private static WebDriver driver = Driver.getDriver();

	@Test(priority = 1) 
	
	public void test2() throws InterruptedException {
		
		driver.get("http://transunion.com");

		HomePage hp = new HomePage();

		hp.clickNR();

		hp.reciptComment();

		hp.selectDate();

		hp.REFFERANCE();

		hp.VENDOR();

		hp.SAVEBTN();

		hp.ADDBTN();

		hp.SELECTTOADDITEM();

		hp.ADDTOLOCATION();

		hp.QUANTITY();

		hp.COST();

		hp.save2.click();


	}
}
