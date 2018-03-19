package Page.Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Page.BasePage;
import Page.MainPage;

public class ShopBannerPage extends BasePage{
	
	@FindBy(how = How.LINK_TEXT , linkText = "+新建BANNER")
	public WebElement CreateBannerBtn;
	
	@FindBy(how = How.NAME , name = "title")
	public WebElement titleInput;
	
	@FindBy(how = How.NAME , name = "urlType")
	public WebElement typeInput;
	
	
	@FindBy(how = How.ID , id = "upLaunch")
	public WebElement fileInput;
	
	public ShopBannerPage(WebDriver driver){
		super(driver);
	}
	
	public void CreateBanner(String title){
		MainPage main = new MainPage(driver);
		main.EnterBannerManager();
		
		CreateBannerBtn.click();
		titleInput.sendKeys(title);
		typeInput.click();
		fileInput.sendKeys("");
		
	}
	
	
}
