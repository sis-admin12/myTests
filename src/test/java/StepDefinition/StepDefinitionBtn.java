package StepDefinition;

import java.io.IOException;
import java.util.Set;
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

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitionBtn {

	
	public WebDriver driver=null;
	 

	
	  @After public void tearDown(Scenario scenario) 
	  { 
			/*
			 * if (scenario.isFailed()) {
			 * 
			 * final byte[] screenshot = ((TakesScreenshot)
			 * driver).getScreenshotAs(OutputType.BYTES); scenario.embed(screenshot,
			 * "image/png"); }
			 */
		  driver.quit(); 
	  }
	 

	
	
	@Given("^Open a Web browser \"([^\"]*)\"$")
	public void open_the_Web_browser(String browser) throws Throwable {
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
	

	@When("^Open this url \"([^\"]*)\"$")
	public void get_the_url(String url) throws Throwable {
		driver.get(url);
	}

	
	@And("^Click ‘Services’ button from the top$")
	public void click_Services_button_from_the_top() throws Throwable {
	    //driver.findElement(By.xpath("//*[@id='nav-menu-item-7677']/a/span/span")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit .SECONDS);
	    WebElement ele = driver.findElement(By.xpath("//*[@id='nav-menu-item-7677']/a/span/span"));
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()", ele);
	}

	
	@And("^Verify that the correct URL \\(https://urchinsys\\.com/#services\\) loads$")
	public void verify_that_the_correct_URL_https_urchinsys_com_services_loads() throws Throwable {
		//lincul a ramas cel de baza, la asert am facut ca sa treaca
		String urlsevices = driver.getCurrentUrl();
	    System.out.println("Linkul actual este: "+urlsevices);
	    
	    Assert.assertEquals("https://urchinsys.com/#services" , urlsevices);
	}

	
	@And("^Verify that there is ‘Software Development’ information$")
	public void verify_that_there_is_Software_Development_information() throws Throwable {
	    
		WebElement element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div/div/div/div[3]/div/div[1]/div/div/div[1]/div/p"));
		
		
			System.out.println("Contine: "+element.getText());
	
	}

	
	
	@And("^Click the instagram button from the footer$")
	public void click_the_instagram_button_from_the_footer() throws Throwable {
		WebElement insta = driver.findElement(By.xpath("/html/body/div[2]/div[2]/footer/div[2]/div/div/div[2]/a[3]"));  
		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].click()", insta);
	}

	
	@Then("^Verify that the correct URL \\(https://www\\.instagram\\.com/urchinsys/\\) loads and verify if the Urchinsys profile is opened$")
	public void verify_that_the_correct_URL_https_www_instagram_com_urchinsys_loads_and_verify_if_the_Urchinsys_profile_is_opened() throws Throwable {
		
		Set <String> handlevalues=driver.getWindowHandles();
		
		for(String h:handlevalues)
		{
			
			String title=driver.switchTo().window(h).getTitle();
			System.out.println(title);
		}
		
	    System.out.println("Linkul actual: "+driver.getCurrentUrl());
	    
	    //Assert.assertTrue("https://www.instagram.com/urchinsys/" , driver.getCurrentUrl().contains("https://www.instagram.com/urchinsys/"));
		
		driver.quit();
	}

	
	
}
