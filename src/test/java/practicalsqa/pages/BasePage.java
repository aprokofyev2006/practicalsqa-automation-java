package practicalsqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import practicalsqa.utilities.Driver;

public class BasePage {
	
	public BasePage(){
		PageFactory.initElements(Driver.getInstance(), this);
	}
	
	@FindBy(xpath="//a[.='Home']")
	public WebElement homeTab;
	
	@FindBy(xpath="//li[@id='menu-item-1829']")
	public WebElement classesTab;

}
