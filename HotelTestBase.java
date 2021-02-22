package makemytrip;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class HotelTestBase
{
	    public  Logger logger=Logger.getLogger("HotelTestBase");

		public WebDriver driver;
		@Parameters({"browser","url"})
		
		@BeforeMethod
		public void setUp(String browser,String url) throws AWTException, InterruptedException
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
				PropertyConfigurator.configure("log4j.properties");
				   System.setProperty("webdriver.chrome.driver","C:\\Users\\NAKKA\\Desktop\\seleniumJars\\chromedriver.exe");
				   driver=new ChromeDriver();
			}
			
			else if(browser.equalsIgnoreCase("firefox"))
			{
					System.setProperty("webdriver.gecko.driver","C:\\Users\\NAKKA\\Desktop\\seleniumJars\\geckodriver.exe");
					driver=new FirefoxDriver();
			}
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					driver.get(url);
					System.out.println("Browser launched");
					Robot robot=new Robot();
					Dimension i=driver.manage().window().getSize();
				
					
					int x=(i.getWidth()/4)+20;
					int y=(i.getHeight()/10)+50;
					robot.mouseMove(x, y);
					robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(2000);
					robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
					Thread.sleep(2000);
					robot.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(2000);
					
				
					
					
		}
		
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
			System.out.println("Browser Terminated");
		}

}



