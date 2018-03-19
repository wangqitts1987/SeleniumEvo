package TestCase.ShopCase;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page.LoginPage;
import Page.Order.OrderPage;
import TestCase.BaseCase;
import Utils.User;
import Utils.ConfigReader;
import Utils.DriverFactory;

public class OrderCase extends BaseCase {
	

	@Test
	public void Test(){
		OrderPage orderPage = new OrderPage(driver);
		orderPage.CreateOrder();
	} 
	
}
