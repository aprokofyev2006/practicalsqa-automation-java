package practicalsqa.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import practicalsqa.pages.BasePage;
import practicalsqa.pages.BeginningSeleniumClassesPage;
import practicalsqa.pages.BlackBoxQuestions2Page;
import practicalsqa.pages.ClassesPage;
import practicalsqa.pages.PracticalsqaHomePage;
import practicalsqa.utilities.Config;
import practicalsqa.utilities.Driver;
import practicalsqa.utilities.Page;

public class Test001_InterviewQuestionsBBTPage2 {
	PracticalsqaHomePage homePage;
	BlackBoxQuestions2Page questions2Page;
	BeginningSeleniumClassesPage beginningSeleniumClassesPage;
	ClassesPage classesPage;
	BasePage basePage = new BasePage();
	
	@Given("^user is on the practicalsqa\\.net homepage$")
	public void user_is_on_the_practicalsqa_net_homepage() throws Throwable {
	    Driver.getInstance().get(Config.getProperty("url"));
	}
	
	@Given("^user click link \"([^\"]*)\"$")
	public void user_click_link(String arg1) throws Throwable {
		homePage = new PracticalsqaHomePage();
	    Page.waitUntilClickable(Driver.getInstance(), homePage.interviewQwLink);
	    homePage.interviewQwLink.click();
	}
	
	@Given("^user clicking on the question \"([^\"]*)\" from test case \"([^\"]*)\"$")
	public void user_clicking_on_the_question_from_test_case(String question, int id) throws Throwable {
		questions2Page = new BlackBoxQuestions2Page();
		int i=id-1;
		Page.waitUntilVisible(Driver.getInstance(), questions2Page.headerElement);
	    List<WebElement> elList = questions2Page.listOfQuestions;
	    System.out.println(elList.get(i).getText());
	    assertEquals(question.trim(), elList.get(i).getText().trim());
	    
	}

	@Then("^verify that answer \"([^\"]*)\" containt \"([^\"]*)\"$")
	public void verify_that_answer_containt(int id, String answer) throws Throwable {
		WebElement answerElement=questions2Page.dlElement.findElement(By.xpath("//dd["+id+"]"));
		System.out.println("expected: "+answer);
		String actualAnswer=answerElement.getText();
		System.out.println("actual: "+actualAnswer);
		assertTrue(actualAnswer.contains(answer));
	}
	//---------------Step Def SergeiD--------------//
	
	@Given("^click on the picture \"([^\"]*)\"$")
	public void click_on_the_picture(String arg1) throws Throwable {
	//    Page.waitUntilVisible(Driver.getInstance(), Driver.getInstance().findElement(By.xpath("//article[@id='post-1468']/a")));
		homePage = new PracticalsqaHomePage();
	
	//	Page.waitUntilVisible(Driver.getInstance(), homePage.beginingSelClass);
	//	Page.waitUntilClickable(Driver.getInstance(), homePage.homeTab);
	//	((JavascriptExecutor) Driver.getInstance()).executeScript("arguments[0].scrollIntoView(true);", homePage.beginingSelClass);
		homePage.beginingSelClass.click();
	}

	@Given("^redirected to \"([^\"]*)\" password is not required$")
	public void redirected_to_password_is_not_required(String expectedURL) throws Throwable {
		beginningSeleniumClassesPage = new BeginningSeleniumClassesPage(); 
	//	Page.waitUntilVisible(Driver.getInstance(), beginningSeleniumClassesPage.headElement);
		String currentURL =  Driver.getInstance().getCurrentUrl().toString();
		System.out.println(currentURL);
		assertEquals(expectedURL, currentURL);
	}
	@Then("^user is able to see list of eleven links for Lessons:$")
	public void user_is_able_to_see_list_of_eleven_links_for_Lessons(List<String> lessonsList) throws Throwable {
	    for(int i=0;i<lessonsList.size();i++){
	    	String expected=lessonsList.get(i);
	    	WebElement elem=beginningSeleniumClassesPage.listOfLessonLinks.get(i);	    	
	    	String actual = elem.getText();
	    	if(actual.contains("–")){
	    		actual=elem.getText().replaceAll("–", "-");
	    	}
	    	assertTrue(elem.isDisplayed());
	    	assertEquals(expected, actual);
	    	
	    }
	}
	
	//-----------TC2 Verify links for Lessons are presents in Begginnig Selenium Classes from Tab menu
	

	@Given("^click on \"([^\"]*)\" tab$")
	public void click_on_tab(String arg1) throws Throwable {
	    basePage.classesTab.click();
	}

	@Given("^click on \"([^\"]*)\" under the \"([^\"]*)\"$")
	public void click_on_under_the(String arg1, String arg2) throws Throwable {
		classesPage = new ClassesPage();
		assertTrue(classesPage.moreInfoSeleniumForBeginnersLink.isDisplayed());
	    classesPage.moreInfoSeleniumForBeginnersLink.click();
	}

	//-------------------------TC03
	
	@Given("^click on the play button on the Video$")
	public void click_on_the_play_button_on_the_Video() throws Throwable {
		
		beginningSeleniumClassesPage = new BeginningSeleniumClassesPage();
		Driver.getInstance().switchTo().frame(beginningSeleniumClassesPage.iframe);
		((JavascriptExecutor) Driver.getInstance()).executeScript("arguments[0].scrollIntoView(true);", beginningSeleniumClassesPage.bigPlayButton);
		Page.waitUntilClickable(Driver.getInstance(), beginningSeleniumClassesPage.bigPlayButton);
		beginningSeleniumClassesPage.bigPlayButton.click();
		Thread.sleep(2000);
	}

	@Then("^\"([^\"]*)\" video playing$")
	public void video_playing(String arg1) throws Throwable {
		assertEquals("Pause", beginningSeleniumClassesPage.smallPlayButton.getAttribute("aria-label").toString());
		System.out.println(beginningSeleniumClassesPage.smallPlayButton.getAttribute("aria-label").toString());
		Driver.getInstance().switchTo().defaultContent();
	}

	//-------------------------TC04
	
	@Given("^click \"([^\"]*)\" link$")
	public void click_link(String arg1) throws Throwable {
		beginningSeleniumClassesPage = new BeginningSeleniumClassesPage();
	    beginningSeleniumClassesPage.lessonOneLink.click();
	    Thread.sleep(2000);
	}

	@Then("^user able to see material of the Lesson (\\d+), password not required$")
	public void user_able_to_see_material_of_the_Lesson_password_not_required(int arg1) throws Throwable {
	    
	}

}
