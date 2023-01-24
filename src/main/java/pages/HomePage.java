package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import static common.CommonActions.*;
public class HomePage {
	
	WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className = "header-button")
	WebElement JoinButton; 
	@FindBy (xpath  = "//input[@name='personalInformationForm.firstName']")
	WebElement Firstname;
	@FindBy(css = "img[alt='American Airlines']")
	WebElement logo;
	@FindBy (how = How.CSS , using = "#aa-search-field")
	WebElement searchbox;
	
	
	public void clickJoinButton() {
		JoinButton.click();
			
	}
	
	public void clickAndInputFirstName() {
		
		JoinButton.click();
		Firstname.sendKeys("Jhon");
		
	}
	
	public void Validate_Logo() {
		System.out.println("Logo verified" + logo);
	}
	
	public void search_field() {
		inputText(searchbox, "flight");
		driver.findElement(By.cssSelector(".icon.icon-18.icon-search")).click();
	}
	
}
