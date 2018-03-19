package TestCase.ShopCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.LoginPage;
import Page.Order.OrderPage;
import Page.Order.ProductPage;
import TestCase.BaseCase;
import Utils.User;
import Utils.ConfigReader;
import Utils.DriverFactory;

public class ProductCase extends BaseCase{

	@Test
	public void Test() throws InterruptedException{
		ProductPage productPage = new ProductPage(driver);
		productPage.Test();
	} 
}
