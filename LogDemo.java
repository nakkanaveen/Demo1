package makemytrip;


import org.apache.log4j.PropertyConfigurator;

public class LogDemo {

	public static void main(String[] args) {
		
		//Logger logger=Logger.getLogger("LogDemo");
		PropertyConfigurator.configure("log4j.properties");
		

	}

}
