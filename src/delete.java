import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete {
	public static WebDriver driver;
	public static String data="features";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Study\\SeleniumDownloads\\Driver\\chromedriver_win32\\chromedriver_win32_2.37\\chromedriver.exe"); 
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		WebElement element=driver.findElement(By.className("btn-small"));
		String color=element.getCssValue("color");
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//flash(js,color,element,driver);
		//String innerText=getInnerText(js,driver);
		//System.out.println(innerText);
		//VerifyDatafromInnerText(innerText,data,driver);
		
		//clickElement(js,element,driver);
	}

	
	private static void clickElement(JavascriptExecutor js, WebElement element, WebDriver driver2) {
		js.executeScript("arguments[0].click();",element);		
	}


	private static void VerifyDatafromInnerText(String innerText, String data, WebDriver driver) {
		int count = 0;
		int beginIndex=innerText.indexOf(data);
		int endIndex=data.length();
		while (innerText.contains("features")) {
		count++;
		innerText=innerText.substring(beginIndex+endIndex);
		System.out.println(innerText);
		}
		System.out.println(count);
	}
	
	private static String getInnerText(JavascriptExecutor js, WebDriver driver2) {
		return js.executeScript("return document.documentElement.innerText;").toString();
	}
	private static void flash(JavascriptExecutor js, String color, WebElement element, WebDriver driver2) {
		for(int i=0;i<=100;i++) {
			js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
			js.executeScript("arguments[0].style.background='rgb(0,00,0)'", element);
		}	
	}
	
}
