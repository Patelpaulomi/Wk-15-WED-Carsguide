package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsedCarTestSteps {
    @When("^I mouse hover  on \"([^\"]*)\" tab$")
    public void iMouseHoverOnTab(String buySell)  {
     new HomePage().mouseHoverBuySell();
    }

    @And("^I click 'Used' link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCarLink();
    }

    @Then("^I navigate to 'Used Cars For Sale' page$")
    public void iNavigateToUsedCarsForSalePage() {
//        String expectedText = "Used Cars For Sale";
//        String actualText = new UsedCarsForSalePage().verifyUsedCarsForSaleText();
//        Assert.assertEquals(actualText, expectedText);
    }

    @Then("^I should see the verifyMessage \"([^\"]*)\" in results$")
    public void iShouldSeeTheVerifyMessageInResults(String resultTextUsedCars)  {
      new ResultPage().verifyTheResultUsedCars(resultTextUsedCars);
    }
}
