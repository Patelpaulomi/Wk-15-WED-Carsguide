package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String buySell) {
        new HomePage().mouseHoverBuySell();
    }

    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCars();
    }

   @Then("^I navigate to 'new and used car search' page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
//        String expectedText = "New & Used Car Search - carsguide";
//        String actualText = new NewAndUsedCarSearchPage().verifyNewAndUsedCarText();
//        Assert.assertEquals(actualText, expectedText);
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarSearchPage().selectMakeOfTheCarFromDropDown(make);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectModelOfTheCarFromDropDown(model);
    }
    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocationFromDropDown(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPriceOfTheCarFromDropDown(price);
    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnMyNextCarTab();
    }

//    @Then("^I should see the make \"([^\"]*)\" in results$")
//    public void iShouldSeeTheMakeInResults(String make) {
//        new NewAndUsedCarSearchPage().verifyNewAndUsedCarText();
//    }



    @Then("^I should see the Verify Message \"([^\"]*)\" in results$")
    public void iShouldSeeTheVerifyMessageInResults(String verifyMakeInResult) {
        new ResultPage().verifyMakeResult(verifyMakeInResult);
    }

//    @Then("^I navigate to 'new and used car search' page$")
//    public void iNavigateToNewAndUsedCarSearchPage() {
//        String expectedText = "New & Used Car Search - carsguide";
//        String actualText = new NewAndUsedCarSearchPage().verifyNewAndUsedCarText();
//        Assert.assertEquals(actualText, expectedText);
//    }
}
