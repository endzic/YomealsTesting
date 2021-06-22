package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasicPage {

	protected WebDriver driver;
	protected JavascriptExecutor js;
	protected WebDriverWait waiter;
	protected Actions action;

	
	public BasicPage(WebDriver driver) {
		this.driver = driver;
		this.js = (JavascriptExecutor)driver;
		this.waiter = new WebDriverWait(driver, 10);
		this.action = new Actions(driver);

	}
}
