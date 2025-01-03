import commonfunctions.DriverHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class MyStepdefs {


        @Given("I open the browser with url")
        public void launchBrowser() throws IOException, InterruptedException {
                DriverHelper.launchBrowser();
        }


        @When("I enter uesrname and password")
        public void iEnterUesrnameAndPassword() {
                
        }

        @And("I click on the signin")
        public void iClickOnTheSignin() {
                
        }

        @Then("I should able to see the homepage")
        public void iShouldAbleToSeeTheHomepage() {

        }
}
