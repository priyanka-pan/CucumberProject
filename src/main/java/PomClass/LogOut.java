package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	
	public static WebDriver driver;
	
	@FindBy(name="my_itinerary")
	private WebElement myItinerary;
	
	@FindBy(name="logout")
	private WebElement logOut;

	public LogOut(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getLogOut() {
		return logOut;
	}
}
