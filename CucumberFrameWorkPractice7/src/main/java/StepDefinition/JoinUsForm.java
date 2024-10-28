package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Capstone.CucumberFrameWorkPractice7.ProtraingPage7;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class JoinUsForm {
	public WebDriver driver;
	@Before
	public void setup() throws InterruptedException {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		String Path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", Path+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://protrainingtech.com/");
		driver.manage().window().maximize();
		Thread.sleep(6000);
	}
	@Given("^Already opened the website protrainingtech\\.com$")
	public void already_opened_the_website_protrainingtech_com() throws Throwable {
		String id = driver.getCurrentUrl();
		Assert.assertEquals(id, "https://protrainingtech.com/");
		Thread.sleep(6000);
	    }

	@When("^User clicks the link Contact$")
	public void user_clicks_the_link_Contact() throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		ob.contactClick();
		Thread.sleep(6000);
	    }

	@Then("^User able to see Join Us Form\\.$")
	public void user_able_to_see_Join_Us_Form() throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		WebElement joinusText = ob.joinusClick();
		String joinElement = joinusText.getText();
		Thread.sleep(6000);
	    }

	@When("^User enter the value of \"([^\"]*)\"$")
	public void user_enter_the_value_of(String arg1) throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		ob.fname(arg1);
		Thread.sleep(6000);
	    }

	@When("^User enters the value of \"([^\"]*)\"$")
	public void user_enters_the_value_of(String arg1) throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		ob.lname(arg1);
		Thread.sleep(6000);
	    }

	@When("^User enters the email \"([^\"]*)\"$")
	public void user_enters_the_email(String arg1) throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		ob.email(arg1);
		Thread.sleep(6000);
	    }

	@When("^User enters the phone \"([^\"]*)\"$")
	public void user_enters_the_phone(String arg1) throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		ob.phone(arg1);
		Thread.sleep(6000);
	    }

	@When("^User clicks the register button$")
	public void user_clicks_the_register_button() throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		ob.register();
		Thread.sleep(6000);
	    }

	@Then("^User able to see confirmation message$")
	public void user_able_to_see_confirmation_message() throws Throwable {
		ProtraingPage7 ob = new ProtraingPage7(driver);
		WebElement Confirm = ob.confirmationM();
		String tx =Confirm.getText();
		System.out.println(tx);
		Thread.sleep(6000);
	    }


}
