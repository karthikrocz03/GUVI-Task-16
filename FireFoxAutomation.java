package guvitask18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxAutomation {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/?gws_rd=ssl");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().refresh();
		driver.close();
	}

}
