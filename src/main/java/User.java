public class User {
    private final String login;
    private final String email;
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+$";

    public User() {
        this.login = "root";
        this.email = "admin@admin.org";
    }

    public User(String login, String email) {
        if (login.equals(email) || !email.matches(EMAIL_REGEX)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
