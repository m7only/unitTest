public class User {
    private final String login;
    private final String email;

    public User() {
        this.login = "root";
        this.email = "admin@admin.org";
    }

    public User(String login, String email) {
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
