package com.brain.ccsb;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinationB {
	
	
	WebDriver driver;
	public static String xyz;
		@Given("^I am on Cengage Brain log-in screen$")
		public void loginpage() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			 driver = new FirefoxDriver();
				// driver.navigate().to("https://d-login.cengage.com/cb/login.htm");
				 String cburl1 = System.getProperty("cburl");
				 System.out.println("*****Value of CB url: " + cburl1);
				 driver.get(cburl1);
				Thread.sleep(2000);
			   
		}

		@When("^Enter valid credential$")
		public void logincredential(DataTable table) throws Throwable {
		
			List<List<String>> data = table.raw();
			System.out.println(data.get(1).get(1));
			driver.findElement(By.id(data.get(1).get(0))).sendKeys(data.get(1).get(1));
			
			// Encryption of string:
			//String encodedBytes = Base64.getEncoder().encodeToString("Cengage1".getBytes());
			//System.out.print(encodedBytes);
			
			// Decryption of string
			    String encryptedPassword = data.get(2).get(1);
			 	byte[] decryptedPasswordBytes = Base64.getDecoder().decode(encryptedPassword);
				String decryptedPassword = new String(decryptedPasswordBytes);
		    // System.out.print(decryptedPassword);
				driver.findElement(By.name(data.get(2).get(0))).sendKeys(decryptedPassword);
			
				 
			// driver.findElement(By.id(data.get(2).get(0))).sendKeys(data.get(2).get(1));
			Thread.sleep(1000);
		}

		@And("^Click on login button$")
		public void loginbutton() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

		}

		@Then("^User is logged in successfully \"([^\"]*)\"$")
		public void logintitle(String title) throws Throwable {
		    // Express the Regexp above with the code you wish you had
			Assert.assertTrue(driver.getTitle().contains(title));
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}

		/*@Given("^Logged in page is opened$")
		public void loggedinpage() throws Throwable {
		    // Express the Regexp above with the code you wish you had
		   
		}*/
		
		@Then("^Select the product from drop down$")
		public void productselection() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			  String product1 = System.getProperty("product");
			  System.out.println("*****Name of Product: " + product1);
			   Select dropdown = new Select(driver.findElement(By.name("productISBN")));
			   dropdown.selectByVisibleText(product1);
			   System.out.println("*****Name of Product: " + product1);
			   
			   // new Select(driver.findElement(By.id("productISBN"))).selectByVisibleText("product1");
			  // new Select(driver.findElement(By.id("productISBN"))).selectByVisibleText("Rathus, PSYCH4 (with Online Printed Access Card), 4th Edition");
			   Thread.sleep(1000);
		}
		
		@Then("^Click on Create Course link$")
		public void createcorusemaster() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			
			//driver.findElement(By.linkText("Create Course")).click();
			//driver.switchTo().defaultContent();
		//	driver.manage().window().maximize();
		//	driver.findElement(By.xpath(".//*[@href='createCourse.htm?unformattedISBN13=9781285860169&amp;iacISBN=9781305580268&amp;componentISBN=9781305580251&amp;type=4LT]"));
			driver.findElement(By.linkText("Create Course")).click();
			Thread.sleep(1000);
		}
		@Then("^Select the Radio button for create new course$")
		public void newcourse() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			 driver.findElement(By.id("createNewCourse")).click();
			 driver.findElement(By.linkText("Continue")).click();
		}

		@Then("^Enter all required details$")
		public void fillform(DataTable ftable) throws Throwable {
		    // Express the Regexp above with the code you wish you had
		    // For automatic conversion, change DataTable to List<YourType>
			
			// epoch used for unique name
			long epoch = System.currentTimeMillis()/1000;
			
			// Date format for begin date
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/YYYY");
			   //get current date time with Date()
			   Date date = new Date();
			   

			List<List<String>> data = ftable.raw();
			System.out.println(data.get(1).get(1));
			System.out.println(data.get(2).get(1));
			System.out.println(data.get(3).get(1));
			
			driver.findElement(By.id(data.get(1).get(0))).sendKeys(data.get(1).get(1) + epoch);
			Thread.sleep(1000);
			System.out.println(data.get(1).get(1) + epoch);
			
			driver.findElement(By.id(data.get(2).get(0))).clear();
			driver.findElement(By.id(data.get(2).get(0))).sendKeys(dateFormat.format(date));
			System.out.println(dateFormat.format(date));
			
			driver.findElement(By.id(data.get(3).get(0))).clear();
			driver.findElement(By.id(data.get(3).get(0))).sendKeys(data.get(3).get(1));
			Thread.sleep(1000);
		}

		@Then("^Click on Create Course$")
		public void Click_on_Create_Course() throws Throwable {
		    
			 driver.findElement(By.linkText("Create Course")).click();
		}

		@Then("^Course key is generated and captured$")
		public String coursekeycapture() throws Throwable {
			String CourseKeyLink = driver.findElement(By.xpath("//*[@id='courseConfirm']/div[2]/div[2]/p[2]/a[1]")).getText();		
			System.out.println("CourseKey Link generated : " + CourseKeyLink);
			int left = CourseKeyLink.indexOf("e/");
			String CourseKey1 = CourseKeyLink.substring(left);
			//String CourseKey = CourseKeyLink.substring(40);
			String CourseKey = CourseKey1.substring(2);
			System.out.println("Coursekey:   " + CourseKey);
		    
			xyz = CourseKey;
			System.out.println("Testing Course key " +xyz);
			return CourseKey;
			
			
		}

	@Then("^Logout from Cengage Brain$")
		public void brainlogout() throws Throwable {
			driver.findElement(By.linkText("Sign Out")).click();
	driver.close();	
	}
	
	
}