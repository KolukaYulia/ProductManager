import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void setId() {
        Book book = new Book(1, "Поэмы", 500, "Пушкин");

        book.setId(1);

        int expected = 1;
        int actual = book.getId();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setName() {
        Book book = new Book(1, "Поэмы", 500, "Пушкин");

        book.setName("Поэмы");

        String expected = "Поэмы";
        String actual = book.getName();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setPrice() {
        Book book = new Book(1, "Поэмы", 500, "Пушкин");

        book.setPrice(500);

        int expected = 500;
        int actual = book.getPrice();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void setAuthor() {
        Book book = new Book(1, "Поэмы", 500, "Пушкин");

        book.setAuthor("Пушкин");

        String expected = "Пушкин";
        String actual = book.getAuthor();

        Assertions.assertEquals(expected, actual);

    }

}


