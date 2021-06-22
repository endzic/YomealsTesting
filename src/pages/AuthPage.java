package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthPage extends BasicPage {

	public AuthPage(WebDriver driver) {
		super(driver);
	}
	
//		Auth Page:
//		get metode za sve potrebne elemente sa stranice   
//		metodu koja odjavljuje korisnika sa sistema

	public WebElement getAccountsLink() {
		return driver.findElement(By.xpath("//*[@class=\"accounts-link\"]/a"));
	}
	
	public WebElement getMyAccount() {
		return driver.findElement(By.xpath("//*[@class=\"my-account-dropdown\"]//a"));
	}
	
	public WebElement getLogout() {
		return driver.findElement(By.xpath("//*[@class=\"my-account-dropdown\"]//a[2]"));
	}
	
	public void logOutMethod() {
		this.getAccountsLink().click();
		this.getLogout().click();
	}


}
