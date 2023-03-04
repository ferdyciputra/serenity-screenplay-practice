package swaglabs.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class LoginPage extends PageObject {
    public static Target USER_NAME_FIELD = Target.the("user name field").locatedBy("#user-name");
    public static Target PASSWORD_FIELD = Target.the("password field").locatedBy("#password");
    public static Target LOGIN_BUTTON = Target.the("login button").locatedBy("#login-button");
    public static Target ERROR_MESSAGE = PageElement.locatedBy(".error-message-container");
}
