package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Scripts {
	WebDriver d1;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhilash reddy\\Desktop\\HCL\\chromedriver.exe");
		
		d1=new ChromeDriver();
		Thread.sleep(5000);
		d1.get("https://phptravels.org/register.php");
		
		System.out.println("Given done");
	}

@When("Enter Username , password and click on login button")
public void enter_Username_password_and_click_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  d1.findElement(By.id("inputFirstName")).sendKeys("Abhilash");
	  d1.findElement(By.id("inputLastName")).sendKeys("Chennuri");
	  d1.findElement(By.id("inputEmail")).sendKeys("Chennuriabhilashreddy123212346@gmail.com");
	  d1.findElement(By.xpath("//div[@class='selected-dial-code']")).click();
	  d1.findElement(By.xpath("//*[@id='containerNewUserSignup']/div[1]/div[2]/div/div[4]/div/div/div/ul/li[102]")).click();
	   d1.findElement(By.xpath("//*[@placeholder='81234 56789']")).sendKeys("8977741492");;
	   d1.findElement(By.id("inputCompanyName")).sendKeys("HCL");
	  d1.findElement(By.id("inputAddress1")).sendKeys("2-91/2");
	  d1.findElement(By.id("inputAddress2")).sendKeys("Nizamabad");
	  d1.findElement(By.id("inputCity")).sendKeys("Hyderabad");
	  d1.findElement(By.id("stateinput")).sendKeys("Telangana");
	  d1.findElement(By.id("inputPostcode")).sendKeys("503186");
	 	d1.findElement(By.id("inputCountry")).sendKeys("India");
	// d1.findElement(By.id("customfield2")).sendKeys("8977741492");
	  d1.findElement(By.id("inputNewPassword1")).sendKeys("Abhi@1234");
	  d1.findElement(By.id("inputNewPassword2")).sendKeys("Abhi@1234");
	  Thread.sleep(15000);
	d1.findElement(	By.xpath("//*[@id='frmCheckout']/div[5]/input")).click();
	  d1.findElement(By.partialLinkText("Logout")).click();
 d1.findElement(By.id("inputEmail")).sendKeys("Chennuriabhilashreddy123212346@gmail.com");
	  d1.findElement(By.id("inputPassword")).sendKeys("Abhi@1234");
	  Thread.sleep(15000);
	     d1.findElement(By.id("login")).click();
	   
	
		System.out.println("When done");
	}

@Then("Login Successful")
public void login_Successful() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Then done");
	}
}