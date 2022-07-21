import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PersonTest {

    Person person;

    @BeforeAll
    void setup(){
        person = new Person();
    }

    @ParameterizedTest()
    @ValueSource(strings = {"PaulMcCartney2", "NeilArms2"})
    void check_user_valid(String user){
        person.setUser(user);
        assertTrue(person.checkUser());
    }

    @ParameterizedTest()
    @ValueSource(strings = {"Paul#McCartney", "Neil@Arms"})
    void check_user_not_valid(String user){
        person.setUser(user);
        assertFalse(person.checkUser());
    }

    @ParameterizedTest()
    @ValueSource(strings = {"123456789", "#$%1234"})
    void does_not_have_letters(String password){
        person.setPassword(password);
        assertFalse(person.checkPassword());
    }

    @ParameterizedTest()
    @ValueSource(strings = {"Abcabcdefgh@", "#hbtn@%tc"})
    void does_not_have_numbers(String password){
        person.setPassword(password);
        assertFalse(person.checkPassword());
    }

    @ParameterizedTest()
    @ValueSource(strings = {"Abc@123", "12$@hbt"})
    void does_not_have_eight_chars(String password){
        person.setPassword(password);
        assertFalse(person.checkPassword());
    }

    @ParameterizedTest()
    @ValueSource(strings = {"abC123456$", "Hbtn@1234", "Betty@1#2", "Hbtn@123"})
    void check_password_valid(String password){
        person.setPassword(password);
        assertTrue(person.checkPassword());
    }

    /*

    Crie o teste Parametrizado does_not_have_letters() que testa o metodo check_password() com os sequintes valores:
            “123456789”, “#$%1234”

    Crie o teste Parametrizado does_not_have_numbers() que testa o metodo check_password() com os sequintes valores:
            “Abcabcdefgh@”, “#hbtn@%tc”

    Crie o teste Parametrizado does_not_have_eight_chars() que testa o metodo check_password() com os sequintes valores:
            “Abc@123”, “12$@hbt”

    Crie o teste Parametrizado check_password_valid() que valida a o método check_password() e deve passar no teste para os sequintes valores:

            “abC123456$”, “Hbtn@1234”, “Betty@1#2”, “Hbtn@123”

*/
}