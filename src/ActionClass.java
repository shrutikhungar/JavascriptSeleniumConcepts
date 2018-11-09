import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {
	public static WebDriver driver;
	static String url="https://www.seleniumeasy.com/selenium-tutorials/navigation-methods-webdriver-examples";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Actions ActionObj=new Actions(driver);
		ActionObj.keyDown(Keys.CONTROL).release().build().perform();
		System.out.println("A");
	}
}
