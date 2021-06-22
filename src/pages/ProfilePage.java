package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class ProfilePage extends BasicPage {

	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
//		Profile Page:
//		get metode za sve potrebne elemente
//		sve elemente za izmenu osnovnih informacija kao i 
	
	public WebElement getFirstName() {
		return driver.findElement(By.name("user_first_name"));
	}
	
	public WebElement getLastName() {
		return driver.findElement(By.name("user_last_name"));
	}
	
	public WebElement getEmail() {
		return driver.findElement(By.name("user_email"));
	}
	
	public WebElement getAddress() {
		return driver.findElement(By.name("user_address"));
	}
	
	public WebElement getPhoneNo() {
		return driver.findElement(By.name("user_phone"));
	}
	
	public WebElement getZipCode() {
		return driver.findElement(By.name("user_zip"));
	}
	
	public WebElement getCountry() {
		return driver.findElement(By.id("user_country_id"));
	}
	
	public WebElement getState() {
		return driver.findElement(By.id("user_state_id"));
	}
	
	public WebElement getCity() {
		return driver.findElement(By.id("user_city"));
	}
	
	public void selectFromDropDown(WebElement element, String name) {
		Select category = new Select(element);
		category.selectByVisibleText(name);
	}
	
	public WebElement getSaveInfobtn() {
		return driver.findElement(By.xpath("//*[@id=\"profileInfoFrm\"]//input[@name=\"btn_submit\"]"));
	}
	
	public WebElement getCurrentPassword() {
		return driver.findElement(By.name("current_password"));
	}
	
	public WebElement getNewPassword() {
		return driver.findElement(By.name("new_password"));
	}
	
	public WebElement getConfirmPassword() {
		return driver.findElement(By.name("conf_new_password"));
	}
	
	public WebElement getSavePassBtn() {
		return driver.findElement(By.xpath("//*[@id=\"frm_fat_id_changePwdFrm\"]//input[@name=\"btn_submit\"]"));
	}
	
//	sve elemente potrebne za rad sa profilnom slikom
//	da bi se na stranici pojavio element input type="file" potrebno je da se prvo izvrši JavaScript kod koji vrši akciju klik na Upload dugme 
//	Skripta: arguments[0].click();
	
	public WebElement getProfileAvatar() {
		return driver.findElement(By.className("avatar"));
	}
	
	public WebElement getUploadBtn() {
		return driver.findElement(By.xpath("//div[@class=\"hover-elemnts\"]/a"));
	}
	
	public void clickOnUploadBtn() {
		js.executeScript("arguments[0].click()", getUploadBtn());
	}
	

	public WebElement getFile() {
		return driver.findElement(By.xpath("//div/input[@type=\"file\"]"));
	}
	
//	metodu koja otprema profilnu sliku - kao parametar se prosleđuje putanja do fajla, tj. u ovom slučaju do slike
	
	public void UploudPicture(String path) {
		action.moveToElement(getProfileAvatar()).moveToElement(getUploadBtn()).perform();
		clickOnUploadBtn();
		getFile().sendKeys(path);
	} 

//		metodu koja briše profilnu sliku
//		klikom na Remove dugme 
//		Preporuka: izvršite JavaScript kod arguments[0].click(); nad tim dugmetom
	
	public WebElement getRemoveBtn() {
		return driver.findElement(By.xpath("//div[@class=\"hover-elemnts\"]/a[2]"));
	}
	
	public void clickOnRemoveBtn() {
		js.executeScript("arguments[1].click()", getRemoveBtn());
	}
	
	public void RemovePicture() {
		action.moveToElement(getProfileAvatar()).moveToElement(getRemoveBtn()).perform();
		clickOnRemoveBtn();
	}
	
//		metodu koja menja sve osnovne informacije korisnika - kao parametri se prosleđuju sve potrebne informacije
	
	public void changePersonalInformation(String firstName,
											String lastName,
											String email,
											String address,
											String phoneNo,
											String zipCode,
											String country,
											String state,
											String city) {
		getFirstName().clear();
		getFirstName().sendKeys(firstName);
		
		getLastName().clear();
		getLastName().sendKeys(lastName);
		
		getEmail().clear();
		getEmail().sendKeys(email);
		
		getAddress().clear();
		getAddress().sendKeys(phoneNo);
		
		getZipCode().clear();
		getZipCode().sendKeys(zipCode);
		
		selectFromDropDown(getCountry(), country);
		selectFromDropDown(getState(), state);
		selectFromDropDown(getCity(), city);
		
		getSaveInfobtn().click();
	}
	
}
