import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetInnerTextWebPageByJS {
	public static WebDriver driver;
	public static int count;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		String innerText=getInnerText(driver);
		System.out.println(innerText);
		while (innerText.contains("features")) {
			count++;
			int beginIndex=innerText.indexOf("features");
			int endIndex="features".length();
			innerText=innerText.substring(beginIndex+endIndex);
		}
		System.out.println(count);
	}
	public static String getInnerText(WebDriver driver) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=((JavascriptExecutor)driver);
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
}