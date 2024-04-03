package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig read=new ReadConfig();//this will invoke the constructor and automatically load the file
	
	public String url=read.getApplication();//called the methods from readconfig file
	public String username=read.getusername();
	public String password=read.getpassword();
	public String title=read.gettitle();
	public static WebDriver driver;
	public static Logger logger;
	
	
	@BeforeClass
	@Parameters("browser")//the parameter passed in xml file
	public void setup(String browser) {
		
		//logger=Logger.getLogger(TC_01.class);
		//PropertyConfigurator.configure("log4j.properties");
        //PropertyConfigurator.configure(this.getClass().getClassLoader().getResource("src/maim/resources/log4j.properties"));
        
        if(browser.equals("chrome")) {
        	WebDriverManager.chromedriver().setup();
    		driver=new ChromeDriver();
        }
        else if(browser.equals("firefox")) {
        	WebDriverManager.firefoxdriver().setup();
    		driver=new FirefoxDriver();
    		
        }
        
      
        }
	
	
	
	@AfterMethod
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
}
