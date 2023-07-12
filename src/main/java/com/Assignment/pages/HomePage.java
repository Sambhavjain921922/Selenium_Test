package com.Assignment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	}
	
	@FindBy(how=How.CLASS_NAME,using="a-icon a-icon-next-rounded")
	public WebElement carousel;
	
	public void carouselbutton()
	{
		carousel.click();
	}
	@FindBy(how=How.XPATH,using="//span[@class='icp-nav-link-inner']//span[@class='nav-line-2']")
public WebElement Language;
	
	public void SelectLanguage()
	{
		Language.click();
	}

	@FindBy(how=How.XPATH,using="//span[@id='glow-ingress-line1']")
	public WebElement Address;
		
		public void AddressButton()
		{
			Address.click();
		}
		@FindBy(how=How.XPATH,using="//span[normalize-space()='& Orders']  ")
		public WebElement Returns;
			public void ReturnButton()
			{
				Returns.click();
			}
			@FindBy(how=How.XPATH,using="//a[contains(text(),'Mobiles')]")
			public WebElement SelectMobiles;
			@FindBy(how=How.XPATH,using="//span[@class='a-size-base a-color-base'][normalize-space()='New']")
			public WebElement ItemCondition;
			
				public void Mobiles()
				{
					SelectMobiles.click();
				}
				public void ItemCondition ()
				{
					ItemCondition.click();
				}
				@FindBy(how=How.XPATH,using="//span[@class='nav-cart-icon nav-sprite']")
				public WebElement Cart;
				public void AddToCart()
				{
					Cart.click();
				}
}
