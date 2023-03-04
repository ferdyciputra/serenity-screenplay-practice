package swaglabs.model;

public enum SwaglabsUser {
    VALID_USER("standard_user", "secret_sauce"),
    INVALID_USER("invalid_user", "invalid_password");

    public final String username;
    public final String password;

    SwaglabsUser(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
