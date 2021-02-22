package makemytrip;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelPages {

	
	public WebDriver driver;
	public  HotelPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	
    @FindBy(xpath="/html/body/div[1]/div/div[1]/div[1]/div[2]/div/div/nav/ul/li[2]")
	@CacheLookup
	WebElement  HotelIcon;
	public void SetHotelIcon() 
	{
		 HotelIcon.click();
	}
	
	
	
	@FindBy(id="city")
	@CacheLookup
	WebElement ClickCityInputField;
	
	public void setClickCityInputField() 
	{
		if(driver.getCurrentUrl().contains("hotels"))
		{
			ClickCityInputField.click();
		}
	}
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/div[1]/div/div/div/input")
	@CacheLookup
	WebElement enterCityInputField;
	@FindAll(@FindBy(xpath="//ul[@class='react-autosuggest__suggestions-list']/child::li"))
	List<WebElement> allsuggestions;
	
	public void setCityInputField(String input) throws InterruptedException 
	{	if(driver.getCurrentUrl().contains("hotels"))
		{
			enterCityInputField.sendKeys(input);
			Thread.sleep(5000);		
	    }
	}
	
	
	
	@FindBy(xpath="//*[@id=\"checkin\"]")
	@CacheLookup
	WebElement checkinClick;
	
	public void setCheckinClick() 
	{
		checkinClick.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[2]")
	@CacheLookup
	WebElement  SelectCheckin;
	
	public void SetCheckin() 
	{
		SelectCheckin.click();
	}
	
	//*[@id="root"]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[5]
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div[4]")
	@CacheLookup
	WebElement  SelectCheckout;
	
	public void SetCheckout() 
	{
		SelectCheckout.click();
	}
	
	
	@FindBy(xpath="//*[@id=\"guest\"]")
	@CacheLookup
	WebElement RoomClick;
	
	public void setroomClick() 
	{
		RoomClick.click();
	}

	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[1]/li[2]")
	@CacheLookup
	WebElement adultsClick;
	
	public void setadultsClick() 
	{
		adultsClick.click();
	}
	
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[3]")
	@CacheLookup
	WebElement childClickIcon;
	
	public void setchild2Click() 
	{
		childClickIcon.click();
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[1]/div/div[2]/div/ul[2]/li[1]")
	@CacheLookup
	WebElement childClick;
	
	public void setchildClick() 
	{
		childClick.click();
	}
	@FindBy(xpath="//*[@id=\"0\"]")
	@CacheLookup
	WebElement child1AgeSelectClick;
	
	public void setchild1AgeSelectClick() 
	{
		child1AgeSelectClick.click();
	}
	
	@FindBy(xpath="//*[@id=\"1\"]")
	@CacheLookup
	WebElement child2AgeSelectClick;
	
	public void setchild2AgeSelectClick() 
	{
		child2AgeSelectClick.click();
	}
	//*[@id="0"]/option[3]
	
	@FindBy(xpath="//*[@id=\"0\"]/option[3]")
	@CacheLookup
	WebElement child1AgeClick;
	
	public void setchild1AgeClick() 
	{
		child1AgeClick.click();
	}
	@FindBy(xpath="//*[@id=\"1\"]/option[5]")
	@CacheLookup
	WebElement child2AgeClick;
	
	public void setchild2AgeClick() 
	{
		child2AgeClick.click();
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[4]/div[1]/div[2]/button[2]")
	@CacheLookup
	WebElement ClickApplyBtn;
	
	public void setClickApplyBtn() 
	{
		ClickApplyBtn.click();
	}
	
	
	@FindBy(id="hsw_search_button")
	@CacheLookup
	WebElement searchClick;
	
	public void setsearchClick() 
	{
		searchClick.click();
	}

	
	@FindBy(xpath="//*[@id=\"hlistpg_search_htl_name_box\"]/div/input")
	@CacheLookup
	WebElement SearchHotelInputField;
	
	public void setSearchHotelInputField(String input) throws InterruptedException 
	{
		if(driver.getCurrentUrl().contains("hotel-listing"))
		{
			SearchHotelInputField.sendKeys(input);
			SearchHotelInputField.sendKeys(Keys.ARROW_DOWN);
			SearchHotelInputField.sendKeys(Keys.ENTER);
			
		}
		
	 }
	
	
	//@FindBy(xpath="//*[@id=\"htl_id_seo_201008301834588226\"]")
	@FindBy(xpath="//*[@id=\"Listing_hotel_0\"]")
	@CacheLookup
	WebElement selectHotelClick;
		
	public void setselectHotelClick() 
	{
			selectHotelClick.click();
	}
	@FindBy(xpath="//*[@id=\"990000045946\"]/div[2]/div[2]/a")
	@CacheLookup
	WebElement SelectRoomBtn;
		
	public void setSelectRoomBtn() 
	{
		if(SelectRoomBtn.isDisplayed())
		{
		SelectRoomBtn.click();
		}
		
			
	}
	

	
	//*[@id="detpg_room_includes_options"]/li[1]/span/span
	@FindBy(id="detpg_room_includes_options")
	@CacheLookup
	WebElement payAtHotelClick;
		
	public void setpayAtHotelClick() 
	{
		if(driver.getCurrentUrl().contains("hotel-details"))
		{
		 payAtHotelClick.click();
		}
	}
	//*[@id="root"]/div/div[3]/div[1]/div/div[2]/div[2]/div/div/div[3]/div[1]/div/p/span
	//@FindBy(id="detpg_headerright_book_now")
	@FindBy(id="detpg_headerright_book_now")
	@CacheLookup
	WebElement bookThisNowBtn;
		
	public void setBookThisNowBtn() 
	{
		if(driver.getCurrentUrl().contains("hotel-details")) {
			
					bookThisNowBtn.click();	
		}						
	
			
	}
	
}