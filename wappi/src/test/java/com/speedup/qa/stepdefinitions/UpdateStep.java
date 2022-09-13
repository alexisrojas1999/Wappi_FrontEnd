package com.speedup.qa.stepdefinitions;


import com.speedup.qa.models.DataUpdate;
import com.speedup.qa.task.Update;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;


public class UpdateStep {
    @When("^the button is pressed it will ask for to enter a first name$")
    public void theButtonIsPressedItWillAskForToEnterAFirstNameList(List<DataUpdate> dataUpdate) {
        OnStage.theActorInTheSpotlight().attemptsTo(Update.withData(dataUpdate.get(0)));

    }
}

