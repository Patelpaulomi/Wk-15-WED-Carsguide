package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class FindDealersTestSteps {
    @And("^I click 'Find a Dealer'$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindADealer();
    }

    @Then("^I navigate to 'car-dealers' page$")
    public void iNavigateToCarDealersPage() {
//        String expectedText = "Find a Car Dealership Near You";
//        String actualText = new CarDealerPage().verifyFindACarDealershipText();
//        Assert.assertEquals(actualText, expectedText);
    }



//    @And("^I should see the dealer name \"([^\"]*)\" are display on page$")
//    public void iShouldSeeTheDealerNameAreDisplayOnPage(DataTable dataTable)  {
//        List<List<String>> userList = dataTable.asLists(String.class);
//        for (List<String> e : userList) {
//            //System.out.println(e);
//            System.out.println(e.get(0));
//
//        }
//    }

    @And("^I should see the dealer name <dealersName> are display on page$")
    public void iShouldSeeTheDealerNameDealersNameAreDisplayOnPage(DataTable dataTable) {
        List<List<String>> userList = dataTable.asLists(String.class);
        for (List<String> e : userList) {
            //System.out.println(e);
            System.out.println(e.get(0));

        }
    }

//    @When("^I mouse hover on buy\\+sell tab$")
//    public void iMouseHoverOnBuySellTab() {
//        new HomePage().mouseHoverBuySell();
//    }

//    @And("^Verify the dealers are in the list \"([^\"]*)\"$")
//    public void verifyTheDealersAreInTheList(String VerifyMessage)  {
//        new CarDealerPage().verifyFindACarDealershipText();
//
//    }
}
