package makemytrip;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Script  extends HotelTestBase {

	HotelPages  HotelOR;

	@Test(priority=1,dataProvider="getDataProvider")
	public void HotelBooking(String city) throws InterruptedException
	{ 
		HotelOR=new HotelPages(driver);

		HotelOR.SetHotelIcon();
		Reporter.log("user clicks Hotel Icon ", true);
		logger.info("user clicks Hotel Icon");
		HotelOR.setClickCityInputField();
		Thread.sleep(3000);
		HotelOR.setCityInputField(city);
		Thread.sleep(3000);
		System.out.println("user enters city name");
		int suggestions=HotelOR.allsuggestions.size();
		
		if(suggestions==1) 
		{
			Reporter.log("Enter a Valid City Name", true);
			logger.error("Enter a Valid City Name");
			logger.error("can't find your destination");
			
			
			
		}
		else {
		HotelOR.enterCityInputField.sendKeys(Keys.ARROW_DOWN);
		HotelOR.enterCityInputField.sendKeys(Keys.ENTER);
		logger.info("city name is entered");
		
		HotelOR.setCheckinClick();
		Thread.sleep(1000);
		HotelOR.SetCheckin();
		Thread.sleep(1000);
		Reporter.log(" user selects checkin date", true);
		logger.info(" user selects checkin date");
		HotelOR.SetCheckout();
		Thread.sleep(2000);
		Reporter.log(" user selects checkout date", true);
		logger.info(" user selects checkout date");
		HotelOR.setroomClick();
		HotelOR.setadultsClick();
		HotelOR.setchildClick();
		HotelOR.setClickApplyBtn();
		Reporter.log("user selects room", true);
		logger.info("\"user selects room");
		HotelOR.setsearchClick();
		Reporter.log("user clicks search button", true);
		logger.info("user clicks search button");

		HotelOR.setSearchHotelInputField("Lemon Tree");
		Reporter.log(" user entered hotel name ", true);
		logger.info("user entered hotel name");
		Thread.sleep(4000);
		HotelOR.setselectHotelClick();
		logger.info("Hotel is selected by user");
		Thread.sleep(2000);
		Reporter.log("user Entered into Hotel Details Page", true);
		logger.info("user Entered into Hotel Details Page");
		Thread.sleep(3000);
		}



	}
	@DataProvider
	public Object[][] getDataProvider()
	{
		Object [][]data=new Object[2][1];
		data[0][0]="Hyderabad";
		data[1][0]="Hzhzhzhz";
		return data;		
	}
}

