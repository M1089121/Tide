package project2;

import org.openqa.selenium.By;

public class selenium{
	pubklic static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./drivers//chromedriver.exe");
		driver.get("https://tide.com/en-us");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//[input@type='search']")).sendkeys("Tide Hygenic Clean Heavy Duty");
		
	}
}