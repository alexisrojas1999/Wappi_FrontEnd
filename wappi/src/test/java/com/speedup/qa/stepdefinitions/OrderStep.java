package com.speedup.qa.stepdefinitions;

import com.speedup.qa.task.Order;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class OrderStep {

    @When("^The user clicks on the order$")
    public void theUserClicksOnTheOrder() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Order.order());
    }




    @Then("^the order appears\\.$")
    public void theOrderAppears() {

    }


    }



