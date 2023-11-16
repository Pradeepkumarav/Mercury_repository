package MercurytoursTestscenerios;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import mercurytour_utilities.Readtestdata;
import mercurytours_pageobjects.Orange_hrm_addemployee;



public class Orange_hrm_TC4_addemployee extends baseclass {
	
	//baseclass base=new baseclass();
	          
	// WebDriver driver= base.driver;               
	 Orange_hrm_addemployee addemp=new Orange_hrm_addemployee(baseclass.driver);
	// ExtentTest test=base.test;
    // ExtentReports extent =base.extent;

	@Test
	public void Addemployee() throws Exception {
	
		try {
		       
		        
		     test = extent.createTest("Orange_hrm_TC4_addemployee");
			 test.info("user started addemployee");
			 System.setProperty("webdriver.chrome.driver","D:\\Java related project\\Hybridframework\\drivers\\chromedriver.exe" );
			 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
			 driver.manage().window().maximize();
			 addemp.addusername();
			 test.pass("added username successfully");
			 addemp.addpossword();
			 test.pass("added pass successfully");
			 addemp.clicksubmit();
			 addemp.clickPIM();
			 addemp.clickaddemployee();
			 addemp.enterfirstname();
			 test.pass("entered firstname successfully");
			 Thread.sleep(2000);
			 addemp.entermidlename();
			 Thread.sleep(2000);
			 addemp.enterlastname();
			 test.pass("entered lastname successfully");
			 Thread.sleep(2000);
			 addemp.enteremployeeid();
			 test.pass("entered enteremployeeid successfully");
			 Thread.sleep(2000);
			 addemp.clicksave();
			 Thread.sleep(2000);
			 addemp.clickemployeelist();
			 test.pass("enter enteremployeeid successfully");
			 Thread.sleep(2000);
			 addemp.validation();
			 test.pass("validation done successfully");
			
		}
		
		catch(Exception e)
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
	        File source = ts.getScreenshotAs(OutputType.FILE);
	        String dest = System.getProperty("user.dir") +"\\ErrorScreenshots\\Mecrcury_TC4_addemployee.png";
	        File destination = new File(dest);
	        FileUtils.copyFile(source, destination);
	      
	       
			test.log(Status.FAIL, e);
			 test.addScreenCaptureFromPath(dest);
			 Assert.assertTrue(false);
		}
		        
		
	        
			
		}
		
	}
	

