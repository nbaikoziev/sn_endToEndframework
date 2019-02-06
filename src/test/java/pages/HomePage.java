package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Driver;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(xpath = "(//a[@class='button'])[2]")
	private WebElement clickR;

	@FindBy(xpath = "(//textarea[@id='comment'])")
	private WebElement Reciept;

	@FindBy(xpath = "//img[@class='ui-datepicker-trigger']")
	private WebElement clickDateIn;

	@FindBy(xpath = "(//a[@class='ui-state-default'])[15]")
	private WebElement clickSpecificDate;

	@FindBy(xpath = "//input[@class='editOnLockTop']")
	private WebElement refrence;

	@FindBy(xpath = "//select[@class='editOnLockTop']")
	private WebElement Vendor;

	@FindBy(xpath = "//li[@id='saveButton']")
	private WebElement savebtn;

	@FindBy(xpath = "//a[@id='addDetailLink']")
	private WebElement addbtn;

	@FindBy(xpath = "//span[@id='closeCookieConsentBtn']")
	private WebElement closeCookie;

	@FindBy(xpath = "//select[@name='details[0].item']")
	private WebElement seltoadditem;

	@FindBy(xpath = "//select[@name='details[0].location']")
	private WebElement addlocation;

	@FindBy(xpath = "//input[@name='details[0].quantity']")
	private WebElement quantity;

	@FindBy(xpath = "//input[@name='details[0].cost']")
	private WebElement cost;

	@FindBy(xpath = "//a[@class='detailSaveButton']")
	public WebElement save2;

    
	@FindBy(xpath = "//input[@id='document']")
	public WebElement uploadFile1;
	
	
	
	
	/*
	 * 
	
	Safe zone between web elements  and it's methods
	
	*
	*/
	
	
	
	public void UPLOADFILE1R() {

		String pathFile = "/Users/nursultanbaikoziev/Desktop/CybertekChicago6/Book1.xlsx";
		uploadFile1.sendKeys(pathFile);
	}
	
	
     public void SCROLLDOWN() {
    	 JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
 		jse.executeScript("window.scrollBy(0,250)");

    	 
     }
	
	public void COST() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 7);
		wait.until(ExpectedConditions.visibilityOf(cost));
		cost.clear();
		cost.sendKeys("20000");
	}

	public void QUANTITY() {
		quantity.sendKeys("1");

	}

	public void ADDTOLOCATION() {
		Select sel = new Select(addlocation);
		sel.selectByIndex(1);
	}

	public void SELECTTOADDITEM() {
		Select sel = new Select(seltoadditem);

		sel.selectByIndex(7);
	}

	public void CLOSECOOKIE() {
		Actions a = new Actions(Driver.getDriver());
		a.moveToElement(closeCookie);
		if (closeCookie.isDisplayed()) {
			closeCookie.click();
		}

	}

	public void ADDBTN() {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.visibilityOf(addbtn));
		addbtn.click();
	}

	public void SAVEBTN() {

		savebtn.click();
	}

	public void VENDOR() {
		Select select = new Select(Vendor);
		select.selectByIndex(1);

	}

	public void REFFERANCE() {
		refrence.sendKeys("#chicago006");
	}

	public void selectDate() {
		clickDateIn.click();
		clickSpecificDate.click();

	}

	public void reciptComment() {
		Reciept.sendKeys("Geeting Brand new Toyota Camry From new yourk loaction");
	}

	public void clickNR() {
		clickR.click();
	}

}
