import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product book1 = new Book(1, "Поэмы", 1000, "Пушкин");
    Product book2 = new Book(2, "Романы", 1500, "Толстой");
    Product book3 = new Book(3, "Романы", 2500, "Достоевский");
    Product smartphone1 = new Smartphone(4, "Смартфон", 500, "Nokia");


    @Test
    public void testRemove() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.removeById(2);

        Product[] expected = {book1, book3, smartphone1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveWhenNoId() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.removeById(5)
        );

    }

    @Test
    public void testFindAll() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);
        repo.findAll();

        Product[] expected = {book1, book2, book3, smartphone1};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindById() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);


        Product[] expected = {book2};
        Product[] actual = new Product[]{repo.findById(2)};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindByIdWhenNoId() {
        ProductRepository repo = new ProductRepository();
        repo.save(book1);
        repo.save(book2);
        repo.save(book3);
        repo.save(smartphone1);


        Product[] expected = {null};
        Product[] actual = new Product[]{repo.findById(5)};

        Assertions.assertArrayEquals(expected, actual);

    }
}
