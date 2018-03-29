@SergeiD
@regression
Feature: SergeiD test cases

Background:
 Given user is on the practicalsqa.net homepage
 
Scenario: TC1 Verify links for Lessons are presents in Begginnig Selenium Classes from Home page
 And click on the picture "Beginning Selenium Classes"
 And redirected to "http://www.practicalsqa.net/beginning-selenium-classes/" password is not required
 Then user is able to see list of eleven links for Lessons:
|Lesson 1 - Introduction to Selenium/Cucumber/Ruby|
|Lesson 1 - part 2|
|Lesson 2 - Set up framework (webdriver, Ruby API, Cucumber, RubyMine)+ first test case - link to material|
|Lesson 3 - Different types of xpaths (Absolute and relative)Special characters|
|Lesson 4 - Variables|
|Lesson 5 - Variables + Global variable|
|Lesson 6 - Advance xpaths|
|Lesson 7 - Advance xpaths conditions Before and After hooks|
|Lesson 8 - Explicit and Implicit waits , conditions|
|Lesson 9 - Loops|
|Lesson 10 - Loops|
|Lesson 11 - Different browsers, tagging, debugging|

Scenario: TC2 Verify links for Lessons are presents in Begginnig Selenium Classes from Tab menu
 And click on "Classes" tab
 And click on "More Info" under the "Selenium for Beginners"
 And redirected to "http://www.practicalsqa.net/beginning-selenium-classes/" password is not required
 Then user is able to see list of eleven links for Lessons:
|Lesson 1 - Introduction to Selenium/Cucumber/Ruby|
|Lesson 1 - part 2|
|Lesson 2 - Set up framework (webdriver, Ruby API, Cucumber, RubyMine)+ first test case - link to material|
|Lesson 3 - Different types of xpaths (Absolute and relative)Special characters|
|Lesson 4 - Variables|
|Lesson 5 - Variables + Global variable|
|Lesson 6 - Advance xpaths|
|Lesson 7 - Advance xpaths conditions Before and After hooks|
|Lesson 8 - Explicit and Implicit waits , conditions|
|Lesson 9 - Loops|
|Lesson 10 - Loops|
|Lesson 11 - Different browsers, tagging, debugging|


Scenario: TC03 Verify the video in "Begginnig Selenium Classes"
And click on the picture "Beginning Selenium Classes"
And click on the play button on the Video
Then "First selenium lesson out of 10" video playing

@run
Scenario: TC04 Verify password is NOT required "Lesson 1" from the page "Begginnig Selenium Classes"
And click on the picture "Beginning Selenium Classes"
And click "Lesson 1" link
Then user able to see material of the Lesson 1, password not required