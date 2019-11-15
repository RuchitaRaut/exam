package skeleton;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {WebDriver driver;
@Given("user open home page")
public void user_open_application_TestMeApp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\A06438DIRNP6_trng\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://localhost:8083/TestMeApp");
	 
	 driver.manage().window().maximize();


}

@When("user clicks on Signin button")
public void user_clicks_on_Signin_button() {
	driver.findElement(By.linkText("SignUp")).click();
}
@Then("user validates signIn")
public void user_validates_signIn() {
  Assert.assertTrue(driver.getTitle().contains("Sign Up"));	
  }


@When("user enter username")
public void user_enter_username() {
    driver.findElement(By.name("userName")).sendKeys("Ruchita45");
}

@When("user enter Firstname")
public void user_enter_Firstname() {
    driver.findElement(By.name("firstName")).sendKeys("ruchita");
}

@When("user enter lastname")
public void user_enter_lastname() {
	  driver.findElement(By.name("lastName")).sendKeys("raut");
}

@When("user enter Password")
public void user_enter_Password() {
	 driver.findElement(By.name("password")).sendKeys("ruchita25");
}

@When("user enter Confirm password")
public void user_enter_Confirm_password() {
	 driver.findElement(By.name("confirmPassword")).sendKeys("ruchita25");
}

@When("user click on gender")
public void user_click_on_gender() {
	driver.findElement(By.xpath("//input[@value='Female']")).click();
   
}

@When("user enter email")
public void user_enter_email() {
	 driver.findElement(By.name("emailAddress")).sendKeys("rucharaut@gmail.com");
}

@When("user enter mobileno")
public void user_enter_mobileno() {
	driver.findElement(By.name("mobileNumber")).sendKeys("9975310020");
}

@When("user enter DOB")
public void user_enter_DOB() {
	driver.findElement(By.name("dob")).sendKeys("25/02/1997");
   
}

@When("user enter Address")
public void user_enter_Address() {
	driver.findElement(By.name("address")).sendKeys("kausar baug,kondhwa");
}

@When("user selects security question")
public void user_selects_security_question() {
	driver.findElement(By.xpath("//option[@value='411010']"));
}

@When("user types answer for security question")
public void user_types_answer_for_security_question() {
   driver.findElement(By.name("answer")).sendKeys("Dahanu");
}

@When("user click on Register button")
public void user_click_on_Register_button() {
	driver.findElement(By.name("Submit")).click();
}

@Then("user Registration success")
public void user_Registration_success() {
  Assert.assertTrue(driver.getTitle().contains("Login"));
  //driver.close();
}

   
}
