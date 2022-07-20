package mei;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person;

    @BeforeEach
    void setup(){
        person = new Person("Paul", "McCartney", new Date("01/01/2000"), true, true, true, 0);
    }

    @Test
    void show_full_name() {
        assertEquals(person.fullName(), "Paul McCartney");
    }

    @Test
    void  test_calculateYearlySalary() {
        person.setSalary(1200);
        assertEquals(person.calculateYearlySalary(), 14400);
    }

    @Test
    void person_is_MEI() {
        person.setSalary(1200);
        person.setAnotherCompanyOwner(false);
        person.setPensioner(false);
        person.setPublicServer(false);
        assertTrue(person.isMEI());
    }

    @Test
    void person_is_not_MEI() {
        assertFalse(person.isMEI());
    }

}