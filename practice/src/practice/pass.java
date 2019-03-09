package practice;



	
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
	

public class pass {				
    		
    public static void main(String[] args) {									
        String baseUrl = "https://www.fb.com";					
        System.setProperty("webdriver.chrome.driver","C:\\Prashanth\\chromedriver.exe");					
        WebDriver driver = new ChromeDriver();	
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Set<Cookie> allcookies=driver.manage().getCookies();
        System.out.println("cookies " + allcookies);
        //System.out.println("cookies " + driver.manage().getCookies());
        //System.out.println("cookies " + driver.manage().getCookieNamed(baseUrl));
        driver.quit();
     
    }
}