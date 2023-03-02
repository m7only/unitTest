import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static final String CORRECT_LOGIN = "legIsCramped";
    public static final String CORRECT_EMAIL = "ramamba@hara.mamburum";
    public static final String INCORRECT_EMAIL = "ramambahara.mamburum";

    public static final String DEFAULT_LOGIN = "root";
    public static final String DEFAULT_EMAIL = "admin@admin.org";

    private User out;

    @Test
    public void shouldCreateUserWhenParametersIsCorrect() {
        out = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(CORRECT_LOGIN, out.getLogin());
        assertEquals(CORRECT_EMAIL, out.getEmail());
    }

    @Test
    public void shouldCreateUserWhenParametersIsNotExists() {
        out = new User();
        assertEquals(DEFAULT_LOGIN, out.getLogin());
        assertEquals(DEFAULT_EMAIL, out.getEmail());
    }

    @Test
    public void emailValidation() {
        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, INCORRECT_EMAIL));
        assertDoesNotThrow(() -> new User(CORRECT_LOGIN, CORRECT_EMAIL));
    }

    @Test
    public void loginAndEmailMustNotBeEquals() {
        assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, CORRECT_LOGIN));
    }
}