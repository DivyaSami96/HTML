package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("^Launch RE site)$")
	public void Launch_RE_site() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\divyasami\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://reqa.rockinterview.in/");
		
	}
	@When("^Title is (.*)$")
	public void title_Rock_Enterprise(){
		String title=driver.getTitle();
		Assert.assertEquals("RIEnterprise", title);
	}

	@Then("^Validate Tour$")
	public void Validate_Tour() {
		
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-tour-modal/div/mat-card/div[2]/div/button[2]")).click();
	
		driver.findElement(By.xpath("//*[@id=\"main2\"]/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main2\"]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main2\"]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main2\"]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main2\"]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main2\"]/div[1]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"main2\"]/div/button")).click();
	}

	@Then("^download brochure$")
	public void download_brochure() {
		
		driver.findElement(By.xpath("//*[@id=\"mat-input-24\"]")).sendKeys("Divya");
		
		driver.findElement(By.xpath("//*[@id=\"mat-input-25\"]")).sendKeys("divya.s@rockinterview.in");
	
		driver.findElement(By.xpath("//*[@id=\"mat-dialog-1\"]/app-download-brochure/div/mat-card/form/div[2]/button")).click();
	}
	
	@Then("^Search Profiles$")
	public void Search_Profiles() {
		
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/div[2]/div[1]/div[2]/div/form/div[1]/div/div[1]/div[2]/ng-select/div/div/div[2]/input")).sendKeys("Testing");
	
	  
	  Select drpTech = new Select(driver.findElement(By.xpath("//*[@id=\"a1e629a5bebf-60\"]/span")));
	  
	
	}
	
}
