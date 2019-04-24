package basicweb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class FirefoxDriverDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\libs\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		String baseURL = "http://google.com";
		driver.manage().window().maximize();
		driver.get(baseURL);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input")));
		
		//WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
		search.sendKeys("Letskodeit");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div/div[3]/center/input[1]")).click();
		
		Thread.sleep(5000);
		//driver.quit();
	}

}
