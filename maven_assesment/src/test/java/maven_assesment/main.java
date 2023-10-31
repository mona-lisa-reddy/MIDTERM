package maven_assesment;

import static org.junit.Assert.*;
import org.junit.Test;

public class main {

    @Test
    public void testValidLogin() {
        assertTrue(revanth.validateLogin("revanth", "123"));
    }


    @Test
    public void testInvalidIDE() {
        assertFalse(revanth.validateLogin("revanth", "wrongpassword"));
    }

    @Test
    public void testUsernameNotFound() {
        assertFalse(revanth.validateLogin("nonexistentuser", "wrongpassword"));
    }
}
