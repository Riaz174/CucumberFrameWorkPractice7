package Capstone.CucumberFrameWorkPractice7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProtraingPage7 {
	public WebDriver driver;
	@FindBy(linkText = "Contact") WebElement contact;
	@FindBy(xpath = "//*[contains(text(),'Join us !')]") WebElement joinusText;
	@FindBy(id = "form-field-name") WebElement firstnameField;
	@FindBy(id = "form-field-field_6c5f814") WebElement lnameField;
	@FindBy(id = "form-field-email") WebElement emailField;
	
	@FindBy(id = "form-field-field_694d8a5") WebElement phoneField;
	@FindBy(xpath = "//*[contains(text(),'REGISTER')]") WebElement registerbutton;
	@FindBy(xpath = "//div[@class='elementor-message elementor-message-success']") WebElement confirmation;
	public  ProtraingPage7(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void contactClick() {
		contact.click();
	}
	public WebElement joinusClick(){
		return joinusText;
		
	}
	public void fname(String name) {
		firstnameField.sendKeys("John");
	}
	public void lname(String name) {
		lnameField.sendKeys("Doe");
	}
	public void email(String name) {
		emailField.sendKeys("john@gmail.com");
	}
	
	public void phone(String name) {
		phoneField.sendKeys("2406660000");
	}
	public void register() {
		registerbutton.click();
	}
	public WebElement confirmationM() {
		return confirmation;
		
	}

}
