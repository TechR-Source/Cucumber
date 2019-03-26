package stepDefinations;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class StepDefination {

	

	    @Given("^Use is on netbanking login page$")
	    public void use_is_on_netbanking_login_page() throws Throwable {
	    }

	    @When("^User login into the applicaion with the username and password$")
	    public void user_login_into_the_applicaion_with_the_username_and_password() throws Throwable {
	    }

	    @Then("^Homepage is populated$")
	    public void homepage_is_populated() throws Throwable {
	    }

	    @And("^Card are displayed $")
	    public void card_are_displayed() throws Throwable {
	    }
	    
	    

	}
	

