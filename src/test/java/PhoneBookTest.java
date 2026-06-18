import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBookTest {

    @Test
    void shouldReturnCorrectCountAfterAddingElement() {
        PhoneBook phoneBook = new PhoneBook();

        assertEquals(1, phoneBook.add("Ivan", "1"));
        assertEquals(2, phoneBook.add("Petr", "2"));
        assertEquals(3, phoneBook.add("Sasha", "3"));
    }
}
