package makemytrip;




import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class HotelScript extends HotelTestBase {
	

	   HotelPages HotelOR;
	 /*  @Test(priority=0)
		public void aletr()
		{
		   if(driver.switchTo().alert()!=null)
		   {
			   Alert alert=driver.switchTo().alert();
			   alert.dismiss();
		   }
		}*/
		@Test(priority=1)
		public void clickHotelIcon()
		{ 
		  HotelOR=new HotelPages(driver);
	  	  HotelOR.SetHotelIcon();
	  	
	  	  Reporter.log("Hotel Icon Selected", true);
	  
		}
		
		
		@Test(priority=2 ,dataProvider="getDataProvider")
		public void setCityInputField(String city,String test)throws InterruptedException
		{
	
		if(test.equalsIgnoreCase("Postive"))
		{
		HotelOR=new HotelPages(driver);
		HotelOR.setClickCityInputField();
		Thread.sleep(3000);
		HotelOR.enterCityInputField.sendKeys(city);
		HotelOR.enterCityInputField.sendKeys(Keys.ARROW_DOWN);
		HotelOR.enterCityInputField.sendKeys(Keys.ENTER);
	  	System.out.println("City Input Entered");
	  	
		}
		else
		{
			HotelOR=new HotelPages(driver);
			HotelOR.setClickCityInputField();
			Thread.sleep(3000);
			HotelOR.enterCityInputField.sendKeys(city);
			Reporter.log("Enter a Valid City Name", true);
			driver.close();
		}
		
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
			Reporter.log("Add room Selected", true);
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
			HotelOR.setSearchHotelInputField("Lemon Tree");
			Reporter.log("Hotel name Entered", true);
			Thread.sleep(4000);
			HotelOR.setselectHotelClick();	
			Reporter.log("Entered to hotel-details Page", true);
			Thread.sleep(4000);
		
		}
		@DataProvider
		public Object[][] getDataProvider()
		{
			//Object [][] data={{"one plus 8t"},{"Da vinci Code"}};
			Object [][]data=new Object[2][2];
			data[0][0]="Hyderabad";
			data[0][1]="Postive";
			data[1][0]="Hzhzhzhz";
			data[1][1]="Negative";
			return data;		
		}
		
		
		/*@Test(priority=8)
		public void selectRoomBtn() throws InterruptedException
		{
			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			//driver.navigate().forward();
			//driver.navigate().to("https://www.makemytrip.com/hotels/hotel-details/?hotelId=201008301834588226&mtkeys=defaultMtkey&_uCurrency=INR&checkin=02082021&checkout=02102021&city=CTHYDERA&country=IN&lat=17.44318&lng=78.37658&locusId=CTHYDERA&locusType=city&rank=1&roomStayQualifier=2e0e&searchText=Hyderabad%2C%20Telangana%2C%20India&topHtlId=201008301834588226&visitorId=17fa8db9-a770-4617-b30c-d8ecad886996");
			 HotelOR=new HotelPages(driver);
			System.out.println(driver.getCurrentUrl());
		
			HotelOR.setBookThisNowBtn();
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
		
			Reporter.log("Select Room Button Clicked", true);
		}*/
		
 		
		
	}



