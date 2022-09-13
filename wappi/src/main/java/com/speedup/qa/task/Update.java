package com.speedup.qa.task;


import com.speedup.qa.models.DataUpdate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.Update.*;

public class Update implements Task {

    private DataUpdate dataUpdate;
    public Update(DataUpdate dataUpdate){
        this.dataUpdate=dataUpdate;
    }

    @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(Click.on(INFORMATION_BUTTON));
            actor.attemptsTo(Enter.theValue(dataUpdate.getFirstname()).into(FIRSTNAME));
            actor.attemptsTo(Enter.theValue(dataUpdate.getLastname()).into(LASTNAME));
            actor.attemptsTo(Enter.theValue(dataUpdate.getBirthday()).into(DOB));
            actor.attemptsTo(Click.on( COUNTRY));
            actor.attemptsTo(Click.on( SEX));
            actor.attemptsTo(Click.on( CONFIRM_BUTTON));

    }
    public static Update  withData (DataUpdate dataUpdate) {
        return new Update(dataUpdate);
    }



}
