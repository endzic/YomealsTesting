package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LocationPopupPage extends BasicPage {

	public LocationPopupPage(WebDriver driver) {
		super(driver);
	}
	
//	get metoda za element koji prikazuje lokaciju u hederu 
	
	public WebElement getSelectLocationBnt() {
		return this.driver.findElement(By.xpath("//*[@class=\"location-selector\"]/a"));
	}
	
//	get metodu za close element
	
	public WebElement getCloseElement() {
		return this.driver.findElement(By.xpath("//*[@id=\"location-popup\"]//a"));
	}
	
//	get metode potrebne za implementaciju metode u kojoj se postavlja lokacija
//	getKeyword()
//	//*[@id='locality_keyword']
	
	public WebElement getKeyword() {
		return this.driver.findElement(By.id("locality_keyword"));
	}
	
//	getLocationItem(String locationName)
//	//li/a[contains(text(), '" + locationName + "')]/..
//	i nije greska na kraju postoje dve tacke!
	
	public WebElement getLocationItem(String locationName) {
		return this.driver.findElement(By.xpath("//li/a[contains(text(),\"" + locationName +"\")]"));
	}
	
//	getLocationInput()
//	//*[@id='location_id']
	
	public WebElement getLocationInput() {
		return this.driver.findElement(By.id(""));
	}
	
//	getSubmit()
//	//*[@name='btn_submit']
	
	public WebElement getSubmit() {
		return this.driver.findElement(By.name("btn_submit"));
	}
	
//	metodu koja otvara iskačući dijalog
//	klikom na lokaciju iz hedera
	
	public void clickOnSelectLocationBnt() {
		getSelectLocationBnt().click();
	}
	

//	metodu koja postavlja lokaciju - naziv lokacije (locationName) se prosleđuje kao parametar metode
//	metoda prvo klikne na element keyword element
//	čita vrednost data-value atributa location item elementa
//	postavlja lokaciju izvršavajući JavaScript kod
//	Skripta: arguments[0].value=arguments[1]
//	prvi argument skripte je location input
//	drugi argument skripte je vrednost pročitanog atributa iz drugog koraka.
//	Klikće na submit element preko skripte arguments[0].click();
	
	public void setUpLocation(String locationName) {
		getKeyword().click();
		String dataValue = getLocationItem(locationName).getAttribute("data-value");
		this.js.executeScript("arguments[0].value=arguments[1]", getLocationInput(), dataValue);
		this.js.executeScript("arguments[0].click()", getSubmit());
	}
	
//	metodu koja zatvara iskačući dijalog, klikom na X dugme
	
	public void closeSelectLocationWindow() {
		getCloseElement().click();
	}


	
}
