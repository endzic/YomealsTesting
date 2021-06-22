package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasicPage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
//		Login Page:
//		get metode za sve potrebne elemente
//		metodu koja prijavljuje korisnika na sistem - kao parametri se prosleđuju imejl i lozinka

	public WebElement getUsername() {
		return driver.findElement(By.name("username"));
	}

	public WebElement getPassword() {
		return driver.findElement(By.name("password"));
	}
	
	public WebElement getRememberMe () {
		return driver.findElement(By.name("remember_me"));
	}
	
	public WebElement getForgotPassword() {
		return driver.findElement(By.xpath("//p/a"));
	}
	
	public WebElement getLoginBnt() {
		return driver.findElement(By.name("btn_submit"));
	}
	
	public void userLoginMethod(String email, String password) {
		getUsername().clear();
		getUsername().sendKeys(email);
		getPassword().clear();
		getPassword().sendKeys(password);
		getLoginBnt().click();
	}
}
