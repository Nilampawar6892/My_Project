package PageObjectFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LoginPageObject {
	
	
	WebDriver driver;
	
	public By Username =By.xpath ("//*[@id='email']");
	
	By Password = By.xpath("//*[@id='passContainer']");
	
	//By SubmitButton =By.xpath("//*[@id=\"u_0_d_+e\"]");
	
	public LoginPageObject(WebDriver driver) {
          this.driver =driver;
         }
	

	public void Username(String a)
	{
         driver.findElement(Username).sendKeys("9664522234");;
		
	}
	
	public void PasswordMethod(String b)
	{
         driver.findElement(Password).sendKeys("Atul@123");;
		
	}
	
	
	/*public WebElement Submit()
	{
        return driver.findElement(SubmitButton);
		
	}*/
}
