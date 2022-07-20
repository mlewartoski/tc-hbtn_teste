package mei;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void show_full_name() {
        Person person = new Person("Paul", "McCartney", new Date(), true, true, true, 0);
        assertEquals(person.fullName(), "Paul McCartney");
    }

    @Test
    void  test_calculateYearlySalary() {
        Person person = new Person("Paul", "McCartney", new Date(), true, true, true, 1200);
        assertEquals(person.calculateYearlySalary(), 14400);
    }

    @Test
    void person_is_MEI() {
        Person person = new Person("Paul", "McCartney", new Date("13/06/1994"), false, false, false, 1200);
        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        Person person = new Person("Paul", "McCartney", new Date("13/06/1994"), true, true, true, 1200);
        assertFalse(person.isMEI());
    }

}