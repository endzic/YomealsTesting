package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class LocationPopupPage extends BasicPage {

	public LocationPopupPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
//	get metoda za element koji prikazuje lokaciju u hederu 
	
	public WebElement getSelectLocationBnt() {
		return this.driver.findElement(By.xpath("//*[@class=\"location-selector\"]/a"));
	}
	
//	get metodu za close element
	
	public WebElement getCloseElement() {
		return this.driver.findElement(By.className("close-btn"));
	}
//	get metode potrebne za implementaciju metode u kojoj se postavlja lokacija
//	getKeyword()
//	//*[@id='locality_keyword']
//	getLocationItem(String locationName)
//	//li/a[contains(text(), '" + locationName + "')]/..
//	i nije greska na kraju postoje dve tacke!
//	getLocationInput()
//	//*[@id='location_id']
//	getSubmit()
//	//*[@name='btn_submit']
//	metodu koja otvara iskačući dijalog
//	klikom na lokaciju iz hedera
//	metodu koja postavlja lokaciju - naziv lokacije (locationName) se prosleđuje kao parametar metode
//	metoda prvo klikne na element keyword element
//	čita vrednost data-value atributa location item elementa
//	postavlja lokaciju izvršavajući JavaScript kod
//	Skripta: arguments[0].value=arguments[1]
//	prvi argument skripte je location input
//	drugi argument skripte je vrednost pročitanog atributa iz drugog koraka.
//	Klikće na submit element preko skripte arguments[0].click();
//	metodu koja zatvara iskačući dijalog, klikom na X dugme


	
}
