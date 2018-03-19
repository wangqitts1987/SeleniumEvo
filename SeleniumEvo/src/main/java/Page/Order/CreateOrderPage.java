package Page.Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Page.BasePage;

public class CreateOrderPage extends BasePage{
	
	WebDriver driver;
	
	@FindBy(how = How.ID , id = "mobile")
	WebElement MobileInput ; 
	
	@FindBy(how = How.LINK_TEXT , linkText = "搜索")
	WebElement SearchBtn ;
	
	@FindBy(how = How.LINK_TEXT , linkText = "搜索")
	WebElement ProductInput;
	
	WebElement SaveBtn;
	
	public CreateOrderPage(WebDriver driver){
		super(driver);
	}
	
	public void NewOrder(String mobile,String product,String count){
		MobileInput.sendKeys(mobile);
		SearchBtn.clear();
		ProductInput.sendKeys("product");
	}
	
}
