package Page.Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page.BasePage;
import Page.MainPage;

public class ProductPage extends BasePage{

	WebDriver driver;
	
	@FindBy(xpath = "//div[contains(text(),\"新建商品\")]")
	WebElement CreateProBtn;
	//dLabel
	public ProductPage(WebDriver driver){
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Test() throws InterruptedException{
		
		MainPage main = new MainPage(driver);
		main.EnterProductManager();
		//Thread.sleep(3000);
		System.out.println("clickable :"+CreateProBtn.isEnabled());
		CreateProBtn.click();

	}
	
}
