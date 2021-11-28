package Day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HumanTest {

    @Test
    void testCreate() {
        Human human = new Human("John Doe", 1985);
        assertEquals("John Doe", human.getName());
        assertEquals(1985, human.getYearOfBirth());
    }

    @Test
    void testWrongName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("JohnDoe", 1985));
        assertEquals("Enter a firstname and a lastname as well.", exception.getMessage());
    }

    @Test
    void testWrongAge() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new Human("John Doe", 1900));
        assertEquals("Your age can't be higher than 120 years.", exception.getMessage());
    }


}