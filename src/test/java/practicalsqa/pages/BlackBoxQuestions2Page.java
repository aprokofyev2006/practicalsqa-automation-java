package practicalsqa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practicalsqa.utilities.Driver;

public class BlackBoxQuestions2Page extends BasePage{
	public BlackBoxQuestions2Page(){
	PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//dl[@class='accordion']/dt")
	public List<WebElement> listOfQuestions;
	
	@FindBy(xpath="//dl[@class='accordion']")
	public WebElement dlElement;
	
	@FindBy(xpath="//h1[contains(text(),'Interview questions for black box')]")
	public WebElement headerElement;
	
	

}
