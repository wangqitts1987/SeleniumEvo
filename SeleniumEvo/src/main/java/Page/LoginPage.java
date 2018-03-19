package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

	@FindBy(id = "userName")
	public WebElement UserName;
	
	@FindBy(id = "pwd")
	public WebElement Password;
	
	@FindBy(xpath = "//input[@value='登录']")
	public WebElement submit;
	
	
	public LoginPage(WebDriver driver){
		super(driver);
	}
	
	public void login(String user ,String pwd){

		UserName.sendKeys(user);
		Password.sendKeys(pwd);
		submit.click();
	} 
	
}
