package makemytrip;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HotelNegScript {
	WebDriver driver;
	HotelPages HotelOR;
	@BeforeTest
	@Parameters({"browser","url"})
	public void setUp(String browser,String url)
	{
		if(browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\NAKKA\\Desktop\\seleniumJars\\chromedriver.exe");
		    driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\NAKKA\\Desktop\\seleniumJars\\geckodriver.exe");
		    driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Browser launched");
	
	}
	

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
		HotelOR.setClickCityInputField();
		HotelOR.setCityInputField("hhhhhhhhhhhhhhhh");
	  	Thread.sleep(3000);
	  	System.out.println("Invalid Input Entered");
		
		}
		
		  @AfterTest
		  public void terminateBrowser()
		  {	
			driver.close();
			System.out.println("Browser Terminated");
		  }


}
