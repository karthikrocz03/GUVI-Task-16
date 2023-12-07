package guvitask18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeAutomationWikipedia {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.wikipedia.org/");
	driver.manage().window().maximize();
	driver.findElement(By.name("search")).sendKeys("Artificial Intelligence");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.linkText("History")).click();
	String url = driver.getTitle();
	System.out.println(url);
}
}
