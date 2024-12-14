package steps;

import io.cucumber.java.en.*;

public class LoginSteps {

	

@Given("user navigates to the facebook website")
public void user_navigates_to_the_facebook_website() {

}

@When("user validates the homepage title")
public void user_validates_the_homepage_title() {

}

@Then("user enters {string} username")
public void user_enters_username(String username) {
 System.out.println("@Then -- user enters "+username+" username");
}

@And("user enters {string} password")
public void user_enters_password(String password) {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println("@And -- user enters "+password+" password");
}

/*
 * @And("user enters invalid <username>") public void
 * user_enters_invalid_username() { // Write code here that turns the phrase
 * above into concrete actions throw new io.cucumber.java.PendingException(); }
 */

@And("user clicks on the signin button")
public void user_clicks_on_the_signin_button() {

}

}
