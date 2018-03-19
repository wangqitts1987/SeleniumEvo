package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{
	
	@FindBy(xpath = "//span[text()='商城管理']")
	WebElement ShopMenu;
	
	@FindBy(linkText = "订单管理")
	WebElement OrderManager;
	
	@FindBy(linkText = "商品管理")
	WebElement ProductManager;
	
	@FindBy(linkText = "商城BANNER")
	WebElement ShopBannerManager;
	
	public MainPage(WebDriver driver){
		super(driver);
	}
	
	public void EnterOrderManager(){
		if (!OrderManager.isDisplayed()){
			ShopMenu.click();
		}
		OrderManager.click();
	}
	
	public void EnterProductManager(){
		if (!ProductManager.isDisplayed()){
			ShopMenu.click();
		}
		ProductManager.click();
	}
	
	public void EnterBannerManager(){
		if (!OrderManager.isDisplayed()){
			ShopMenu.click();
		}
		ShopBannerManager.click();
	}
}
