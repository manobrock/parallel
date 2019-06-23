package parallel.parallel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel {
	String url = "https://www.google.com/";
	String driverpath = "H:\\selenium\\chrome74\\chromedriver.exe";
	WebDriver driver1;
	
	WebDriver driver2;
	WebDriver driver3;
	WebDriver driver4;
	WebDriver driver5;
	@Test(groups= {"regression","sanity"})
	public void parallel1() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver1 = new ChromeDriver();
			driver1.get(url);
			driver1.findElement(By.name("q")).sendKeys("sachin");
			driver1.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver1.getTitle());
			System.out.println("The URL is:" +driver1.getCurrentUrl());
			driver1.manage().window().maximize();
			driver1.manage().deleteAllCookies();
			driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
			
		}
	@Test(groups= {"regression"})
	public void parallel2() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver2 = new ChromeDriver();
			driver2.get(url);
			driver2.findElement(By.name("q")).sendKeys("monkey");
			driver2.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver2.getTitle());
			System.out.println("The URL is:" +driver2.getCurrentUrl());
			driver2.manage().window().maximize();
			driver2.manage().deleteAllCookies();
			driver2.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver2.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}
	/*@Test
	public void parallel2() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver1 = new ChromeDriver();
			driver1.get(url);
			driver1.findElement(By.name("q")).sendKeys("monkey");
			driver1.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver1.getTitle());
			System.out.println("The URL is:" +driver1.getCurrentUrl());
			driver1.manage().window().maximize();
			driver1.manage().deleteAllCookies();
			driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}*/
	
	@Test(groups= {"regression","smoke"})
	public void parallel3() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver3 = new ChromeDriver();
			driver3.get(url);
			driver3.findElement(By.name("q")).sendKeys("maharashi");
			driver3.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver3.getTitle());
			System.out.println("The URL is:" +driver3.getCurrentUrl());
			driver3.manage().window().maximize();
			driver3.manage().deleteAllCookies();
			driver3.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver3.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}
	/*@Test
	public void parallel3() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver1 = new ChromeDriver();
			driver1.get(url);
			driver1.findElement(By.name("q")).sendKeys("maharashi");
			driver1.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver1.getTitle());
			System.out.println("The URL is:" +driver1.getCurrentUrl());
			driver1.manage().window().maximize();
			driver1.manage().deleteAllCookies();
			driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}*/
	@Test(groups= {"smoke"})
	public void parallel4() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver4 = new ChromeDriver();
			driver4.get(url);
			driver4.findElement(By.name("q")).sendKeys("tirupathi");
			driver4.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver4.getTitle());
			System.out.println("The URL is:" +driver4.getCurrentUrl());
			driver4.manage().window().maximize();
			driver4.manage().deleteAllCookies();
			driver4.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver4.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}
	/*@Test
	public void parallel4() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver1 = new ChromeDriver();
			driver1.get(url);
			driver1.findElement(By.name("q")).sendKeys("tirupathi");
			driver1.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver1.getTitle());
			System.out.println("The URL is:" +driver1.getCurrentUrl());
			driver1.manage().window().maximize();
			driver1.manage().deleteAllCookies();
			driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}*/
	@Test(groups= {"sanity"})
	public void parallel5() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver5 = new ChromeDriver();
			driver5.get(url);
			driver5.findElement(By.name("q")).sendKeys("tanjore big temple");
			driver5.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver5.getTitle());
			System.out.println("The URL is:" +driver5.getCurrentUrl());
			driver5.manage().window().maximize();
			driver5.manage().deleteAllCookies();
			driver5.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver5.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}
	/*@Test
	public void parallel5() {
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver1 = new ChromeDriver();
			driver1.get(url);
			driver1.findElement(By.name("q")).sendKeys("tanjore big temple");
			driver1.findElement(By.name("btnK")).click();
			System.out.println("The Title is:" +driver1.getTitle());
			System.out.println("The URL is:" +driver1.getCurrentUrl());
			driver1.manage().window().maximize();
			driver1.manage().deleteAllCookies();
			driver1.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver1.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
	}*/
	
	
	

}
