package makemytrip;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class HotelNegScript2 extends HotelTestBase {
	

	   HotelPages HotelOR;
		@Test(priority=1)
		public void clickHotelIcon()
		{ 
		  HotelOR=new HotelPages(driver);
	  	  HotelOR.SetHotelIcon();
	  	
	  	  Reporter.log("Hotel Icon Selected", true);
	  
		}
		
		
		@Test(priority=2)
		public void setCityInputField()throws InterruptedException
		{
		HotelOR=new HotelPages(driver);
		HotelOR.setClickCityInputField();
		Thread.sleep(3000);
		HotelOR.setCityInputField("Hyderabad");
	  	System.out.println("City Input Entered");
		
		}
	
		@Test(priority=3)
		public void selectCheckin() throws InterruptedException
		{
		 	HotelOR.setCheckinClick();
		 	Thread.sleep(1000);
		 	HotelOR.SetCheckin();
		 	Thread.sleep(1000);
		 	Reporter.log("checkin Selected", true);
		}
		
		
		@Test(priority=4)
		public void selectCheckout() throws InterruptedException
		{
			 HotelOR.SetCheckout();
			 Thread.sleep(2000);
			 Reporter.log("checkout Selected", true);
		}
		
		
		@Test(priority=5)
		public void selectRoom() throws InterruptedException{
			HotelOR.setroomClick();
		 	HotelOR.setadultsClick();
		 	HotelOR.setchildClick();
		 	HotelOR.setClickApplyBtn();
			Reporter.log(" Add room Selected", true);
		}
		
		
		@Test(priority=6)
		public void clickSearchBtn() throws InterruptedException
		{
			HotelOR.setsearchClick();
			Reporter.log("search Btn Selected", true);
		}
		
		
		@Test(priority=7)
		public void SearchHotel() throws InterruptedException
		{
			 HotelOR=new HotelPages(driver);
			HotelOR.setSearchHotelInputField("hhhhhh");
			Reporter.log("Enter a valid Hotel name", true);
		
		}

}
