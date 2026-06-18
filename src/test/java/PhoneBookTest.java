import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    void shouldReturnCorrectCountAfterAddingElement() {
        PhoneBook phoneBook = new PhoneBook();

        assertEquals(1, phoneBook.add("Ivan", "1"));
        assertEquals(2, phoneBook.add("Petr", "2"));
        assertEquals(3, phoneBook.add("Sasha", "3"));
    }

    @Test
    void shouldReturnNameWhenPhoneNumberExists() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivan", "1");

        assertEquals("Ivan", phoneBook.findByNumber("1"));
    }

    @Test
    void shouldReturnPhoneNumberWhenNameExists() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivan", "1");

        assertEquals("1", phoneBook.findByName("Ivan"));
    }

    @Test
    void shouldReturnNamesInAlphabeticalOrder() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivan", "1");
        phoneBook.add("Petr", "2");
        phoneBook.add("Anna", "3");

        List<String> actual = phoneBook.printAllNames();
        List<String> expected = List.of("Anna", "Ivan", "Petr");

        assertEquals(expected, actual);
    }
}
