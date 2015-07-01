package com.brain.ccsb;

import com.brain.ccsb.StepDefinationB;

import java.util.Base64;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;





//import jxl.Cell;
//import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationO {

	StepDefinationB sdb = new StepDefinationB();
	rwexcel rw = new rwexcel();
	public static String CCGI;
	public String x = sdb.xyz;
	WebDriver driver;
	// OlrLogin feature code
	
			@Given("^Login page of OLR$")
			public void loginolr() throws Throwable {
				 driver = new FirefoxDriver(); 
				 String olrurl1 = System.getProperty("olrurl");
				 System.out.println("*****Value of OLR url: " + olrurl1);
				 driver.get(olrurl1);
				// driver.navigate().to("http://d-olradmin.cengage.com/olr/admin/index.jsp");
				 driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
				 driver.switchTo().frame("bottom");
			}

			@When("^Enter credentials as below$")
			public void usernamepassword(DataTable otable) throws Throwable {
			    List<List<String>> odata = otable.raw();
			    driver.findElement(By.name(odata.get(1).get(0))).sendKeys(odata.get(1).get(1));
			    
			 // Encryption of string:
				//String encodedBytes = Base64.getEncoder().encodeToString("Cengage1".getBytes());
				//System.out.print(encodedBytes);
				
				 // Decryption of string
			    
				    String encryptedPassword = odata.get(2).get(1);
				 	byte[] decryptedPasswordBytes = Base64.getDecoder().decode(encryptedPassword);
					String decryptedPassword = new String(decryptedPasswordBytes);
			        // System.out.print(decryptedPassword);
					driver.findElement(By.name(odata.get(2).get(0))).sendKeys(decryptedPassword);
			
                // driver.findElement(By.name(odata.get(2).get(0))).sendKeys(odata.get(2).get(1));
				Thread.sleep(1000);
			}

			@When("^Click on log-in button$")
			public void ologinbutton() throws Throwable {
				driver.findElement(By.name("B1")).click();
			}

			@Then("^User is logged in successfully$")
			public void User_is_logged_in_successfully() throws Throwable {
			}

			@Then("^Navigate to Course frame$")
			public void ocurseclick() throws Throwable {
				driver.switchTo().defaultContent();		
				driver.switchTo().frame("bottom");
				driver.switchTo().frame("Left");
				driver.findElement(By.linkText("Course")).click();
			}

			@Then("^Enter the Course key$")
			public void entercoursekey() throws Throwable {
			    
				driver.switchTo().defaultContent();
				driver.switchTo().frame("bottom");
				driver.switchTo().frame("Main");
			//	String y = sdb.coursekeycapture();
		   //   System.out.println("Course key under OLR " +y);
				// public String x = sdb.xyz;
				System.out.println("Course key under OLR " +x);
				driver.findElement(By.name("courseKey")).sendKeys(x);
			}

			@Then("^Grep the CGI$")
			public String grepcgi() throws Throwable {
			   
				    int count = 1;
				    String CourseCGI = null;
				    while(CourseCGI == null || CourseCGI.length() < 1){
					driver.findElement(By.cssSelector("input.button_style2")).click();
					CourseCGI = driver.findElement(By.name("cgi")).getAttribute("value");
					System.out.println("Inside method Course CGI:" + CourseCGI);
					Thread.sleep(5000);
					System.out.println("Course CGI: " + count + CourseCGI);
					count++;
					System.out.println("In Course CGI: " + CourseCGI);
				}
				
				System.out.println("Final Course CGI: " + CourseCGI);
				CCGI = CourseCGI;
				return CourseCGI;
			}
			
			@Then("^Write the CGI in Excel$")
			public void wexcel() throws BiffException, IOException, WriteException {
			
		      Workbook workbook1 = Workbook.getWorkbook(new File("/Users/ikumar/test.xls"));
		      WritableWorkbook wworkbook = Workbook.createWorkbook(new File("/Users/ikumar/test.xls"),workbook1);
		      WritableSheet wsheet = wworkbook.getSheet(0); 
		      Label label = new Label(0, 1, x);
		      wsheet.addCell(label);
		      Label label1 = new Label(0, 2, CCGI);
		      wsheet.addCell(label1);
		      wworkbook.write();
		      wworkbook.close();
			
		      
		      Workbook workbook2 = Workbook.getWorkbook(new File("/Users/ikumar/SOAPUI/CengageSOA/Data/SoapUI_INT_e2e_4LTR_MTKG9_Variant.xls"));
		      WritableWorkbook wworkbook2 = Workbook.createWorkbook(new File("/Users/ikumar/SOAPUI/CengageSOA/Data/SoapUI_INT_e2e_4LTR_MTKG9_Variant.xls"),workbook2);
		      WritableSheet wsheet2 = wworkbook2.getSheet(0); 
		      Label label2 = new Label(2, 2, CCGI);
		      wsheet2.addCell(label2);
		      wworkbook2.write();
		      wworkbook2.close();
		      
			}
			@Then("^Logout from the screen.$")
			public void Logout_from_the_screen() throws Throwable {
			  
				driver.close();
			}
			
}
