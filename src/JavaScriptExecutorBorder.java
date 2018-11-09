import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorBorder {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		WebElement loginBtn=driver.findElement(By.xpath("//input[@value='Login']"));
		drawBorder(loginBtn,driver);
		takesScreenShot(driver);
	}
	public static void takesScreenShot(WebDriver driver) throws IOException {
		 File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(srcFile, new File("C:\\Users\\D E L L\\eclipse-workspace\\JavaSeleniumConcepts\\Screenshot\\Screenshot\\a.png"));
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}

}
