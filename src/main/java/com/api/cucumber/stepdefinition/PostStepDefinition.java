package com.api.cucumber.stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PostStepDefinition {
 
	 @Given("^User should be logged into the facebook. $")
	    public void user_should_be_logged_into_the_facebook() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^user type some text on the wall. $")
	    public void user_type_some_text_on_the_wall() throws Throwable {
	        throw new PendingException();
	    }

	    @When("^User supply the Youtube link as \"([^\"]*)\" in the text box $")
	    public void user_supply_the_youtube_link_as_something_in_the_text_box(String strArg1) throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^The message should be posted. $")
	    public void the_message_should_be_posted() throws Throwable {
	        throw new PendingException();
	    }

	    @Then("^Video should get posted on the user wall $")
	    public void video_should_get_posted_on_the_user_wall() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^User should be on their own facebook wall page.$")
	    public void user_should_be_on_their_own_facebook_wall_page() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^the user clicks on post button. $")
	    public void the_user_clicks_on_post_button() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^Click on Post button $")
	    public void click_on_post_button() throws Throwable {
	        throw new PendingException();
	    }

	    @And("^The video should have proper Thumnail $")
	    public void the_video_should_have_proper_thumnail() throws Throwable {
	        throw new PendingException();
	    }


	
}

