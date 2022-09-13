package com.speedup.qa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Login {
public static final Target USER = Target
        .the("Escribir usuario")
        .located(By.xpath("//input[@id='username']"));


    public static final Target PASSWORD = Target
            .the("Ingresar Contraseña")
            .located(By.xpath("//input[@id='password']"));

    public static final Target LOGIN_BUTTON  = Target
            .the("Login Button")
            .located(By.id("button-login"));

}


