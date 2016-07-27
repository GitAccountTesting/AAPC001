package Rough;

public class StaticInitilizer {
/*	package base;

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.List;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;
	import org.apache.http.HttpResponse;
	import org.apache.http.client.HttpClient;
	import org.apache.http.client.methods.HttpGet;
	import org.apache.http.impl.client.HttpClientBuilder;
	import org.apache.log4j.Logger;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

	import Utility.ExcelReader;


	public class Page {
		public static WebDriver driver;
		public static TopNavigation topNav;
		public static Properties OR=new Properties();
		public static Properties Config=new Properties();
		public static FileInputStream fis;
		public static Logger log = Logger.getLogger("devpinoyLogger");
		public static File file;
	    public static FileWriter filewriter; 
		public static BufferedWriter bw;
		public int invalidlinkscount=0;
		public static ExcelReader excel=new ExcelReader("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\src\\test\\resources\\properties\\AAPCTestData.xlsx");

		
		
			
			
		
		
		public void logMessage(String mssg) throws IOException
		{
			file=new File("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\FileRecordsOfSuccessfulMethods.txt");
			filewriter=new FileWriter(file);
			bw =new BufferedWriter(filewriter);
			bw.write(mssg);
			bw.close();
		}
		
		public  static void InitializeDriver()
		{
	if(driver==null)
				
			{
				
				try {
					fis= new FileInputStream("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\src\\test\\resources\\properties\\OR.properties");
			
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					OR.load(fis);
					log.debug("Loaded OR properties file");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			try {
				fis= new FileInputStream("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			try {
				Config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Config.getProperty("browser").equals("firefox"))
			{
			
			driver= new FirefoxDriver();
			driver.get(Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10l,TimeUnit.SECONDS);	
				
			}
			}
		
		}
		
		public Page()  
		{
			if(driver==null)
				
			{
				
				try {
					fis= new FileInputStream("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\src\\test\\resources\\properties\\OR.properties");
			
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					OR.load(fis);
					log.debug("Loaded OR properties file");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			try {
				fis= new FileInputStream("D:\\Way2\\Classes\\AAPCFULL\\AAPCFULL001\\src\\test\\resources\\properties\\Config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			try {
				Config.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(Config.getProperty("browser").equals("firefox"))
			{
			
			driver= new FirefoxDriver();
			driver.get(Config.getProperty("testsiteurl"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10l,TimeUnit.SECONDS);	
				
			}
			}
			
		}
		
		public void AllLinks()
		{
			try {
				
			
		
		List<WebElement> AllLinks=	driver.findElements(By.tagName("a"));
		System.out.println("Total Links on this page are :-"+ AllLinks);
		
		for(int i=0;i<AllLinks.size();i++)
		{
			String link=AllLinks.get(i).getAttribute("href");
			System.out.println(link);
			if(link !=null && !link.contains("javascript"))
			{
				verifyURLStatus(link);
			}
			else
			{
				invalidlinkscount++;
			}
		}
		System.out.println("Total number of the invalid links are :-"+ invalidlinkscount);
		
		}
		 catch (Exception e) {
			System.out.println(e);
		}
			
	}
		public void verifyURLStatus(String URL) {
		HttpClient client=HttpClientBuilder.create().build();
		HttpGet request=new HttpGet(URL);
		try {
			HttpResponse response=client.execute(request) ;
			if(response.getStatusLine().getStatusCode()!=200)
			{
			invalidlinkscount++;
			
			System.out.println("This the link where 200 response is not coming"+ URL);
			
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		}
		}

*/


}
