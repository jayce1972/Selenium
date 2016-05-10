package guest_e2e_checkout;


import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Variable;
 
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Guest_e2e_checkout {

		private static WebDriver driver = null;

		public static void main(String[] args) throws Exception
		{
		
			// TODO Auto-generated method stub
			
			//System.setProperty("webdriver.chrome.driver","/Users/jason/Documents/Automated/chromedriver");
			//WebDriver driver = new ChromeDriver();
	    	WebDriver driver = new FirefoxDriver();
					
			 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        
	        //Given I access the website
	        driver.get(Variable.URL);
	        
	        //When I click on the flowers option
	        WebElement Flower = driver.findElement(By.id("nav-1"));
	        Flower.click();
	        
	        //When I click on Flower Plans drop down option
	        WebElement FlowerPlants = driver.findElement(By.xpath("//*[@id='nav-1-1']/a"));
	        FlowerPlants.click();
	        
	      //When I click on First Image
	        WebElement FirstImage = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[2]/div[2]/ul/li[1]/a/img"));
	        FirstImage.click();
	        
		    //Click on Add basket button
	        WebElement addtocart = driver.findElement(By.xpath("//button[@class='button btn-cart' and contains(@onclick,'productAddToCartForm.submit(this)')]"));
	        addtocart.click();  
	        
	        //'This is a required field'validation message is displayed'
	        //driver.findElement(By.xpath("//*[contains(text(), 'This is a required field.')]"));
	       
	        
	      //When I select an option from the Pack Size
	        //Select packsize = new Select(driver.findElement(By.id("attribute749")));
	        //packsize.selectByIndex(1);
	        
	        
	      //Click on Add basket button
	        //WebElement addtocart0 = driver.findElement(By.xpath("//button[@class='button btn-cart validation-passed' and contains(@onclick,'productAddToCartForm.submit(this)')]"));
	       // addtocart0.click();
	        
	      //Enter Test 20% Voucher Code
	       // WebElement vouchercode = driver.findElement(By.name("coupon_code"));
	        //vouchercode.sendKeys("TEST10OFF");  
	        	        
	      //Click on the Apply button
	        WebElement apply = driver.findElement(By.xpath("//button[@class='button' and contains(@onclick,'discountForm.submit')]"));
	        apply.click();
	        
	       //Voucher code applied message
	       //driver.findElement(By.xpath("//*[contains(text(), 'was applied.')]"));
	        
	      //Click on proceed to checkout button 
	        WebElement proceed = driver.findElement(By.xpath("//button[@class='button btn-proceed-checkout btn-checkout' and contains(@onclick,'window.location')]"));
	        proceed.click();
	        
	      //Check text By processing, you agree to the Guardian's Terms of Service & Privacy Policy.
	        driver.findElement(By.xpath("//*[contains(text(), 'By proceeding, you agree to the')]")); 
	        
	        WebElement continuecheckout = driver.findElement(By.xpath("//*[@id='onepage-guest-register-button']"));
	        continuecheckout.click();
	        
	      //Enter an email address
	        WebElement Email = driver.findElement(By.name("billing[email]"));
	        Email.sendKeys(Variable.Email2);
	       
	      //Enter a first name
	        WebElement billingfirstname = driver.findElement(By.name("billing[firstname]"));
	        billingfirstname.sendKeys("Test");
	        
	      //Enter a last name  
	        WebElement billinglastname = driver.findElement(By.name("billing[lastname]"));
            billinglastname.sendKeys("User2");
            
          //select the first option in a dropdown with id shipping:country_id
	        Select billingcountry = new Select(driver.findElement(By.id("billing:country_id")));
	        billingcountry.selectByIndex(1);
	        
	      //Enter postcode  
	        WebElement billingpostcode = driver.findElement(By.name("billing[postcode]"));
	        billingpostcode.sendKeys("12345");
	       
	      //Enter Address   
	        WebElement billingaddress1 = driver.findElement(By.name("billing[street][]"));
	        billingaddress1.sendKeys("10 Test Street");
	        
	        WebElement billingcity = driver.findElement(By.name("billing[city]"));
	        billingcity.sendKeys("Test City");
	        
	        WebElement billingtelephone = driver.findElement(By.name("billing[telephone]"));
	        billingtelephone.sendKeys("09876543210");
	        
	      //Click on the Continue button  
	        WebElement billingsave = driver.findElement(By.xpath("//button[@class='button' and contains(@onclick,'billing.save()')]"));
	        billingsave.click();
	        
	      //Your deliver address and Your delivery options are displayed  
	        driver.findElement(By.xpath("//*[contains(text(), 'Your delivery address')]"));
	

		  //Click on Continue button
	        WebElement shippingsave = driver.findElement(By.xpath("//button[@class='button' and contains(@onclick,'shippingMethod.save()')]"));
	        shippingsave.click();
	        
	        
	        //Click on the card radio button
	        WebElement ccradiobutton = driver.findElement(By.id("p_method_gnm_stripe_cc"));
	        ccradiobutton.click();
	          
	      Thread.sleep(3000);	
	        
	      //Enter Credit Card Number
	        WebElement creditcardnumber1 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber1.sendKeys("4");
	        
	        WebElement creditcardnumber2 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber2.sendKeys("0");
	        
	        WebElement creditcardnumber3 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber3.sendKeys("1");
	        
	        WebElement creditcardnumber4 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber4.sendKeys("2");
	        
	        WebElement creditcardnumber5 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber5.sendKeys(Keys.SPACE);
	        
	        WebElement creditcardnumber6 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber6.sendKeys("8");
	        
	        WebElement creditcardnumber7 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber7.sendKeys("8");
	        
	        WebElement creditcardnumber8 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber8.sendKeys("8");
	        
	        WebElement creditcardnumber9 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber9.sendKeys("8");
	        
	        WebElement creditcardnumber10 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber10.sendKeys(Keys.SPACE);
	        
	        WebElement creditcardnumber11 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber11.sendKeys("8");
	        
	        WebElement creditcardnumber12 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber12.sendKeys("8");
	        
	        WebElement creditcardnumber13 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber13.sendKeys("8");
	        
	        WebElement creditcardnumber14 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber14.sendKeys("8");
	        
	        WebElement creditcardnumber15 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber15.sendKeys(Keys.SPACE);
	        
	        WebElement creditcardnumber16 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber16.sendKeys("1");
	        
	        WebElement creditcardnumber17 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber17.sendKeys("8");
	        
	        WebElement creditcardnumber18 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber18.sendKeys("8");
	        
	        WebElement creditcardnumber19 = driver.findElement(By.xpath("//*[@class='number input-text']"));
	        creditcardnumber19.sendKeys("1");
	                
	      Thread.sleep(3000);	  
	        
	      //Expiration Date
	       // Select month = new Select(driver.findElement(By.xpath("//*[@class='month required-entry']")));
	       // month.selectByIndex(1);
	        
	    
	        Select year = new Select(driver.findElement(By.xpath("//*[@class='year required-entry']")));
	        year.selectByIndex(8);
	        
	      Thread.sleep(3000);	
	         
	        
	     //Enter Card Verification Number
	        WebElement creditcardcvc21 = driver.findElement(By.xpath("//*[@class='input-text cvv']"));
	        creditcardcvc21.sendKeys("1"); 
	        
	        WebElement creditcardcvc22 = driver.findElement(By.xpath("//*[@class='input-text cvv']"));
	        creditcardcvc22.sendKeys("2"); 
	        
	        WebElement creditcardcvc23 = driver.findElement(By.xpath("//*[@class='input-text cvv']"));
	        creditcardcvc23.sendKeys("3"); 
	        
        
		      Thread.sleep(3000);			      
		      
		        
		        WebElement submitpayment1 = driver.findElement(By.id("stripe_submit_new"));
		        submitpayment1.click();
		        
		      Thread.sleep(5000);
		      
		      WebElement submitpayment = driver.findElement(By.id("stripe_submit_new"));
		       submitpayment.click();
		        
	        
	      Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//*[contains(text(), 'Thank you for shopping at the Guardian Shop')]"));
	        
	      //Enter a password
	        WebElement password = driver.findElement(By.name("password"));
	        password.sendKeys(Variable.Password2);
	        
	      //Enter a confirmation password
	        WebElement passwordconfirmation = driver.findElement(By.name("password_confirmation"));
	        passwordconfirmation.sendKeys(Variable.Password2);
	        
	        WebElement Register = driver.findElement(By.id("register-account-button"));
	        Register.click();
	        
	        driver.findElement(By.xpath("//*[contains(text(), 'account has been created')]"));
	        
	        //log into myaccount
	        driver.findElement(By.xpath("//*[contains(text(), 'My Dashboard')]"));
	        
	        
	        driver.findElement(By.xpath("//*[contains(text(), 'Address book')]")).click();
	        
	        //driver.findElement(By.xpath("//*[contains(text(), '10 Test Street')]"));
	    
	        driver.quit();
	}

}

