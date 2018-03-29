package practicalsqa.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page {
	
	public static void sleep(long millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scrollToElement(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor) Driver.getInstance();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public static void waitFor(WebElement element, int seconds) {
		  WebDriver driver = Driver.getInstance();
		  WebDriverWait wait = new WebDriverWait(driver, seconds);
		  wait.until(ExpectedConditions.visibilityOf(element));

		 }
	
public static void waitUntilClickable(WebDriver driver,WebElement element){
	WebDriverWait wait = new WebDriverWait(driver,13);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}

public static void waitUntilVisible(WebDriver driver,WebElement element){
	WebDriverWait wait = new WebDriverWait(driver,13);
	wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static String getTempEmail(){
	System.setProperty("webdriver.chrome.driver", Config.getProperty("chrome"));
    WebDriver driver = new ChromeDriver();
	driver.get("https://temp-mail.org/en/");
	sleep(5000);
	//driver.findElement(By.id("click-to-delete")).click();
	String email = driver.findElement(By.xpath("//input[@id='mail']")).getAttribute("value");
	driver.close();
	return email;	
	}
	public static WebDriver driverForEmail;
	public static String getTempEmailForConfirmation(){
		System.setProperty("webdriver.chrome.driver", Config.getProperty("chrome"));
		driverForEmail = new ChromeDriver();
		driverForEmail.get("https://www.guerrillamail.com");
		driverForEmail.findElement(By.id("use-alias")).click();
		String email = driverForEmail.findElement(By.id("email-widget")).getText();
	//	driver.close();
		return email;	
		}
	
	public static String getConfirmationFromEmail(){
		String from4stay = driverForEmail.findElement(By.xpath("//tbody[@id='email_list']/tr[1]/td[2]")).getText();
		while(!from4stay.equals("noreply@4stay.com")){
			from4stay = driverForEmail.findElement(By.xpath("//tbody[@id='email_list']/tr[1]/td[2]")).getText();
		}
		WebElement conf = driverForEmail.findElement(By.xpath("//tbody[@id='email_list']/tr[1]/td[2]"));
		Page.waitFor(conf, 10);
		conf.click();
		Page.sleep(1000);
		WebElement confText = driverForEmail.findElement(By.xpath("//div[@id='display_email']/div/div[2]/h3"));
		Page.waitFor(confText, 10);
		String confirmationText = confText.getText();
		driverForEmail.close();
		return confirmationText;	
	}
	
	
	
	public static String getCurrentData(){
	DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
	Date dateobj = new Date();
	String date = df.format(dateobj);
	 return date;
			 //date.substring(5, 6)+"/"+date.substring(8, 9)+"/"+date.substring(0, 3);
	}

	static public String addOneDay() {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date dateobj = new Date();
		String date = df.format(dateobj);
	    date = LocalDate.parse(date).plusDays(1).toString();
	    date=date.substring(5, 7)+"/"+date.substring(8, 10)+"/"+date.substring(0, 4);
	    return date;
	}
	
	public static void closeIframe(){
		WebDriver driver=Driver.getInstance();
		waitFor(driver.findElement(By.xpath("//iframe[@class='intercom-borderless-frame']")), 15);
//		waitUntilClickable(driver, driver.findElement(By.xpath("//iframe[@class='intercom-borderless-frame']")));
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='intercom-borderless-frame']"));	
		driver.switchTo().frame(iframe);		
		//driver.findElement(By.xpath("//div[@class='intercom-block intercom-block-paragraph']")).click();
		driver.findElement(By.xpath("//div[@class='intercom-borderless-dismiss-button']/span")).click();
		driver.switchTo().defaultContent();		
	}
	
	public static void waitForPageToLoad() {
		  WebDriver driver = Driver.getInstance();
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.sk-double-bounce")));

		 }
	
}
