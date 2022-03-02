package StepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefinitionsforEmail {

	
	
	public WebDriver driver=null;
	 

	
	  @After public void tearDown(Scenario scenario) { 
			/*
			 * if (scenario.isFailed()) {
			 * 
			 * final byte[] screenshot = ((TakesScreenshot)
			 * driver).getScreenshotAs(OutputType.BYTES); scenario.embed(screenshot,
			 * "image/png"); }
			 */
	  driver.quit(); 
	  }
	 
	
	
	@Given("^Open the browser \"([^\"]*)\"$")
	public void open_the_browser(String browser) throws Throwable {

		
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
		 driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("Mozila"))
		{
			System.setProperty("webdriver.gecko.driver","C://Users//Serghei.Matura//Driver//driver_mozila/geckodriver.exe");
			 driver=new FirefoxDriver();
		}else{
			System.out.println("Nu exista asa brouser");
			}
		
		driver.manage().window().maximize();  
	}

	@When("^Enter the URL \"([^\"]*)\"$")
	public void enter_the_URL(String url) throws Throwable {
		driver.get(url);  
	}

	@And("^Find ‘Get your questions answered! ’ and click$")
	public void find_Get_your_questions_answered_and_click() throws Throwable {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit .SECONDS);
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(By.tagName("strong")));
				//driver.findElement(By.tagName("strong")).click();
				
				WebElement ele = driver.findElement(By.tagName("strong"));
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("arguments[0].scrollIntoView();", ele);
				jse.executeScript("arguments[0].click()", ele);
			    

		
	}

	@And("^Enter name and questions$")
	public void enter_name_and_questions() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit .SECONDS);
		driver.findElement(By.cssSelector("textarea[name='your-message']")).sendKeys("How are you?");
	    driver.findElement(By.cssSelector("input[name='your-name']")).sendKeys("Serj");
	   
	}

	@And("^Enter (\\d+) invalid email \"([^\"]*)\"$")
	public void enter_invalid_email(int arg1, String email) throws Throwable {
		driver.findElement(By.cssSelector("input[name='your-email']")).sendKeys(email);
		
				
	}

	@And("^Click send button$")
	public void click_send_button() throws Throwable {
		 WebElement sent = driver.findElement(By.cssSelector("input[type='submit']"));
		    JavascriptExecutor jse = (JavascriptExecutor)driver;
		    jse.executeScript("arguments[0].click()", sent);
	}

	@Then("^User see an message error$")
	public void user_see_an_message_error() throws Throwable {
					
		WebElement email = driver.findElement(By.cssSelector("span[role='alert']"));
        //System.out.println("Aveti eroarea: "+ email.getText());
        //String Actualmessege = email.getText();
		
        String Expectedmessege = "The e-mail address entered is invalid.";
        Assert.assertTrue(Expectedmessege, email.getText().contains("The e-mail address entered is invalid."));
        
        
		  
	}
	    
	
}
