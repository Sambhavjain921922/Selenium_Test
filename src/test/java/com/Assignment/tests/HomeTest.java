package com.Assignment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Assignment.pages.HomePage;
import com.relevantcodes.extentreports.LogStatus;

public class HomeTest extends BaseTest {
	@Test(priority=1, groups= {"sanity", "valid"})
public void CarouselButton()
{
		extentTest=extent.startTest(" CarouselButton Test Case");
HomePage button=new HomePage(driver);
	button.carouselbutton();
	Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
	extentTest.log(LogStatus.PASS,"Carousel Button Test Case is Passed");
	extent.endTest(extentTest);
}
	@Test(priority=2, groups= {"sanity", "valid"})
public void SelectLanguage()
{
		extentTest=extent.startTest(" Select Language Test Case");
	HomePage language=new HomePage(driver);	
	language.SelectLanguage();
	Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
	extentTest.log(LogStatus.PASS,"Select Language Test Case is Passed");
	extent.endTest(extentTest);
}
	@Test(priority=3, groups= {"sanity", "valid"})
public void AddressButtons()
{
		extentTest=extent.startTest(" Address Buttons Test Case");
	HomePage address=new HomePage(driver);	
	address.AddressButton();
	Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
	extentTest.log(LogStatus.PASS,"Address Buttons Test Case is Passed");
	extent.endTest(extentTest);
}
	@Test(priority=4, groups= {"sanity", "valid"})
public void ReturnsButtons()
{
		extentTest=extent.startTest(" Giftcard Buttons Test Case");
	HomePage returns=new HomePage(driver);	
	returns.ReturnButton();
	Assert.assertEquals(driver.getTitle(),"Gift Card & Vouchers Online :Buy Gift Vouchers & E Gift Cards Online");
	extentTest.log(LogStatus.PASS,"Giftcard Test Case is Passed");
	extent.endTest(extentTest);
}
	@Test(priority=5, groups= {"sanity", "valid"})
public void MobliesButtons()
{
		extentTest=extent.startTest(" Moblies Buttons Test Case");
	HomePage mobile=new HomePage(driver);	
	mobile.Mobiles();
	mobile.ItemCondition();
	Assert.assertEquals(driver.getTitle(),"Mobile Phones: Buy New Mobiles Online At Best Prices in India");
	extentTest.log(LogStatus.PASS,"Moblies Test Case is Passed");
	extent.endTest(extentTest);

}
	@Test(priority=6, groups= {"sanity", "valid"})
public void CartButtons()
{
		extentTest=extent.startTest(" AdButtons Test Case");
	HomePage ad=new HomePage(driver);	
	ad.AddToCart();
	//Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
	extentTest.log(LogStatus.PASS,"AdButtons Test Case is Passed");
	extent.endTest(extentTest);


}

}
