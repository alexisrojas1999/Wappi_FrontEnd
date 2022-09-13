package com.speedup.qa.task;

import com.speedup.qa.models.DataLogin;
import com.speedup.qa.models.DataUpdate;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.speedup.qa.userinterface.Login.*;

public class Login implements Task {

    private DataLogin dataLogin;
    public Login(DataLogin dataLogin){
        this.dataLogin=dataLogin;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataLogin.getUser()).into(USER));
        actor.attemptsTo(Enter.theValue(dataLogin.getPassword()).into(PASSWORD));
        actor.attemptsTo(Click.on(LOGIN_BUTTON));

    }
    public static Login withData(DataLogin dataLogin) {
        return new Login(dataLogin);
    }


}
