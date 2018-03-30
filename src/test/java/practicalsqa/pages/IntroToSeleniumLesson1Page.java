package practicalsqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practicalsqa.utilities.Driver;

public class IntroToSeleniumLesson1Page extends BasePage {
	public IntroToSeleniumLesson1Page(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//h1[@class='entry-title']")
	public WebElement head;
}
