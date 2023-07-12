package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	 public LoginPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	  this.driver = driver;
	 }
		
	 @FindBy (how= How.XPATH , using="//span[@id='nav-link-accountList-nav-line-1']")
	 public WebElement LinkToSignIn;
		
	 @FindBy(how= How.NAME, using="email")
	 public WebElement UserNameField;
		
	 @FindBy(how=How.ID , using="continue")
	 public WebElement ContinueButton;
		
	 @FindBy(how = How.ID , using="ap_password")
	 public WebElement PasswordField;
		
	 @FindBy(how= How.ID , using="signInSubmit")
	 public WebElement Submit;
		
	 public void signIn() {
		 LinkToSignIn.click();
	 }
		
		
	 public void enterEmail(String user) {
		 UserNameField.sendKeys(user);
	 }
		
	 public void clickContinue() {
		 ContinueButton.click();
	 }
		
	 public void password(String pass) {
		 PasswordField.sendKeys(pass);
	 }
		
	 public void entersubmit() {
		 Submit.click();
	 }
	 @FindBy(how=How.CLASS_NAME,using="a-expander-prompt")
		public WebElement NeedHelp;
	 public void HelpButton()
		{
		 NeedHelp.click();
		}
	 @FindBy(how=How.XPATH,using="//a[@id='createAccountSubmit']")
		public WebElement CreateAccount;
	 public void NewAccount()
		{
		 CreateAccount.click();
		}
	 @FindBy(how=How.XPATH,using="//a[@class='a-link-normal'][normalize-space()='Privacy Notice']")
		public WebElement privacyNotice;
	 public void Notice()
		{
		 privacyNotice.click();
		}
	 @FindBy(how=How.XPATH,using="//a[@class='a-link-normal'][normalize-space()='Conditions of Use']")
		public WebElement Condition;
	 public void ConditionUse()
		{
		 Condition.click();
		}
}
