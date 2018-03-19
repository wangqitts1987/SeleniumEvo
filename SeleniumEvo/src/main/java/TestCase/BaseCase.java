package TestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import Page.LoginPage;
import Utils.ConfigReader;
import Utils.DriverFactory;
import Utils.User;

public class BaseCase {

	protected WebDriver driver;
	protected User user;
	
	@BeforeClass
	public void setUp(){
		System.out.println("before class order0");
		driver = DriverFactory.getDriver();
		//user = ConfigReader.getUserFactory().getUser();
		
		while ((user = ConfigReader.getUserFactory().getUser()) == null){
			try {
				Thread.sleep(6000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		driver.get(DriverFactory.getUrl());
		//assert.equals(driver.getTitle().equals(""));

		LoginPage loginPage  = new LoginPage(driver);
		loginPage.login(user.getUser(), user.getPassword());
		
	}
	
	@AfterClass
	public void setDown(){
		driver.close();
		ConfigReader.getUserFactory().AddUser(user);
	
	} 
	 @AfterMethod
	 public synchronized void afterMethod(ITestResult result) {
		 
	 }

	
}
