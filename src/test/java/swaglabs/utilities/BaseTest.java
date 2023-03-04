package swaglabs.utilities;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

public class BaseTest {
    private static final EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String BASE_URL = EnvironmentSpecificConfiguration.from(env).getProperty("webdriver.base.url");

    public static String getBaseUrl() {
        return BASE_URL;
    }
}
