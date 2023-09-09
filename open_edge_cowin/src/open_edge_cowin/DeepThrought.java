package open_edge_cowin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DeepThrought {
	public static void main(String[] args) {
		String username="rahul1998";
		String pwd="rahul@1998";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev.deepthought.education/login");
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.cssSelector("#password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("#login")).click();
		try {
    	WebElement msg=	driver.findElement(By.xpath("//p[text()='Invalid login credentials']"));
    
    	if(msg.getText().contains("Invalid"))
    	{
    		System.out.println("INVALID CREDENTIALS");
    	}
		}
    	
		catch(Exception e)
		{
			System.out.println("Login successfull");
		}
		try {
		WebElement title=driver.findElement(By.xpath("//h5[text()='Welcome to DeepThought']"));
		if(title.getText().contains("Welcome"))
		{
			System.out.println("Home page loaded successfully");
		}
		}
		catch(Exception e)
		{
			System.out.println("Home page is not loaded Something went wrong");
		}
    	driver.close();
	
	
		
	}

}
