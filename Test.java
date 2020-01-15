import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
  public static void main(String args[]) throws InterruptedException{
  	System.setProperty("webdriver.firefox.marionette","C:\\Users\\Juno\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Juno\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//  	
      String baseUrl = "https://www.flipkart.com";
      String expectedTitle = "Welcome: Mercury Tours";
      String actualTitle = "";

      // launch Fire fox and direct it to the Base URL
      driver.get(baseUrl);
      driver.manage().window().maximize();
      Thread.sleep(5000);
      driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
      List<WebElement> lwe = driver.findElements(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div/div[2]"));
      int count = lwe.size();
      System.out.println("Count >>" + lwe.size());
      driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div/div[2]")).click();
      Thread.sleep(2000);

      driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div/div[2]")).click();
      Thread.sleep(2000);

      driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div/div[3]")).click();
      Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[2]/div[1]/div/div[3]")).click();
      
      int imageCount = driver.findElements(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/150/150/image/05c28a409127e651.jpg?q=70']")).size();
System.out.println("Image Count"+imageCount);
      Thread.sleep(2000);
//
//      // get the actual value of the title
//      actualTitle = driver.getTitle();
//      System.out.println("Title "+actualTitle);
//      if(actualTitle.contentEquals(expectedTitle)){
//    	  System.out.println("Title matches");
//      }
//      WebElement uname=driver.findElement(By.name("userName"));
//      uname.sendKeys("sathya");
//      driver.findElement(By.name("submit")).submit();
//      Thread.sleep(5000);
    driver.close();

  }
}
