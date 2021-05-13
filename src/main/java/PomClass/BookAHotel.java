package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotel {
	public WebDriver driver;
	
	@FindBy(name="first_name")
	private WebElement firstName;
	
	@FindBy(name="last_name")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement billingAddress;
	
	@FindBy(name="cc_num")
	private WebElement creditCardNo;
	
	@FindBy(name="cc_type")
	private WebElement creditCardType;
	
	@FindBy(name="cc_exp_month")
	private WebElement expiryDateMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement expiryDateYear;
	
	@FindBy(name="cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(name="book_now")
	private WebElement bookNowButton;


	public BookAHotel(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getBillingAddress() {
		return billingAddress;
	}


	public WebElement getCreditCardNo() {
		return creditCardNo;
	}


	public WebElement getCreditCardType() {
		return creditCardType;
	}


	public WebElement getExpiryDateMonth() {
		return expiryDateMonth;
	}


	public WebElement getExpiryDateYear() {
		return expiryDateYear;
	}


	public WebElement getCvvNo() {
		return cvvNo;
	}


	public WebElement getBookNowButton() {
		return bookNowButton;
	}
}
