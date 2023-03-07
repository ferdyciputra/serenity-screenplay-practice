package swaglabs.tasks.authentication;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import swaglabs.model.SwaglabsUser;
import swaglabs.pageobjects.LoginPage;

public class Login {

    public static Performable asA(SwaglabsUser swaglabsUser) {
        return Task.where("{0} logs in as a " + swaglabsUser,
                Enter.theValue(swaglabsUser.username).into(LoginPage.USER_NAME_FIELD),
                Enter.theValue(swaglabsUser.password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

}
