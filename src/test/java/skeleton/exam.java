package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class exam {
	WebDriver driver;
@Given("user is on home page")
public void user_is_on_home_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\A06438DIRNP6_trng\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8083/TestMeApp");
}
@When("user enter username and password and click on login button")
public void user_enter_username_and_password_and_click_on_login_button(){
	driver.findElement(By.linkText("SignIn")).click();
	driver.findElement(By.name("userName")).sendKeys("Ruchita45");
	driver.findElement(By.name("password")).sendKeys("ruchita25");
	driver.findElement(By.name("Login")).click();
	
}
@Then("user  should be logged in and verified")
public void user_should_be_logged_in_and_verified() {
	Assert.assertTrue(driver.getTitle().contains("Home"));
	
}
@Given("navigate to headphone")
public void navigate_to_headphone() {
	driver.findElement(By.linkText("All Categories")).click();
	driver.findElement(By.linkText("Electronics")).click();
	driver.findElement(By.linkText("Head Phone")).click();
	//driver.findElement(By.xpath("//button[@type='submit']")).click();
}
@And("add to shopping cart")
public void add_to_shopping_cart() {
	driver.findElement(By.xpath("//input[@placeholder='Search here...']")).sendKeys("head");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.linkText("Add to cart")).click();
	
}
@When("proceed to checkout")
public void proceed_to_checkout() {
	driver.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
	driver.findElement(By.xpath("//a[@href='checkout.htm']")).click();
}
@And("select bank add credentials")
public void select_bank_add_credentials() {
	driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
	driver.findElement(By.xpath("//input[@value='HDFC Bank']")).click();
}
@Then("redirected to thankyou")
public void redirected_to_thankyou() {

	
}

}
