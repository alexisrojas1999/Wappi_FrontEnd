package com.speedup.qa.stepdefinitions;

import com.speedup.qa.models.DataLogin;
import com.speedup.qa.task.Login;
import com.speedup.qa.task.OpenBrowser;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class LoginStep {
    @Managed
    private WebDriver myBrowser;

    @Before
    public void setUpOnstage() {
        setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(myBrowser)));
        theActorCalled("Alexis Rojas ");
    }
    @Given("^that the user has a registered username and password$")
    public void thatTheUserHasARegisteredUsernameAndPassword() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.browser());
    }

    @When("^the user enter corresponding information$")
    public void theUserEnterCorrespondingInformation(List<DataLogin> dataLogin) {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.withData(dataLogin.get(0)));

    }

    @Then("^the user should see the offer page$")
    public void theUserShouldSeeTheOfferPage() {
    }


}
