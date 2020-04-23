package injectJS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config {
	public static WebDriver driver;	
	
	public Config() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	public void openWebsite(String website) {
		driver.manage().window().maximize();
		driver.navigate().to(website);
	}

}
