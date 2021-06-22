package tests;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.LocationPopupPage;
import pages.LoginPage;
import pages.NotificationSistemPage;


public abstract class BasicTest {
	
	protected WebDriver driver;
	protected String baseUrl =  "http://demo.yo-meals.com/";
	protected String userEmail = "customer@dummyid.com";
	protected String userPassword = "12345678a";
	protected LocationPopupPage locationPopupPage;
	protected LoginPage loginPage;
	protected NotificationSistemPage notificationSystemPage;
	
	private File screenshot;
	private Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		this.driver = new ChromeDriver();
		
		this.driver.manage().window().maximize();
		
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		this.driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		
		this.locationPopupPage = new LocationPopupPage(driver);
		this.loginPage = new LoginPage(driver);
		this.notificationSystemPage = new NotificationSistemPage(driver);
	}
	
	@AfterMethod
	public void cleanup() throws IOException {
		takeScreenshot();
		
//		driver.quit();
//		
		
	}
	
	private void takeScreenshot () throws IOException {
		this.screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("screenshots\\" + sdf.format(timestamp) + ".png"));
	}
}
