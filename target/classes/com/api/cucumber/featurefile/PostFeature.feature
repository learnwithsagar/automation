Feature: post feature of facebook 
	This will test the post functionality of facebook.
	
Background: Common Step
 Given User should be logged into the facebook. 
	And User should be on their own facebook wall page.

Scenario: Post a text in user wall 
	When user type some text on the wall. 
	And the user clicks on post button. 
	Then The message should be posted. 
	
Scenario: Post a video on user wall 

	When User supply the Youtube link as "http://www.youtube.com" in the text box 
	And Click on Post button 
	Then Video should get posted on the user wall 
	And The video should have proper Thumnail 
	
	
	
	
	
	
	
	
	
