package practicalsqa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practicalsqa.utilities.Driver;

public class BeginningSeleniumClassesPage extends BasePage {
	public BeginningSeleniumClassesPage(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//h1[@class='entry-title']")
	public WebElement headElement;
	
	@FindBy(xpath="//ul[@class='fancylist fancylist-check-circle fancylist-1b93c7']/li")
	public List <WebElement> listOfLessonLinks;
	
	@FindBy(tagName="iframe")
	public WebElement iframe;
	
	@FindBy(xpath="//button[@class='ytp-large-play-button ytp-button']")
	public WebElement bigPlayButton;
	
	@FindBy(xpath="//button[@class='ytp-play-button ytp-button']")
	public WebElement smallPlayButton;
	

}
