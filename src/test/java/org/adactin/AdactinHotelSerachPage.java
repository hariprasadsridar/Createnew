package org.adactin;

import org.maintest.MasterBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinHotelSerachPage extends MasterBase {

	public AdactinHotelSerachPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="location")
	private WebElement droplocation;
	@FindBy(id="hotels")
	private WebElement dropHotels;
	@FindBy(id="room_type")
	private WebElement dropRoomType;
	@FindBy(id="room_nos")
	private WebElement dropRooms;
	@FindBy(id="datepick_in")
	private WebElement txtCheckIn;
	@FindBy(id="datepick_out")
	private WebElement txtCheckout;
}
