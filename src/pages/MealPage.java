package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MealPage extends BasicPage {

	public MealPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

//		Meal Page:
//		get metode za sve potrebne elemente
	
	public List<WebElement> getProducts() {
		return driver.findElements(By.xpath("//div[@class=\"product-grid-item\"]"));
	}
	
	public WebElement getItem(int i) {
		return getProducts().get(i).findElement(By.xpath("//div/div//a"));
	}
	
	public WebElement getQty() {
		return driver.findElement(By.name("product_qty"));
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(By.xpath("//div[text()=\"Add To Cart\"]"));
	}
	
	public WebElement getFavoriteBtn(int i) {
		return getProducts().get(i).findElement(By.xpath("//div/a"));
	}
	
//	metodu koja dodaje jelo u korpu - kao parametar se prosleđuje količina
	
	public void selectItem(int i, int qty) {
		getItem(i).click();
		getQty().clear();
		String quantity = Integer.toString(qty);
		getQty().sendKeys(quantity);		
	} 
	
//	metodu koja jelo dodaje u omiljena jela, klikom na dugme Favorite 
	
	public void setFavoriteItem(int i) {
		getFavoriteBtn(i).click();                                                          
	}

	
//	private WebElement nekaForMetoda(String name) {
//		for(int i = 0; i < getProducts().size(); i++) {
//			getProducts().get(i).findElement(By.className(""))
//		}
//	}
}
