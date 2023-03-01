import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static final String CORRECT_LOGIN = "legIsCramped";
    public static final String CORRECT_EMAIL = "ramamba@hara.mamburum";
    public static final String DEFAULT_LOGIN = "root";
    public static final String DEFAULT_EMAIL = "admin@admin.org";
    public static final String EMAIL_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+$";

    private User out;

    @Test
    public void shouldCreateUserWhenParametersIsCorrect() {
        out = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(CORRECT_LOGIN, out.getLogin());
        assertEquals(CORRECT_EMAIL, out.getEmail());
    }

    @Test
    public void emailValidation() {
        out = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertTrue(out.getEmail().matches(EMAIL_REGEX));
    }

    @Test
    public void LoginAndEmailMustNotBeEquals() {
        out = new User();
        assertNotEquals(out.getEmail(), out.getLogin());
        out = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertNotEquals(out.getEmail(), out.getLogin());
    }

    @Test
    public void shouldCreateUserWhenParametersIsNotExists() {
        out = new User();
        assertEquals(DEFAULT_LOGIN, out.getLogin());
        assertEquals(DEFAULT_EMAIL, out.getEmail());
    }
}