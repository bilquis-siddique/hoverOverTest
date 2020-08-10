package stepDefs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginSteps {
	
	WebDriver driver;

	@Given("User Launch Firefox Browser")
	public void user_Launch_Firefox_Browser() {
		
		//System.setProperty("webdriver.gecko.driver", "//geckodriver");

		driver= new FirefoxDriver();
		driver.get("https://login.wordpress.org/?locale=en_US");
		driver.manage().window().maximize();	    
	}
	@When("User Enters username as {string} and pwd as {string}")
	public void user_Enters_username_as_and_pwd_as(String username, String pwd) {
	    WebElement userEdit = driver.findElement(By.xpath("//input[@id='user_login']"));
	    WebElement pwdEdit = driver.findElement(By.xpath("//input[@id='user_pass']"));
	    userEdit.clear();
	    userEdit.sendKeys(username);
	    pwdEdit.clear();
	    pwdEdit.sendKeys(pwd);
	}
	@Then("User Clicks on Submit Button")
	public void user_Clicks_on_Submit_Button() throws InterruptedException {
	    WebElement btnSubmit = driver.findElement(By.xpath("//input[@id='wp-submit']"));
	    btnSubmit.click();
	    Thread.sleep(3000);
	}
	@Then("Page Title Should be {string}")
	public void page_Title_Should_be(String expectedTitle) {
	    String actualTitle = driver.getTitle();
	    
	    if(actualTitle.equalsIgnoreCase(expectedTitle)){
	    	System.out.println("Titlle Matched");
	    }else{
	    	System.out.println("Titlle Didn't Matched");
	    }
	}

	@Then("User Hover over Support and Print All Its Items")
	public void user_Hover_over_Support_and_Print_All_Its_Items() {
		WebElement drpDown = driver.findElement(By.xpath("//a[@href='//wordpress.org/support/']"));
		Actions action = new Actions(driver);
		action.moveToElement(drpDown).perform();
	    
		List<WebElement> listItems = driver.findElements(By.xpath("//ul[@class='nav-submenu']//a"));
	    int submenuCount = listItems.size();
	    System.out.println("Submenu count is " + submenuCount);
	    
	    for (int i=0; i < submenuCount; i++){
	    	WebElement ele = listItems.get(i);
	    	//String value = ele.getAttribute("innerHTML");
	    	String linkName = ele.getText();
	    	System.out.println("Link's name is " + linkName);
	    	if (linkName.equalsIgnoreCase("Forums")){
	    		ele.click();
	    		break;
	    	}
	    }
	}

	@Then("User Close Browser")
	public void user_Close_Browser() {
	    driver.quit();
	}
}
