package com.Assignment.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.Assignment.pages.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends BaseTest {
	
	@Test(priority=1, groups= {"sanity", "valid"})
	@Parameters({"Invalid","password"})
	public void InvalidLogin(String user,String pass) {
		extentTest=extent.startTest("Invalid Login Test Case");
		LoginPage login = new LoginPage(driver);
		login.signIn();
		login.enterEmail(user);
		login.clickContinue();
		login.password(pass);
		login.entersubmit();
		Assert.assertEquals(driver.getTitle(),"Amazon Sign In");
		extentTest.log(LogStatus.PASS,"Invalid Test Case is Passed");
		extent.endTest(extentTest);
	}
	@Test(priority=1, groups= {"sanity", "valid"})
	public void HelpsButtons()
	{
		extentTest=extent.startTest("Helps Test Case");
		LoginPage help=new LoginPage(driver);	
		help.HelpButton();
		Assert.assertEquals(driver.getTitle(),"Amazon.In.Help:Help");
		extentTest.log(LogStatus.PASS,"Helps Test Case is Passed");
		extent.endTest(extentTest);
	}
	@Test(priority=2, groups= {"sanity", "valid"})
	public void createAccount()
	{
		extentTest=extent.startTest("CreateAccount Test Case");
		LoginPage Accountcreate=new LoginPage(driver);	
		Accountcreate.NewAccount();
		Assert.assertEquals(driver.getTitle(),"Amazon Registration");
		extentTest.log(LogStatus.PASS,"Create Account Test Case is Passed");
		extent.endTest(extentTest);

	}
	@Test(priority=3, groups= {"sanity", "valid"})
	public void NoticePrivacy()
	{
		extentTest=extent.startTest("NoticePrivacy Test Case");
		LoginPage notice=new LoginPage(driver);	
		notice.Notice();
		Assert.assertEquals(driver.getTitle(),"Amazon.In Help:Amazon.in PrivacyNotice");
		extentTest.log(LogStatus.PASS,"Notice Privacy Test Case is Passed");
		extent.endTest(extentTest);

	}
	@Test(priority=4, groups= {"sanity", "valid"})
	public void Conditionsofuse()
	{
		extentTest=extent.startTest("condition of use Test Case");
		LoginPage Conditions=new LoginPage(driver);	
		Conditions.ConditionUse();
		Assert.assertEquals(driver.getTitle(),"Amazon.In Help:Condition Of Use");
		extentTest.log(LogStatus.PASS,"Condition of Use Test Case is Passed");
		extent.endTest(extentTest);
	}

}
