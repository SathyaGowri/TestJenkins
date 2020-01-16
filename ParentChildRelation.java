import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ParentChildRelation {
	
	public static void main(String args[]) throws InterruptedException{
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Juno\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
//	  String baseUrl = "https://www.spicejet.com";  sathya
//	  // launch Fire fox and direct it to the Base URL
//	  driver.get(baseUrl);
//	  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//	  Thread.sleep(2000L);
//	  driver.findElement(By.xpath("//div[@id='ctl00$mainContent$ddl_originStation1'] //a[@value='AMD']")).click();
//	  Thread.sleep(2000L);
//	  driver.close();
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Juno\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("https://www.google.com/");
		//test
		System.out.println(driver2.getCurrentUrl());
		System.out.println(driver2.getPageSource());
		driver2.get("https://www.yahoo.com/");
		driver2.navigate().back();
		Thread.sleep(5000);
		driver2.close();
//		WebElement uname=driver2.findElement(By.name("userName"));
//	      uname.sendKeys("sathya");
//	      driver2.findElement(By.name("submit")).submit();
//	      Thread.sleep(5000);
//	      driver2.findElement(By.linkText("Car Rentals")).click();
//	      Thread.sleep(5000);
//	      driver2.quit();
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Juno\\chromedriver.exe");
//		WebDriver driver2 = new ChromeDriver();
//	      driver2.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	      Thread.sleep(5000);
//	      Actions actions = new Actions(driver2);
//	      WebElement target = driver2.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div/div/form/span/section/div/div/div/div/ul/li[2]/div/div[1]/div/div[2]/div[1]"));
//	      actions.moveToElement(target).perform();
	      







	}


}
