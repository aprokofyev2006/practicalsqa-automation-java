package practicalsqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practicalsqa.utilities.*;

public class PracticalsqaHomePage extends BasePage {
	public PracticalsqaHomePage(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Interview questions for black box testing – page 2')]")
	public WebElement interviewQwLink;
	
	@FindBy(xpath="//h1[@class='entry-title']/a[.='Beginning Selenium Classes']")
	public WebElement beginingSelClass;
}
