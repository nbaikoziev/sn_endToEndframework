package tests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProfilePost {

@Then("^user verifies mandatory attributes for profile book title field$")
public void user_verifies_mandatory_attributes_for_profile_book_title_field() throws Throwable {
    throw new PendingException();
}

@When("^user hits Profile POST request with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void user_hits_Profile_POST_request_with1(String arg1, String arg2, String arg3, String arg4) throws Throwable {
}

@When("^user hits Profile POST request with \"([^\"]*)\"     \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void user_hits_Profile_POST_request_with(String arg1, String arg2, String arg3, String arg4) throws Throwable {
}

@Then("^user validates the data in the profile response with the requested data \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void user_validates_the_data_in_the_profile_response_with_the_requested_data(String arg1, String arg2, String arg3) throws Throwable {
}

}
