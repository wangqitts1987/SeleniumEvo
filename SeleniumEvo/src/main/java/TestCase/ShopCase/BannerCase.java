package TestCase.ShopCase;

import org.testng.annotations.Test;

import Page.Order.ShopBannerPage;
import TestCase.BaseCase;

public class BannerCase extends BaseCase{

	@Test
	public void TestCase(){
		ShopBannerPage page = new ShopBannerPage(driver);
		page.CreateBanner("test");
	}
	 
	
	
}
