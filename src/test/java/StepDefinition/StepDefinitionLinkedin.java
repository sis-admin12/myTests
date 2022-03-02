package StepDefinition;

import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
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
import org.openqa.selenium.TakesScreenshot;

public class StepDefinitionLinkedin {

	public WebDriver driver = null;

	
	
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
	 
	
	

	@Given("^Start the Web browser \"([^\"]*)\"$")
	public void start_the_Web_browser(String browser) throws Throwable {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C://Users//Serghei.Matura//Driver//driver_chrome//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Mozila")) {
			System.setProperty("webdriver.gecko.driver",
					"C://Users//Serghei.Matura//Driver//driver_mozila/geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("Nu exista asa brouser");
		}

		driver.manage().window().maximize();
	}

	@And("^Open url \"([^\"]*)\"$")
	public void open_url(String url) throws Throwable {
		driver.get(url);
	}

	@When("^Click ‘Linedin’ button from the top$")
	public void click_Linedin_button_from_the_top() throws Throwable {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div[2]/footer/div[2]/div/div/div[2]/a[2]/i"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", ele);

		Set<String> handlevalues = driver.getWindowHandles();

		for (String h : handlevalues) {

			String title = driver.switchTo().window(h).getTitle();
			System.out.println(title);
		}

		System.out.println("Sunt pe pagina: " + driver.getCurrentUrl());

	}

	@And("^Scroll down and press ‘Support Specialist’ button from the “Recently posted jobs” section$")
	public void scroll_down_and_press_Support_Specialist_button_from_the_Recently_posted_jobs_section()
			throws Throwable {
		WebElement search = driver.findElement(By.xpath("/html/body/header/nav/section/section[2]/form/button"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", search);
	}

	@And("^Verify that there is information about connection$")
	public void verify_that_there_is_information_about_connection() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.findElement(By.cssSelector("h1[class='results-context-header__context']")).getText());
	}

	@And("^Remember number of connections$")
	public void remember_number_of_connections() throws Throwable {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		String data = driver.findElement(By.cssSelector("h1[class='results-context-header__context']")).getText();
		try (Scanner s = new Scanner(data)) {
			while (s.hasNextInt()) {
				int num = s.nextInt();
				System.out.println("Numarul locurilor de munca este : " + num);
			}
		}

	}

	@Then("^Click and verify that the same number of connections are shown$")
	public void click_and_verify_that_the_same_number_of_connections_are_shown() throws Throwable {

		driver.findElement(By.xpath("/html/body/main/section[1]/section/div/div[2]/div[1]/div/a[1]")).click();

		List<WebElement> elements = driver.findElements(By.cssSelector("base-card__full-link"));
		System.out.println("Number of elements:" + elements.size());

		for (WebElement element : elements) {
			System.out.println("Paragraph text:" + element.getText());
		}
		
		
	}
	
	


}
