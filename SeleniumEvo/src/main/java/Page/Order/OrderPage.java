package Page.Order;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page.BasePage;
import Page.MainPage;

public class OrderPage extends BasePage{

	public WebElement allOrder;
	public WebElement NoPayOrder;
	public WebElement WaitOrder;
	public WebElement SendOrder;
	public WebElement ConfimOrder;
	public WebElement CloseOrder;
	
	@FindBy(linkText = "新增订单")
	public WebElement NewOrderBtn;
	
	public OrderPage(WebDriver driver){
		super(driver);
	}
	public void CreateOrder(){
		try{
		MainPage main = new MainPage(driver);
		main.EnterOrderManager();
		NewOrderBtn.click();
		}catch(NoSuchElementException e){
			System.out.println("can't find" +e.getMessage());
		}
	}
	
}
