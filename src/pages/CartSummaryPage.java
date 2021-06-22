package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartSummaryPage extends BasicPage {

	public CartSummaryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


//		Cart Summary Page:
//		get metodu za Clear All dugme
//		metodu koja briše sve stavke iz korpe klikom na Clear All dugme
	
	public WebElement getClearAllBtn() {
		return driver.findElement(By.xpath("//div[@id=\"cartSummary\"]/div/a[2]"));
	}

	public void clickOnClearAllBtn() {
		getClearAllBtn().click();
	}
}
