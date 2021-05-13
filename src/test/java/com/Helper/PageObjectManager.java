package com.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PomClass.BookAHotel;
import PomClass.LogOut;
import PomClass.LoginPage;
import PomClass.SearchHotel;
import PomClass.SelectHotel;

public class PageObjectManager {
	
	public WebDriver driver; //null
	
	private LoginPage login;
	
	private SearchHotel hotel;
	
	private SelectHotel select;
	
	private BookAHotel book;
	
	private LogOut logout;
	
	public PageObjectManager(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public LoginPage getInstanceLogin() {
		login = new LoginPage(driver);
		return login;
	}
	
	public SearchHotel getInstanceHotel() {
		hotel = new SearchHotel(driver);
		return hotel;
	}
	
	public SelectHotel getInstanceSelect() {
		select = new SelectHotel(driver);
		return select;
	}
	
	public BookAHotel getInstanceBook() {
		book = new BookAHotel(driver);
		return book;
	}
	
	public LogOut getInstanceLogout() {
		logout = new LogOut(driver);
		return logout;
	}
}
