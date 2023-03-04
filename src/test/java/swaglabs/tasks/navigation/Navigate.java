package swaglabs.tasks.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import swaglabs.pageobjects.LoginPage;
import swaglabs.utilities.BaseTest;

public class Navigate {

    public static Performable toTheLoginPage() {
        return Open.url(BaseTest.getBaseUrl());
    }

    public static Performable toTheCatalogPage() {
        return Open.url(BaseTest.getBaseUrl() + "/inventory.html");
    }

    public static Performable toTheSoppingCart() {
        return Click.on(".shopping_cart_link");
    }
}
