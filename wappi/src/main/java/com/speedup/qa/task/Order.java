package com.speedup.qa.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.speedup.qa.userinterface.Order.*;

public class Order implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SELECT_PRODUCT));
        actor.attemptsTo(Click.on(CONFIRM_ORDER));
        actor.attemptsTo(Click.on(CLOSE_POPUP));
        actor.attemptsTo(Click.on(CLICK_ORDERS));
    }

    public static Performable order(){

        return Tasks.instrumented(Order.class);
    }

}

