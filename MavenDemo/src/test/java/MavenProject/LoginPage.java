package MavenProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjectFactory.LoginPageObject;

public class LoginPage {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\Chromedriver.exe");

   WebDriver driver =new ChromeDriver();
   driver.get("https://www.facebook.com/");
   
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   LoginPageObject Login =new LoginPageObject(driver);
   
   Login.Username("9664522234");
   
   
   WebDriverWait wait2 = new WebDriverWait(driver, 10);
   wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("Password")));
   driver.findElement(By.xpath("xpath_element_to_be_clicked")).click();
   
   Login.PasswordMethod("Atul@123");
   
   Runtime.getRuntime().exec("C:\\Users\\ATUL006\\Documents\\FileUpload.exe");
   
  // Login.Submit().click();
   
   
   
   
   
   
	}
	


   
   


}
