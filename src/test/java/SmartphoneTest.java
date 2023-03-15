import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SmartphoneTest {

    @Test
    public void setProducer() {
        Smartphone Smartphone = new Smartphone(1, "Смартфон", 500,  "Nokia");

        Smartphone.setProducer("Nokia");

        String expected = "Nokia" ;
        String actual = Smartphone.getProducer();

        Assertions.assertEquals(expected, actual);

    }
}
