package com.StepDefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.Helper.FileReaderManager;
import com.Helper.PageObjectManager;
import com.Runner.TestRunner;

import PomClass.BookAHotel;
import PomClass.LogOut;
import PomClass.LoginPage;
import PomClass.SearchHotel;
import PomClass.SelectHotel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = TestRunner.driver;

	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getUrl();
		urlLink(url);
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		input(pom.getInstanceLogin().getUserName(), "PPriya1195");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		input(pom.getInstanceLogin().getPassword(), "Qwerty123#");
	}

	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		elementClick(pom.getInstanceLogin().getLoginBtn());
	}

	@When("^user Select The Location From Drop Down$")
	public void user_Select_The_Location_From_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceHotel().getLocation(), "selectByValue", "Paris");
	}

	@When("^user Select The Hotels From Drop Down$")
	public void user_Select_The_Hotels_From_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceHotel().getHotels(), "selectByValue", "Hotel Sunshine");
	}

	@When("^user Select The Room Type From Drop Down$")
	public void user_Select_The_Room_Type_From_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceHotel().getRoomType(), "selectByValue", "Super Deluxe");
	}

	@When("^user Select The Number Of Rooms From Drop Down$")
	public void user_Select_The_Number_Of_Rooms_From_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceHotel().getNoOfRooms(), "selectByValue", "1");
	}

	@When("^user Enter The Check In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		input(pom.getInstanceHotel().getCheckInDate(), "12/05/2021");
	}

	@When("^user Enter The Check Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		input(pom.getInstanceHotel().getCheckOutDate(), "15/05/2021");
	}

	@When("^user Select The Adults Per Room From Drop Down$")
	public void user_Select_The_Adults_Per_Room_From_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceHotel().getAdultsPerRoom(), "selectByValue", "2");
	}

	@When("^user Select The Children Per Romm From Drop Down$")
	public void user_Select_The_Children_Per_Romm_From_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceHotel().getChildrenPerRoom(), "selectByValue", "2");
	}

	@Then("^user Click On The Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		elementClick(pom.getInstanceHotel().getSearch());
	}

	@When("^user Select The Available Hotels Using Radio Button$")
	public void user_Select_The_Available_Hotels_Using_Radio_Button() throws Throwable {
		elementClick(pom.getInstanceSelect().getRadioButton());
	}

	@Then("^user Click On The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		elementClick(pom.getInstanceSelect().getContinueButton());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
		input(pom.getInstanceBook().getFirstName(), "Priyanka");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
		input(pom.getInstanceBook().getLastName(), "Panneer Selvam");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
		input(pom.getInstanceBook().getBillingAddress(), "Natesan Nagar, Virugambakkam, Chennai - 600092");
	}

	@When("^user Enter The Credit Card No In Credit Card Number Field Which Should Only Be (\\d+) Digits$")
	public void user_Enter_The_Credit_Card_No_In_Credit_Card_Number_Field_Which_Should_Only_Be_Digits(int arg1)
			throws Throwable {
		input(pom.getInstanceBook().getCreditCardNo(), "1234567812345678");
	}

	@When("^user Select The Credit Card Type From The Drop Down$")
	public void user_Select_The_Credit_Card_Type_From_The_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceBook().getCreditCardType(), "selectByValue", "VISA");
	}

	@When("^user Select The Expiry Date Month and Year From The Drop Down$")
	public void user_Select_The_Expiry_Date_Month_and_Year_From_The_Drop_Down() throws Throwable {
		dropDown(pom.getInstanceBook().getExpiryDateMonth(), "selectByValue", "10");
		dropDown(pom.getInstanceBook().getExpiryDateYear(), "selectByValue", "2022");
	}

	@When("^user Enter The CVV Number In The CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
		String cvv = FileReaderManager.getInstanceFileReaderManager().getInstanceCR().getCVV();
		input(pom.getInstanceBook().getCvvNo(), cvv);
	}

	@Then("^user Click On The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		elementClick(pom.getInstanceBook().getBookNowButton());
	}

	@Then("^user Click On The MyItinerary Button And It Navigates To Booked Itinerary Page$")
	public void user_Click_On_The_MyItinerary_Button_And_It_Navigates_To_Booked_Itinerary_Page() throws Throwable {
		elementClick(pom.getInstanceLogout().getMyItinerary());
	}

	@Then("^user Click On The Logout Button And It LogsOut Of The Application$")
	public void user_Click_On_The_Logout_Button_And_It_LogsOut_Of_The_Application() throws Throwable {
		elementClick(pom.getInstanceLogout().getLogOut());
	}
}
