import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoView {
	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.xpath("//section[@id=\"details\"]/div/div/div/div/div[6]/h3 "));
		scrollIntoView(element, driver);
	}
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
