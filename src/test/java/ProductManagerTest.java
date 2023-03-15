import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    Product book1 = new Book(1, "Поэмы", 1000, "Пушкин");
    Product book2 = new Book(2, "Романы", 1500, "Толстой");
    Product smartphone1 = new Smartphone(3, "Смартфон", 500, "Nokia");

    @BeforeEach
    public void setup() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartphone1);
    }

    @Test
    public void shouldSearch() {
        Product[] expected = {book1};
        Product[] actual = manager.searchBy("Поэмы");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMatchesTrue() {
        boolean expected = true;
        boolean actual = manager.matches(book1, "Поэмы");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldMatchesFalse() {
        boolean expected = false;
        boolean actual = manager.matches(book1, "Романы");

        Assertions.assertEquals(expected, actual);


    }
}
