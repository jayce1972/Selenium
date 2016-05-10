package account_setup;

import java.util.concurrent.TimeUnit; 

import org.apache.james.mime4j.field.datetime.DateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.Variable;
 
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Account_SetUp {

	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","/Users/jason/Documents/Automated/chromedriver");
		//WebDriver driver = new ChromeDriver();
    	WebDriver driver = new FirefoxDriver();
		
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get(Variable.URL);
        
        //driver.findElement(By.xpath("//*[contains(text(), 'Account')]")).click();
        
        //driver.findElement(By.xpath("//*[contains(text(), 'My Account')]")).click();
        
        //driver.findElement(By.xpath("//*[contains(text(), 'Login or Create an Account')]"));
        
        
        WebElement myaccount = driver.findElement(By.id("top-links-my-account-link"));
        myaccount.click();
             
        WebElement createaccount = driver.findElement(By.xpath("//button[@class='button' and contains(@onclick,'window.location')]"));
        createaccount.click();
       
      
        //Click on the 'Create an Account' button using the Span
        
        //driver.findElement(By.xpath("//span[contains(.,'Create an Account')]")).click();

        //driver.get("http://ec2-54-171-145-8.eu-west-1.compute.amazonaws.com/customer/account/create/");
       
        WebElement firstname = driver.findElement(By.name("firstname"));

         firstname.sendKeys("Test1");
         
        WebElement lastname = driver.findElement(By.name("lastname"));

         lastname.sendKeys("User1");
         
        WebElement email = driver.findElement(By.name("email"));

         email.sendKeys(Variable.Email1);
         
        WebElement password = driver.findElement(By.name("password"));

         password.sendKeys(Variable.Password1);
         
        WebElement confirmpassword = driver.findElement(By.name("confirmation"));
        
         confirmpassword.sendKeys(Variable.Password1);
         
        //click on the checkbox with id 'is_subscribed'
         //driver.findElement(By.id("is_subscribed")).click();
         
         //Click on the 'register' button by Span name
         
         driver.findElement(By.xpath("//span[contains(.,'Submit')]")).click();
         
         driver.findElement(By.xpath("//*[contains(text(), 'My Dashboard')]"));
         
         driver.findElement(By.xpath("//*[contains(text(), 'Hello, Test1 User1!')]")); 
         
         driver.findElement(By.xpath("//*[contains(text(), 'Address book')]")).click();
                
         
         WebElement address1 = driver.findElement(By.id("street_1"));
	        address1.sendKeys("11 Test Street");
	        
	        WebElement address2 = driver.findElement(By.id("street_2"));
	        address2.sendKeys("Townville");
	        
	        WebElement city = driver.findElement(By.id("city"));
	        city.sendKeys("Test City");
	        
	        WebElement state = driver.findElement(By.id("region"));
	        state.sendKeys("Test Region");
	        
	        WebElement postcode = driver.findElement(By.id("zip"));
	        postcode.sendKeys("12345");
	        
	        //select the fourth option in a dropdown with id billing:country_id
	        //Select country = new Select(driver.findElement(By.id("country")));
	        //country.selectByIndex(4);
	        
	        driver.findElement(By.xpath("//span[contains(.,'Save address')]")).click();   	    
         
         driver.quit();
	}

}
