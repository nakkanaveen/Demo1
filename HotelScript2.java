package makemytrip;

import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HotelScript2 extends HotelTestBase {


	HotelPages  HotelOR;
	private static Logger logger=Logger.getLogger("Script");



	@Test(priority=1,dataProvider="getDataProvider")
	public void HotelBooking(String city,String test,String HotelName) throws InterruptedException
	{ 
		HotelOR=new HotelPages(driver);
		HotelOR.SetHotelIcon();
		Reporter.log("Hotel Icon Clickeded", true);
		logger.info("Hotel Icon Clicked");
		HotelOR.setClickCityInputField();
		Thread.sleep(3000);
		HotelOR.setCityInputField(city);
		System.out.println("City Input Entered");
		logger.info("City Input Entered");


		HotelOR.setCheckinClick();
		Thread.sleep(1000);
		HotelOR.SetCheckin();
		Thread.sleep(1000);
		Reporter.log("checkin Selected", true);
		logger.info("checkin Selected");
		HotelOR.SetCheckout();
		Thread.sleep(2000);
		Reporter.log("checkout Selected", true);
		logger.info("checkout Selected");
		HotelOR.setroomClick();
		HotelOR.setadultsClick();
		HotelOR.setchild2Click();
		HotelOR.setchild1AgeSelectClick();
		HotelOR.setchild2AgeSelectClick();
		HotelOR.setchild1AgeClick();
		HotelOR.setchild2AgeClick();
		HotelOR.setClickApplyBtn();
		Reporter.log("Add room Selected", true);
		logger.info("Add room Selected");
		HotelOR.setsearchClick();
		Reporter.log("search Btn Clicked", true);
		logger.info("search Btn Clicked");
		if(test.equalsIgnoreCase("Negative"))
		{
			HotelOR.setSearchHotelInputField(HotelName);
			Reporter.log("Enter a valid Hotel Name", true);
			logger.info("Enter a valid Hotel Name ");
			driver.close();
		}

		else if(test.equalsIgnoreCase("Positive"))
		{
			HotelOR.setSearchHotelInputField(HotelName);
			Reporter.log("Hotel name Entered", true);
			logger.info("Hotel name Entered");
			Thread.sleep(4000);
			HotelOR.setselectHotelClick();
			logger.info("Hotel selected");
			Thread.sleep(2000);
			Reporter.log("Entered to Hotel Details Page", true);
			logger.info("Entered to Hotel Details Page");
			Thread.sleep(3000);

		}



	}
			@DataProvider
			public Object[][] getDataProvider()
			{
				Object [][]data=new Object[2][3];
				data[0][0]="Hyderabad";
				data[0][1]="Postive";
				data[0][2]="Lemon Tree";
				data[1][0]="Hyderabad";
				data[1][1]="Negative";
				data[1][2]="Hzhzhzhzzh";
				return data;		
			}
}

