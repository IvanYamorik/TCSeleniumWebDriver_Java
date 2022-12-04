package parser;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import shop.Cart;

import java.io.File;

public class JsonParserTests {
    @Test
    void readFromFile_worksCorrectly() {
        Parser parser = new JsonParser();
        Cart cartFromFile = parser.readFromFile(new File("src/main/resources/eugen-cart.json"));
        assertEquals("eugen-cart", cartFromFile.getCartName());
    }
}
