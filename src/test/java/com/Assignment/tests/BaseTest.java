package com.Assignment.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Assignment.utils.Screenshot;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {
	static WebDriver driver;
	static File file=new File("./Resources/Config.properties");
	static FileInputStream fis=null;
	static Properties prop=new Properties();
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	static {
		
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	try {
		prop.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@BeforeSuite(groups= {"sanity","valid"})
	public void setExtent () {
	extent = new ExtentReports("./Reports/extentreport.html");
	}@AfterSuite(groups= {"sanity","valid"})
	public static void endReport() {
	extent.flush();
	extent.close();
	}

	@AfterMethod(groups= {"sanity","valid"})
	public void attachScreenshot(ITestResult res) {
	if(res.getStatus()==ITestResult.FAILURE) {
	String screenshotPath= Screenshot.takeScreenshot(driver , res.getName());
	extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
	extent.endTest(extentTest);
	}
	else if(res.getStatus()==ITestResult.SUCCESS){
	extentTest.log(LogStatus.PASS, "Test cases passed");
	extent.endTest(extentTest);
	}
	}
	@BeforeMethod(groups= {"sanity", "valid"})
		public static void initializeDriver() {
			String browserName= prop.getProperty("browser");
			String browserheadless=prop.getProperty("Browsers");
			 if(browserName.equalsIgnoreCase("edge")) {
			  System.setProperty(prop.getProperty("edgeDriverProperty"),prop.getProperty("edgeDriverPath") );
			  driver = new EdgeDriver();
			 }
				
			 else if(browserName.equalsIgnoreCase("firefox")) {
			  System.setProperty(prop.getProperty("geckoDriverProperty"),prop.getProperty("geckoDriverPath") );
			  driver = new FirefoxDriver();
			 }
				
			 else if(browserName.equalsIgnoreCase("chrome")) {
			  System.setProperty(prop.getProperty("chromeDriverProperty"),prop.getProperty("chromeDriverPath") );
			  if(browserheadless.equalsIgnoreCase("true")) {
				  ChromeOptions options = new ChromeOptions();
				  options.addArguments("--window-size=1400,800");
				  options.addArguments("--headless");
				  driver = new ChromeDriver(options);
				  System.out.println(prop.getProperty("chromeDriverProperty"));
				  }

				  else {
				  driver= new ChromeDriver();
				  }
			 }
	}
	@BeforeMethod(groups= {"sanity", "valid"})
		public static void openUrl()
		{
			driver.get(prop.getProperty("url"));
		}
		@AfterMethod(groups= {"sanity", "valid"})
		public static void close()
		{
			driver.close();
		}

}
