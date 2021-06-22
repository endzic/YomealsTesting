package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NotificationSistemPage extends BasicPage {

	public NotificationSistemPage(WebDriver driver) {
		super(driver);
	}
	
//		get metodu za element koji prikazuje poruku
//		//*[contains(@class, 'alert--success') or contains(@class, 'alert--danger')][contains(@style,'display: block')]
	
	public WebElement getSystemMessageAlert() {
		return driver.findElement(By.xpath("//*[contains(@class, \"alert--success\") or contains(@class, \"alert--danger\")][contains(@style,\"display: block\")]"));
	}
	
//		metodu koja vraća poruku koja se nalazi u obaveštenju
	
	public String getAlertMessage() {
		return driver.findElement(By.xpath("//*[@class=\"div_msg\"]/ul/li")).getText();
	}
	
//		metodu koja čeka da obaveštenje nestane
//		čeka se da element //*[contains(@class, 'system_message')]
//		za atribut style dobije vrednost  "display: none;"
	
	public By getNoMassage() {
		return By.xpath("//*[contains(@class, \"system_message\") and @style=\"display: none;\"]");
	}
	
	public void waitMessageToDisappear() {
		waiter.until(ExpectedConditions.presenceOfElementLocated(getNoMassage()));
	}


}
