/*package leadsteps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.RemoteWebDriver;




public class createlead {
	
	public static RemoteWebDriver driver;
	
	@Given("Open the Browser")
	public void openbrowswer(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	
	@And("Maximize the Browser")
	public void maximizebrowser(){
		driver.manage().window().maximize();	
	}
	
	@And("Set the Timeouts")
	public void timeouts(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	@And("Enter the url")
	public void enterurl(){
		driver.get("http://leaftaps.com/opentaps/control/main");	
	}
	
	@And("Enter the Username")
	public void enterusername(){
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");	
	}
	
	@And("Enter the Password")
	public void enterpassword(){
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	
	@When("Click on the login Button")
	public void clickonlogin(){
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Click on CRM/SFA")
	public void clickoncrm(){
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}
	@When("Click on Create Lead")
	public void clickoncreatelead(){
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	}
	@When("Enter Company name")
	public void entercname(){
		driver.findElement(By.className("inputBox")).sendKeys("Capgemini");
	}
	@When("Enter Firstname")
	public void enterfname(){
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mohamed");
	}
	
	@When("Enter lastname")
	public void enterlname(){
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ismail");
	}	
		
	
	@Then("Click on Createlead")
	public void submitcreatelead(){
		driver.findElement(By.name("submitButton")).click();
	}
	
	
	

}*/