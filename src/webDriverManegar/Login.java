package webDriverManegar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public WebDriver driver1;
	public WebDriver driver2;
	public WebDriver driver3;

	@BeforeTest

	public void login() {

		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriverManager.firefoxdriver().setup();

		driver1 = new ChromeDriver();
		driver2 = new EdgeDriver();
		driver3 = new FirefoxDriver();

		driver1.get("https://www.google.com/");
		driver2.get("https://www.facebook.com");
		driver3.get("https://www.linkedin.com/");

//		driver1.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("asaqa001@outlook.com");
//		driver1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("aboud12345678@");
//		driver1.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();

	}

	@Test()
	public void test_Title_google() {
		String actualTitleName = driver1.getTitle();
		String expectedTitleName = "Google";
//		System.out.println(actualTitleName);

		Assert.assertEquals(actualTitleName, expectedTitleName);

	}

@Test()
public void test_Title_facebook()
	{
	String actualTitleName = driver2.getTitle();
	String expectedTitleName = "Facebook - log in or sign up";
	Assert.assertEquals(actualTitleName, expectedTitleName);
	}
@Test()
public void test_title_linkedin() {
	String actualTitleName = driver3.getTitle();
	String expectedTitleName = "LinkedIn: Log In or Sign Up";
	Assert.assertEquals(actualTitleName, expectedTitleName);
}
}
