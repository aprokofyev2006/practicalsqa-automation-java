package practicalsqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practicalsqa.utilities.Driver;

public class ClassesPage {
	public ClassesPage(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//div[@class='entry-content']/dl[1]/dd[1]/a[1]")
	public WebElement moreInfoSeleniumForBeginnersLink;
}
