package com.speedup.qa.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Order {

    public static final Target SELECT_PRODUCT = Target
            .the("Select product someone wants to buy")
            .located(By.xpath("//*[@id=\"offer-0\"]/td[7]/button"));

    public static final Target CONFIRM_ORDER = Target
            .the("Confirm order")
            .located(By.id("order-confirm"));

    public static final Target CLOSE_POPUP = Target
            .the("Close Popup")
            .located(By.xpath("//*[@id=\"confirmation-modal\"]/div/span"));

    public static final Target CLICK_ORDERS = Target
            .the("Select my Order")
            .located(By.xpath("/html/body/app-root/app-home/app-nav-bar/nav/ul[1]/li[3]/a"));


}
