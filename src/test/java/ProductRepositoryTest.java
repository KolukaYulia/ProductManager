import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Product item1 = new Product(1,"книга", 1000);
    Product item2 = new Product(2, "смартфон", 1500);
    Product item3 = new Product(3, "газета", 500);

    @Test
    public void testRemove() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item3.getId());

        Product[] expected = {item1, item2};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindAll() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.findAll();

        Product[] expected = {item1, item2, item3};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindById() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);


        Product[] expected = {item2};
        Product[] actual = new Product[]{repo.findById(2)};

        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testFindByIdWhenNoId() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);


        Product[] expected = {null};
        Product[] actual = new Product[]{repo.findById(4)};

        Assertions.assertArrayEquals(expected, actual);

    }
}
