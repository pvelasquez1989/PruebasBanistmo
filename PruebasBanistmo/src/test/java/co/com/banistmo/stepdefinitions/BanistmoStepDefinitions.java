package co.com.banistmo.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static co.com.banistmo.util.WebDriver.chrome;

public class BanistmoStepDefinitions {

    @Before
    public void init() {
        setTheStage(OnlineCast.ofStandardActors());
    }


    @Given("^the user need to enter the banistmo page$")
    public void theUserNeedToEnterTheBanistmoPage() {

        theActorCalled("user");
        theActorInTheSpotlight().can(BrowseTheWeb.with((chrome())));
    }


    @When("^the user search the tariff option$")
    public void theUserSearchTheTariffOption() {

    }

    @Then("^the user should see the file pdf correctly$")
    public void theUserShouldSeeTheFilePdfCorrectly() {

    }
}