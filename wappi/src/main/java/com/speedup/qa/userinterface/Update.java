package com.speedup.qa.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Update {

    public static final Target INFORMATION_BUTTON = Target
            .the("Personal Information")
            .located(By.xpath("/html/body/app-root/app-home/app-nav-bar/nav/ul[1]/li[4]/a"));


    public static final Target FIRSTNAME = Target
            .the("Nombre")
            .located(By.xpath("//*[@id='name']"));


    public static final Target LASTNAME = Target
            .the("Apellido")
            .located(By.xpath("//*[@id='lastName']"));

    public static final Target DOB = Target
            .the("fecha de nacimiento")
            .located(By.xpath("//*[@id='bornDate']"));


    public static final Target COUNTRY = Target
            .the("pais de origen")
            .located(By.xpath("//*[@id='country']/option[3]"));

    public static final Target SEX= Target
            .the("GENERO")
            .located(By.xpath("/html/body/app-root/app-profile/div/div/form/div[1]/app-radio-input/div/label[1]"));

    public static final Target CONFIRM_BUTTON= Target
            .the("save button")
            .located(By.xpath("//*[@id='save-profile']"));






}
