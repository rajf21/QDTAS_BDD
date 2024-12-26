package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class login {
	
	
	public static WebDriver driver;
	
	
	@Given("user is on login page")
	public void user_is_on_login_page()
	{
	    System.out.println("user in on login page");
	    WebDriverManager.chromedriver().setup();      // webdrivermanager predefined class
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://qdtas-hrm-front-end.vercel.app/");
		}

	@When("user enters UserName and Password")
	public void user_enters_user_name_and_password() throws InterruptedException {
		
		System.out.println("user enters admin@gmail.com and 123@Admin");
		driver.findElement(By.id("email")).sendKeys("admin@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("123@Admin");
		Thread.sleep(1000);
	}
	    

	@And("click on Submit button")
	public void click_on_submit_button() throws InterruptedException {
		System.out.println("click on submit button");
	    driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[3]/form/button"));
	    Thread.sleep(1000);
	}

	@Then("user is navigate to the UserPage")
	public void user_is_navigate_to_the_user_page() {
		System.out.println("user is navigate to the userpage");
		WebElement UserPage=driver.findElement(By.linkText("account_circle"));
    	
        if(UserPage.isDisplayed())
        {
        	System.out.println("Test Case is passed");            // THIS IS NORMAL CODE  TO CALL PAGE
        }
        else
        {
        	System.out.println("Test case is failed");
        }
	}




}
